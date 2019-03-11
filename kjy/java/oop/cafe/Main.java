package coffee;

public class Main {
	public static void main(String []args){
		Menu menu= new Menu();
		menu.addMenu(new MenuItem("아메리카노",3000));
		menu.addMenu(new MenuItem("카페라때",4000));
		menu.addMenu(new MenuItem("핫초코",4500));
		menu.addMenu(new MenuItem("녹차",4500));
		
		Baristar baristar = new Baristar("곽준영",5000);
		
		Customer customer = new Customer("손놈",10000);
		
		customer.order(menu, baristar);
		
	}

}
