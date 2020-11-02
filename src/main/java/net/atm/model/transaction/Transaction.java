package net.atm.model.transaction;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Formatter;

import net.atm.transactions.TransactionType;

public class Transaction {
	
	public int id;
	
	public String type;
	
	public LocalDate dateTime;
	
	public boolean transactionSuccess;
	
	public double transactionAmount;
	
	public Transaction(int id, String type, double transactionAmount) {
		this.id = id;
		this.type = type.toString();
		this.dateTime = LocalDate.now();
		this.transactionAmount = transactionAmount;
	}
	
	public int getId() {
		return id;
	}
	
	public String getType() {
		return type;
	}
	
	public LocalDate getDateTime() {
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
