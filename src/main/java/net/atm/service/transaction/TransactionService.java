package net.atm.service.transaction;

import java.util.List;

import net.atm.doa.transaction.TransacDoaImpl;
import net.atm.doa.transaction.TransaxDoa;
import net.atm.model.transaction.Transaction;

public class TransactionService {
    
    private final TransaxDoa tdi;

    public TransactionService(){
        tdi = new TransacDoaImpl();
    }

    public void insertTransac(Transaction transac) {
        tdi.insertTransac(transac);
    }

    public void updateTransac(Transaction transac) {
        tdi.updateTransac(transac);
    }

    public void deleteTransac(int id) {
        tdi.deleteTransac(id);
    }

    public List<Transaction> selectAllTransac(){
        return tdi.selectAllTransac();
    } 

    public Transaction selectTransac(int id) {
        return tdi.selectTransac(id);
    }
}
