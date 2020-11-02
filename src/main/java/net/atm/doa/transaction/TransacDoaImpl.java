package net.atm.doa.transaction;

import java.util.List;

import org.jdbi.v3.core.Jdbi;
import org.jdbi.v3.sqlobject.SqlObjectPlugin;
import org.jdbi.v3.core.spi.JdbiPlugin;

import net.atm.model.transaction.Transaction;

public class TransacDoaImpl implements TransaxDoa {
    private  final Jdbi  jdbi = Jdbi.create("jdbc:postgresql://localhost:5432/bank", "thaabit", "1234");

    public TransacDoaImpl(){
        jdbi.installPlugin((JdbiPlugin) new SqlObjectPlugin());
    }
    @Override
    public void insertTransac(Transaction transac) {
        jdbi.useExtension(TransaxDoa.class, doa -> doa.insertTransac(transac));

    }

    @Override
    public void updateTransac(Transaction transac) {
        jdbi.useExtension(TransaxDoa.class, doa -> doa.updateTransac(transac));
    }

    @Override
    public void deleteTransac(int id) {
        jdbi.useExtension(TransaxDoa.class, doa -> doa.deleteTransac(id));
    }

    @Override
    public List<Transaction> selectAllTransac(){
        jdbi.registerRowMapper(Transaction.class, (rs, ctx) -> new Transaction(rs.getInt("id"), rs.getString("transac_type"), rs.getDouble("transaction_amount")));
        return jdbi.withExtension(TransaxDoa.class, doa -> doa.selectAllTransac());
    } 

    @Override
    public Transaction selectTransac(int id) {
        jdbi.registerRowMapper(Transaction.class, (rs, ctx) -> new Transaction(rs.getInt("id"), rs.getString("transac_type"), rs.getDouble("transaction_amount")));
        return jdbi.withExtension(TransaxDoa.class, doa -> doa.selectTransac(id));
    }

}
