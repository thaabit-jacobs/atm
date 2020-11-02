package net.atm.model.account;

import java.time.LocalDate;

import net.atm.account.AccountSupport;
import net.atm.types.AccountType;

public class Account {
	
	public  int id;
	
	public String accountName;
	
	public String accountType;
	
	public int accountNum;
	
	public LocalDate dateCreated;
	
	public double balance;

	
	public Account(int id, String accountName, String type, double balance) {
		this.id = id;
		this.accountName = accountName;
		this.accountType = type.toString();
		this.dateCreated = LocalDate.now();
		this.accountNum = new AccountSupport().generateAccountNum();
		this.balance = balance;
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
	
	public LocalDate getDateCreated() {
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

	public void setDateCreated(LocalDate dateCreated){
		this.dateCreated = dateCreated;
	}

}
