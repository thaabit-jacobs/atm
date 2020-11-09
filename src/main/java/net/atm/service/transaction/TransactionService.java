package net.atm.service.transaction;

import java.time.LocalDateTime;
import java.util.List;

import net.atm.doa.transaction.TransacDoaImpl;
import net.atm.doa.transaction.TransaxDoa;
import net.atm.model.account.Account;
import net.atm.model.transaction.Transaction;
import net.atm.types.TransactionType;

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

    public double getAccountBalance(Account account){
        int lastTransacId = selectAllTransac().get(selectAllTransac().size() - 1).getId() + 1;

        if(selectAllTransac().size() == 0)
           insertTransac(new Transaction(1, TransactionType.BalanceEnquiry.toString(), true, account.getBalance(), LocalDateTime.now(), account.getId()));
        else
            insertTransac(new Transaction(lastTransacId, TransactionType.BalanceEnquiry.toString(), true, account.getBalance(), LocalDateTime.now(), account.getId()));

        return account.getBalance();
    }

    public boolean deposit(Account account, double depositAmount){
        int lastTransacId = selectAllTransac().get(selectAllTransac().size() - 1).getId() + 1;

        if(depositAmount <= 0){
            if(selectAllTransac().size() == 0)
                insertTransac(new Transaction(1, TransactionType.Deposit.toString(), false,depositAmount, LocalDateTime.now(), account.getId()));
            else
                insertTransac(new Transaction(lastTransacId, TransactionType.Deposit.toString(), false, depositAmount, LocalDateTime.now(), account.getId()));

            return false;
        }

        account.setAvailibleBalance(account.getBalance() + depositAmount);

        if(selectAllTransac().size() == 0)
            insertTransac(new Transaction(1, TransactionType.Deposit.toString(), true, depositAmount, LocalDateTime.now(), account.getId()));
        else
            insertTransac(new Transaction(lastTransacId, TransactionType.Deposit.toString(), true, depositAmount, LocalDateTime.now(), account.getId()));

        return true;
    }

    public boolean withdrawal(Account account, double withdrawalAmount){
        int lastTransacId = selectAllTransac().get(selectAllTransac().size() - 1).getId() + 1;

        if(withdrawalAmount <= 0){
            if(selectAllTransac().size() == 0)
                insertTransac(new Transaction(1, TransactionType.Withdrawal.toString(), false, withdrawalAmount, LocalDateTime.now(), account.getId()));
            else
                insertTransac(new Transaction(lastTransacId, TransactionType.Withdrawal.toString(), false, withdrawalAmount, LocalDateTime.now(), account.getId()));

            return false;
        }

        account.setAvailibleBalance(account.getBalance() + withdrawalAmount);

        if(selectAllTransac().size() == 0)
            insertTransac(new Transaction(1, TransactionType.Withdrawal.toString(), true, withdrawalAmount, LocalDateTime.now(), account.getId()));
        else
            insertTransac(new Transaction(lastTransacId,TransactionType.Withdrawal.toString(), true, withdrawalAmount, LocalDateTime.now(), account.getId()));

        return true;
    }
}
