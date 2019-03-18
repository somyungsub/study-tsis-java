package bank.bank;

import bank.account.KBAccount;

public class WRBank extends Bank{
	public WRBank(){
		super("WR");
	}
	public void addAccountName(String name){
		super.addAccount(new KBAccount(name, 0));
	}
}
