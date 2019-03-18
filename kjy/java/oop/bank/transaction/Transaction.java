package bank.transaction;

import java.util.Date;

public class Transaction {
	private int transactionNum;
	private String regDate;
	private String regTime;
	private int accountNum;
	private String bankName;
	private int money;
	private String type;
	
	public Transaction(int transactionNum, int accountNum, String bankName, int mony, String type){
		this.transactionNum = transactionNum;
		this.accountNum = accountNum;
		this.bankName = bankName;
		this.money = mony;
		this.type = type;
		Date now = new Date();
		
		regDate = now.getYear()+"-"+now.getMonth()+":"+now.getDate();
		regTime = now.getHours()+":"+now.getMonth()+":"+now.getSeconds();
		
	}
	public void display(){
		System.out.println("은행 : "+bankName+" 계좌 : "+accountNum+" 금액 : "+money+" 구분 : "+type+" 거래일자 : "+regDate+" 거래시간 : "+regTime);
	}
}
