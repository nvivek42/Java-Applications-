package com;

import java.time.LocalDate;
import static utils.ValidationRules.*;
import custom_exceptions.BankingException;

public class BankAccount {

	private int acctNo;
	private AccountType accType;
	private double balance;
	private LocalDate creationDate;
	private String customerName;
	public BankAccount(int acctNo, AccountType accType, double balance, LocalDate creationDate, String customerName) {
		super();
		this.acctNo = acctNo;
		this.accType = accType;
		this.balance = balance;
		this.creationDate = creationDate;
		this.customerName = customerName;
	}
	@Override
	public String toString() {
		return "BankAccount [acctNo=" + acctNo + ", accType=" + accType + ", balance=" + balance + ", creationDate="
				+ creationDate + ", customerName=" + customerName + "]";
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	public void withdraw(double amount) throws BankingException{
		validateBalance(balance-amount);
		balance -= amount;
	}
	public void transferFunds(BankAccount destAcNo,double amount) throws BankingException {
		this.withdraw(amount);
		destAcNo.deposit(amount);
	}
	
	public int getAcctNo() {
		return acctNo;
	}
	public void setAcctNo(int acctNo) {
		this.acctNo = acctNo;
	}
	public AccountType getAccType() {
		return accType;
	}
	public void setAccType(AccountType accType) {
		this.accType = accType;
	}
	public double getBalance() {
		return balance;
	}
	
	
	
}
