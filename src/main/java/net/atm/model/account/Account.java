package net.atm.model.account;

import java.time.LocalDate;
import java.time.LocalDateTime;

import net.atm.account.AccountSupport;
import net.atm.types.AccountType;

public class Account {
	
	public  int id;
	
	public String accountName;
	
	public String accountType;
	
	public int accountNum;
	
	public double balance;

	public LocalDateTime dateCreated;

	
	public Account(int id, String accountName, String accountType, int accountNum, double balance, LocalDateTime dateCreated) {
		this.id = id;
		this.accountName = accountName;
		this.accountType = accountType.toString();
		this.accountNum =  accountNum;
		this.balance = balance;
		this.dateCreated = dateCreated;
	}
	
	public int getId() {
		return id;
	}
	
	public String getAccountName() {
		return accountName;
	}
	
	public String getAccountType() {
		return accountType.toString();
	}
	
	public int getAccountNum() {
		return accountNum;
	}
	
	public LocalDateTime getDateCreated() {
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
		this.accountType = type.toString();
	}
	
	public void setAvailibleBalance(double balance) {
		this.balance = balance;
	}

	public void setAccountNum(int accountNum) {
		this.accountNum = accountNum;
	}

	public void setDateCreated(LocalDateTime dateCreated){
		this.dateCreated = dateCreated;
	}

}
