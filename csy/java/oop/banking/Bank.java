package banking;

import java.util.Scanner;

public class Bank implements IBank{

	Scanner scan = new Scanner(System.in);
	
	/**
	 * 계좌 생성
	 */
	@Override
	public Account createAccount() {

		System.out.println("이름을 입력해 주세요.");		
		String customer_name = scan.next();

		System.out.println("통장 종류를 선택해 주세요.");
		System.out.println("1.예금통장");
		System.out.println("2.적금통장");
		System.out.println("3.입출금통장");		
		String type = scan.next();
		
		System.out.println("개설한 통장에 카드를 연결하시겠습니까?");		
		String card_yn = scan.next();
		
		System.out.println("통장개설시 입금 최소금액은 1000원입니다. 얼마를 입금할까요?");
		int balance = scan.nextInt();
		
		Account account = new Account(customer_name, balance, type, card_yn);
		System.out.println(account.toString());
		return account;
	}

	/**
	 * 잔액조회
	 * @param account 
	 */
	@Override
	public void checkBalance(Account account) {		
		System.out.println("입력한 계좌의 잔액은 " + account.getBalance() + "원 입니다.");
	}

	/**
	 * 입금
	 * @param selectAccount
	 */
	@Override
	public Account deposit(Account account) {
		System.out.println("입금할 금액을 입력해주세요.");
		int balance = scan.nextInt();
		
		System.out.println(account.getAccount_num());
		System.out.println("입금할 계좌를 한번 더 확인해주세요. 계좌번호가 맞습니까? y/n");
		String answer = scan.next();
		
		if("y".equals(answer)) {
			account.setBalance(account.getBalance() + balance);
		}
		//취소했을 경우
		return account;
		
	}

	@Override
	public void transfer() {
		// TODO Auto-generated method stub
		
	}
	
}
