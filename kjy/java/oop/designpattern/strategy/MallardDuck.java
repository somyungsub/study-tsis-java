package designpattern.strategy;

import designpattern.strategy.fly.FlyWithWings;
import designpattern.strategy.quack.Quack;

public class MallardDuck extends Duck{

	public MallardDuck(){
		super.quackBehavior = new Quack();
		super.flyBehavior = new FlyWithWings();
	}
	@Override
	public void display() {
		System.out.println("MallardDuck 입니다.");
		
	}
	
}
