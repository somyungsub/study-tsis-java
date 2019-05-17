package designpattern.factory;

import designpattern.factory.cgPizza.CGPizzaStore;
import designpattern.factory.nyPizza.NYPizzaStore;

public class TestPizza {
	public static void main(String[] args){
		PizzaStore nYPizzaStore = new NYPizzaStore();
		PizzaStore cGPizzaStore = new CGPizzaStore();
		
		nYPizzaStore.orderPizza("cheese");
		cGPizzaStore.orderPizza("veggie");
	}
}
