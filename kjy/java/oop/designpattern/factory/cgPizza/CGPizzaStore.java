package designpattern.factory.cgPizza;

import designpattern.factory.Pizza;
import designpattern.factory.PizzaStore;

public class CGPizzaStore extends PizzaStore{
	public Pizza createPizza(String item){
		if(item.equals("cheese")){
			return new CGStyleCheesePizza();
		}else if(item.equals("veggie")){
			return new CGStyleVeggiePizza();
		}else if(item.equals("clam")){
			return new CGStyleClamPizza();
		}else if(item.equals("pepperoni")){
			return new CGStylePepperoniPizza();
		}else return null;
	}

}
