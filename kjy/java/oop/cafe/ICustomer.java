package coffee;

public interface ICustomer {
	public MenuItem show(Menu menu);
	public Coffee order(Menu menu, Baristar baristar);
	public int cost(Baristar baristar, int cost);
	

}
