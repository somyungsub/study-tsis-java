package designpattern.strategy.quack;

public class MuteQuack implements QuackBehavior{

	public void quack() {
		System.out.println("음음음");
		
	}

}
