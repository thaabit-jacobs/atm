package net.atm.doa.transaction;

import java.sql.Date;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;

import net.atm.types.TransactionType;
import org.jdbi.v3.core.Jdbi;
import org.jdbi.v3.core.spi.JdbiPlugin;
import org.jdbi.v3.sqlobject.SqlObjectPlugin;

import net.atm.model.transaction.Transaction;

public class TransacDoaImpl implements TransaxDoa {
    private  final Jdbi  jdbi = Jdbi.create("jdbc:postgresql://localhost:5432/bank", "thaabit", "1234");

    public TransacDoaImpl(){
       // jdbi.installPlugin((JdbiPlugin) new SqlObjectPlugin());
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
        jdbi.registerRowMapper(Transaction.class, (rs, ctx) -> new Transaction(rs.getInt("id"), rs.getString("transac_type"), rs.getBoolean("transaction_success"), rs.getDouble("transaction_amount"),  new Timestamp(rs.getDate("date_time").getTime()).toLocalDateTime(), rs.getInt("account_id")));
        return jdbi.withExtension(TransaxDoa.class, doa -> doa.selectAllTransac());
    } 

    @Override
    public Transaction selectTransac(int id) {
        jdbi.registerRowMapper(Transaction.class, (rs, ctx) -> new Transaction(rs.getInt("id"), rs.getString("transac_type"), rs.getBoolean("transaction_success"), rs.getDouble("transaction_amount"),  new Timestamp(rs.getDate("date_time").getTime()).toLocalDateTime(), rs.getInt("account_id")));
        return jdbi.withExtension(TransaxDoa.class, doa -> doa.selectTransac(id));
    }

    public static void main(String[] args) {
        TransacDoaImpl c = new TransacDoaImpl();
        //c.insertTransac(new Transaction(1, TransactionType.Deposit.toString(), true, 0.00, LocalDateTime.now(), 1));
    }

}
