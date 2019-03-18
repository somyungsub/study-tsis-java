package bank.transaction;

import java.util.ArrayList;
import java.util.List;

public class TransactionList {
	private List<Transaction> transactionList;
	public TransactionList(){
		transactionList = new ArrayList<Transaction>();
	}
	public int getTransactionNum(){
		return transactionList.size();
	}
	public void addTransaction(Transaction transaction){
		transactionList.add(transaction);
	}
	public List<Transaction> getList(){
		return transactionList;
	}
	public void desplay(){
		for(int i = 0;i<transactionList.size();i++){
			transactionList.get(i).display();
		}
	}

}
