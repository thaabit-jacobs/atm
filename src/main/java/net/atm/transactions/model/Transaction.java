package net.atm.transactions.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Formatter;

import net.atm.account.Account;
import net.atm.transactions.TransactionType;
import net.atm.types.AccountType;

public class Transaction {
	
	private int id;
	
	private String type;
	
	private LocalDateTime dateTime;
	
	private boolean transactionSuccess;
	
	private double transactionAmount;
	
	public Transaction(int id, TransactionType type, double transactionAmount) {
		this.id = id;
		this.type = type.toString();
		this.dateTime = LocalDateTime.now();
		this.transactionAmount = transactionAmount;
	}
	
	public int getId() {
		return id;
	}
	
	public String getType() {
		return type;
	}
	
	public LocalDateTime getDateTime() {
		return dateTime;
	}
	
	public boolean getTransactionSuccess() {
		return transactionSuccess;
	}
	
	public double getTransactionAmount() {
		return transactionAmount;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	public void setType(TransactionType type){
		this.type = type.toString();
	}

	public void setTransactionSuccess(boolean transactionSuccess){
		this.transactionSuccess = transactionSuccess;
	}

	public void setTransactionAmount(double transactionAmount){
		this.transactionAmount = transactionAmount;
	}

	public String toString() {
		DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
		Formatter f = new Formatter();

		String receipt = f.format("Transaction type: %s \nTransanction amount: R%.2f \nTransanction sucess: %b \nDate: %s", type.toString(), transactionAmount, transactionSuccess, formatter.format(dateTime)).toString();
		
		f.close();
		
		return receipt;
	}
}
