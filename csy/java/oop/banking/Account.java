package banking;

import java.util.Random;

public class Account {
	public String type;
	public String cust_nm;
	public String account_num;
	public int balance;
	public String card_yn;
	
	/**
	 * 생성자
	 * @param name
	 * @param balance 
	 * @param type2 
	 */
	public Account(String name, int balance, String type2, String card_yn) {
		cust_nm = name;
		account_num = String.valueOf(new Random().nextLong());
		this.balance = balance;
		type = type2;
		this.card_yn = card_yn;
	}

	/**
	 * getter/setter
	 */
	public final String getType() {
		return type;
	}

	public final void setType(String type) {
		this.type = type;
	}

	public final String getCust_nm() {
		return cust_nm;
	}

	public final void setCust_nm(String cust_nm) {
		this.cust_nm = cust_nm;
	}

	public final String getAccount_num() {
		return account_num;
	}

	public final void setAccount_num(String account_num) {
		this.account_num = account_num;
	}

	public final int getBalance() {
		return balance;
	}

	public final void setBalance(int balance) {
		this.balance = balance;
	}

	public final String getCard_yn() {
		return card_yn;
	}

	public final void setCard_yn(String card_yn) {
		this.card_yn = card_yn;
	}
	
	
	@Override
	public String toString() {
		return 	"통장이 생성되었습니다.\n" + "예금주 : " + cust_nm + "\n계좌번호 : " + account_num + "\\n통장종류 : " + type + "\\n잔액 : " + balance;
	}
	

}
