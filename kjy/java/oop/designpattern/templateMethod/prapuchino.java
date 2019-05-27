package designpattern.templateMethod;

import java.util.Scanner;

public class prapuchino extends CoffeineBeverage{
	public void brew(){
		System.out.println("얼음을 간다.");
	}
	
	public void addCondimenta(){
		System.out.println("초콜렛을 넣는다.");
	}
	
	public void customerWantsCondiments(){
		System.out.println("휘핑크림 올려드릴까요? (y/n)");
		Scanner s = new Scanner(System.in);
		String value = s.next();
		if("y".equals(value)){
			System.out.println("휘핑크림을 올린다.");
		}else{
		}
	}
}
