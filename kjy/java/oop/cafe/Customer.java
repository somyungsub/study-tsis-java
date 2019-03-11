package coffee;

import java.util.Scanner;

public class Customer implements ICustomer{

	public String name;
	public int money;
	
	public Customer(String name, int money){
		this.name = name;
		this.money = money;
		System.out.println("손님이 입장하였습니다.");
	}
	@Override
	public MenuItem show(Menu menu) {
		// TODO Auto-generated method stub
		System.out.println("메뉴판을 봅니다.");
		System.out.println("메뉴판");
		for(int i = 0; i<menu.menuItems.size();i++){
			System.out.println("메뉴 : "+menu.menuItems.get(i).name+" 가격 : "+menu.menuItems.get(i).cost);
		}
		System.out.println("메뉴이름을 입력하세요.");
		Scanner s = new Scanner(System.in);
		String name = s.nextLine();
		
		MenuItem menuItem = null;
		for(int i = 0; i<menu.menuItems.size();i++){
			if(menu.menuItems.get(i).name.equals(name)){
				menuItem = menu.menuItems.get(i);
			}
		}
		return menuItem;
	}

	@Override
	public Coffee order(Menu menu, Baristar baristar) {
		// TODO Auto-generated method stub
		MenuItem menuItem = show(menu);
		Coffee coffee = baristar.makeCoffee(menuItem);
		cost(baristar, menuItem.cost);
		return null;
	}

	@Override
	public int cost(Baristar baristar, int cost) {
		// TODO Auto-generated method stub
		System.out.println(cost+" 금액을 지불하였습니다.");
		baristar.change(cost);
		return 0;
	}
	

}
