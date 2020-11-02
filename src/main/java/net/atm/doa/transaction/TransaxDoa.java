package net.atm.doa.transaction;

import java.util.List;

import org.jdbi.v3.sqlobject.customizer.Bind;
import org.jdbi.v3.sqlobject.customizer.BindBean;
import org.jdbi.v3.sqlobject.statement.SqlQuery;
import org.jdbi.v3.sqlobject.statement.SqlUpdate;

import net.atm.model.transaction.Transaction;

public interface TransaxDoa {

    @SqlUpdate("insert into transactions (id, transac_type, date_time, transaction_success, transaction_amount) values(:id, :type, :dateTime, :transactionSuccess, :transactionAmount)")
    void insertTransac(@BindBean Transaction transac);

    @SqlUpdate("update transactions set transac_type=:type, date_time=:dateTime, transaction_success=:transactionSuccess, transaction_amount=:transactionAmount where id=:id")
    void updateTransac(@BindBean Transaction transac);

    @SqlUpdate("delete from transactions where id=:id")
    void deleteTransac(@Bind("id") int id);

    @SqlQuery("select * from transactions where id=:id")
    Transaction selectTransac(@Bind("id")int id); 

    @SqlQuery("select * from transactions")
    List<Transaction> selectAllTransac(); 

}