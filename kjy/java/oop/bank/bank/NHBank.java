package bank.bank;

import bank.account.KBAccount;
import bank.account.NHAccount;

public class NHBank extends Bank{
	public NHBank(){
		super("NH");
	}
	public void addAccountName(String name){
		super.addAccount(new NHAccount(name, 0));
	}
}
