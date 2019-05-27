package designpattern.templateMethod;

public class Coffee extends CoffeineBeverage{
	public void brew(){
		System.out.println("커피를 우려낸다.");
	}
	
	public void addCondimenta(){
		System.out.println("바닐라 시럽 촵촵.");
	}

}
