package banking;

import java.util.ArrayList;
import java.util.Scanner;

public class Banking {
	
	public static ArrayList<Account> accList = new ArrayList<Account>();
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		boolean isExit = false;
		do{
			System.out.println("====== CHABANK ======");
			System.out.println("1. 계좌생성");
			System.out.println("2. 잔액조회");
			System.out.println("3. 입금");
			System.out.println("5. 이체");
			System.out.println("8. 종료");
			int menu = scan.nextInt();			
			Bank bank = new Bank();
			
			switch(menu){
				case 1:
					System.out.println("계좌생성을 시작합니다.");
					accList.add(bank.createAccount());
					break;
				case 2:
					System.out.println("잔액조회할 계좌를 입력하세요.");
					bank.checkBalance(selectAccount(scan.next()));
					break;
				case 3:
					System.out.println("입금할 계좌를 입력하세요.");
					bank.deposit(selectAccount(scan.next()));
					
					break;
				case 5:
					System.out.println("계좌이체를 진행합니다.");
					bank.transfer();
					break;
				case 8:
					System.out.println("8. 종료");
					isExit = true;
					break;
				default:
					System.out.println("잘못 선택하셨습니다.");
				}
		}while(!isExit);
	}
	
	public static Account selectAccount(String acc_num) {
		int retrunI = 0;
		for(int i = 0; i < accList.size(); i++) {
			if(acc_num.equals(accList.get(i).getAccount_num())) {
				retrunI = i;
			}
		}
		return accList.get(retrunI);
	}
}
