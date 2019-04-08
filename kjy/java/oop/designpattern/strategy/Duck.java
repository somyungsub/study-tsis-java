package designpattern.strategy;

import designpattern.strategy.fly.FlyBehavior;
import designpattern.strategy.quack.QuackBehavior;

public abstract class Duck {
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	public void performQuack(){
		quackBehavior.quack();
	}
	
	public void swim(){
		System.out.println("수영수영");
	}
	
	public void performFly(){
		flyBehavior.fly();
	}
	abstract public void display();
}
