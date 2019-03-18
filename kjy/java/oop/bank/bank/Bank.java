package bank.bank;

import java.util.ArrayList;
import java.util.List;

import bank.account.Account;
import bank.transaction.TransactionList;

public class Bank {
	private String bankName;
	private List<Account> accountList;
	private int totalAccountNum;
	public String getBankName() {
		return bankName;
	}
	public List<Account> getAccountList() {
		return accountList;
	}
	public int getTotalAccountNum() {
		return totalAccountNum;
	}
	public Bank(String bankName){
		this.bankName = bankName;
		this.accountList = new ArrayList<Account>();
		this.totalAccountNum = 0;
	}
	public void addAccount(Account account){
		this.accountList.add(account);
		this.totalAccountNum++;
		System.out.println(account.getName()+"님 계좌(계좌번호 : "+account.getAccountNum()+")가 생성되었습니다.");
		System.out.println(account.getBankName()+"은행의 "+account.getAccountName()+" 계좌 입니다.");
	}
	public void addAccountName(String name){
		
	}
	public Account findAccount(int num){
		for(int i = 0;i<accountList.size();i++){
			if(accountList.get(i).getAccountNum() == num){
				return accountList.get(i);
			}
		}
		return null;
	}
	public void deposit(TransactionList tl, int money, Account account){
		account.setBalance(tl, money, "입금");
	}
	public void withdraw(TransactionList tl, int money, Account account){
		account.setBalance(tl, money*(-1), "출금");
	}
}
