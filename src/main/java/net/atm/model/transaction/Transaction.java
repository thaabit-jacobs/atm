package net.atm.model.transaction;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Formatter;

import net.atm.types.TransactionType;

public class Transaction {
	
	public int id;
	
	public String type;
	
	public LocalDateTime dateTime;
	
	public boolean transactionSuccess;
	
	public double transactionAmount;

	private int accountId;
	
	public Transaction(int id, String type, boolean transactionSuccess, double transactionAmount, LocalDateTime dateTime, int accountId) {
		this.id = id;
		this.type = type.toString();
		this.dateTime =  dateTime;
		this.transactionSuccess = transactionSuccess;
		this.transactionAmount = transactionAmount;
		this.accountId = accountId;
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

	public int getAccountId() {
		return accountId;
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

	public void setdateTime(LocalDateTime datetime){
		this.dateTime = datetime;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	@Override
	public String toString() {
		return "Transaction{" +
				"id=" + id +
				", type='" + type + '\'' +
				", dateTime=" + dateTime +
				", transactionSuccess=" + transactionSuccess +
				", transactionAmount=" + transactionAmount +
				'}';
	}
}
