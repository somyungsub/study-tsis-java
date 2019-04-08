package designpattern.strategy;

import designpattern.strategy.fly.FlyNoWay;
import designpattern.strategy.quack.Squeak;

public class RubberDuck extends Duck{
	public RubberDuck(){
		super.quackBehavior = new Squeak();
		super.flyBehavior = new FlyNoWay();
	}

	public void quack(){
		System.out.println("삑삑삑");
	}
	@Override
	public void display() {
		System.out.println("RedheadDuck 입니다.");
		
	}

}
