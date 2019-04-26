package designpattern.decorator;

public class TestBeverage {
	public static void main(String[] args){
		Beverage darkLost = new DarkLost();
		
		Beverage beverage = new Mocha(darkLost);
		beverage = new Milk(beverage);
		beverage = new Whip(beverage);
		
		System.out.println(beverage.getDescription() + " " +beverage.cost());
	}

}
