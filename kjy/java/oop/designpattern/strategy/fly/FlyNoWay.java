package designpattern.strategy.fly;

public class FlyNoWay implements FlyBehavior{

	@Override
	public void fly() {
		System.out.println("훨훨");
		
	}

}
