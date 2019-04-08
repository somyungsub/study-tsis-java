package designpattern.strategy;

import designpattern.strategy.fly.FlyWithWings;
import designpattern.strategy.quack.Quack;

public class RedheadDuck extends Duck{
	public RedheadDuck(){
		super.quackBehavior = new Quack();
		super.flyBehavior = new FlyWithWings();
	}
	@Override
	public void display() {
		System.out.println("RedheadDuck 입니다.");
		
	}
}
