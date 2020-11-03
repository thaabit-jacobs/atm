package net.atm.model.account;

import java.time.LocalDateTime;

import net.atm.types.AccountType;

public class Account {
	
	private  int id;

	private String accountName;

	private String accountType;

	private int accountNum;

	private double balance;

	private LocalDateTime dateCreated;

	private int userId;

	public Account(int id, String accountName, String accountType, int accountNum, double balance, LocalDateTime dateCreated, int userId) {
		this.id = id;
		this.accountName = accountName;
		this.accountType = accountType.toString();
		this.accountNum =  accountNum;
		this.balance = balance;
		this.dateCreated = dateCreated;
		this.userId = userId;
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

	public int getUserId() {
		return userId;
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

	public void setUserId(int userId){
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "Account{" +
				"id=" + id +
				", accountName='" + accountName + '\'' +
				", accountType='" + accountType + '\'' +
				", accountNum=" + accountNum +
				", balance=" + balance +
				", dateCreated=" + dateCreated +
				'}';
	}
}
