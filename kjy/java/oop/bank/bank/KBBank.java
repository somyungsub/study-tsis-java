package bank.bank;

import bank.account.KBAccount;

public class KBBank extends Bank{
	public KBBank(){
		super("KB");
	}
	public void addAccountName(String name){
		super.addAccount(new KBAccount(name, 0));
	}

}
