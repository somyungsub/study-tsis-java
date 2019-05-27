package designpattern.templateMethod;

public abstract class CoffeineBeverage {
	public void prepareRecipe(){
		boilWater();
		brew();
		pourInCup();
		customerWantsCondiments();
		addCondimenta();
	}
	public abstract void brew();
	
	public abstract void addCondimenta();
	
	public void boilWater(){
		System.out.println("물을 끓인다.");
	}
	
	public void pourInCup(){
		System.out.println("컵에 담는다.");
	}
	
	public void customerWantsCondiments(){

	}
}
