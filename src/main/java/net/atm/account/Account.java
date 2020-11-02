package net.atm.account;

import java.time.LocalDate;
import java.util.ArrayList;

import net.atm.transactions.model.Transaction;
import net.atm.types.AccountType;

public class Account {
	
	private int id;
	
	private String accountName;
	
	private String type;
	
	private int accountNum;
	
	private LocalDate dateCreated;
	
	private double balance;
	
	public Account(int id, String accountName, AccountType type) {
		this.id = id;
		this.accountName = accountName;
		this.type = type.toString();
		this.accountNum = new AccountSupport().generateAccountNum();
		this.dateCreated = LocalDate.now();
	}
	
	public int getId() {
		return id;
	}
	
	public String getAccountName() {
		return accountName;
	}
	
	public String getAccountType() {
		return type.toString();
	}
	
	public int getAccountNumber() {
		return accountNum;
	}
	
	public LocalDate getLocalDate() {
		return dateCreated;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	
	public void setAccountType(AccountType type) {
		this.type = type.toString();
	}
	
	public void setAvailibleBalance(double balance) {
		this.balance = balance;
	}
	
	public String toString() {
		return "Name: "  + accountName + "\n" + "Account type: " + type.toString()+ "\n" + "Account num: " + accountNum; 
	}
}

