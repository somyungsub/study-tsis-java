package bank;

import java.util.Scanner;

import bank.account.Account;
import bank.account.KBAccount;
import bank.bank.Bank;
import bank.bank.KBBank;
import bank.bank.NHBank;
import bank.bank.WRBank;
import bank.transaction.TransactionList;

public class BankTest {
	public static void main(String[] args){
		TransactionList tl = new TransactionList();
		Scanner s = new Scanner(System.in);
		Bank b = null;
		System.out.println("은행을 선택하세요.");
		System.out.println("1. KB\n2. 우리\n3. 농협");
		int value = Integer.parseInt(s.nextLine());
		switch(value){
			case 1 :
				b = new KBBank();
				break;
			case 2 :
				b = new WRBank();
				break;
			case 3:
				b = new NHBank();
				break;
		}
		while(true){
			
			System.out.println("기능을 선택하세요");
			System.out.println("1. 계좌생성");
			System.out.println("2. 계좌조회");
			System.out.println("3. 이력조회");
			value = Integer.parseInt(s.nextLine());
			if(value==1){
				System.out.println("이름을 입력하세요.");
				String name = s.nextLine();
				b.addAccountName(name);
			}else if(value==2){
				System.out.println("계좌를 입력하세요.");
				int num = Integer.parseInt(s.nextLine());
				Account account = b.findAccount(num);
				if(account != null){
					System.out.println("기능을 선택하세요");
					System.out.println("1. 입금\n2. 출금");
					num = Integer.parseInt(s.nextLine());
					if(num == 1){
						System.out.println("금액을 입력하세요");
						num = Integer.parseInt(s.nextLine());
						b.deposit(tl, num, account);
					}else if(num == 2){
						System.out.println("금액을 입력하세요");
						num = Integer.parseInt(s.nextLine());
						b.withdraw(tl, num, account);
					}
				}
			}else if(value == 3){
				tl.desplay();
			}
		}
		
	}
}


