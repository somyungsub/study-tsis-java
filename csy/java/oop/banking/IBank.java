package banking;

public interface IBank {

	public Account createAccount();
	public void checkBalance(Account account);
	public Account deposit(Account account);
	void transfer();
	
	/*
	 * ?? 왜 Interface를 만들어서 관리하는지 
	 * 그냥 class 에서 만들어서 사용하면 안되는지??
	 */
}
