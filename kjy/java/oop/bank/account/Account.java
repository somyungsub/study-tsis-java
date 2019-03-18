package bank.account;

import bank.transaction.Transaction;
import bank.transaction.TransactionList;

public class Account {
	private String name;
	private int accountNum;
	private String bankName;
	private String accountName;
	private int balance;
	public Account(String name, int accountNum, String bankName, String accountName){
		this.name = name;
		this.accountNum = accountNum;
		this.bankName = bankName;
		this.accountName = accountName;
		balance = 0;
	}
	public String getName(){
		return name;
	}
	public int getAccountNum(){
		return accountNum;
	}
	public int getBalance(){
		return balance;
	}
	public String getBankName() {
		return bankName;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setBalance(TransactionList transactionList, int money, String type){
		this.balance = balance+money;
		transactionList.addTransaction(new Transaction(transactionList.getTransactionNum(), accountNum, bankName, money, type));
	}
}
