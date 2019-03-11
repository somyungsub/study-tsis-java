package coffee;

public class Baristar implements IBaristar{
	public String name;
	public int money;

	public Baristar(String name, int money){
		this.name = name;
		this.money = money;
	}
	@Override
	public Coffee makeCoffee(MenuItem menuItem) {
		System.out.println(menuItem.name+" 커피를 만들기 시작합니다.");
		Coffee coffee = new Coffee();
		coffee.name = menuItem.name;
		System.out.println(coffee.name+" 커피를 만들기 시작합니다.");
		return coffee;
	}

	@Override
	public void change(int cost) {
		money += cost;
		
	}

}
