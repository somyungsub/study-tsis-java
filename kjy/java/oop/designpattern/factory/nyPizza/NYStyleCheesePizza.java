package designpattern.factory.nyPizza;

import designpattern.factory.Pizza;
import designpattern.factory.PizzaIngredientFactory;

public class NYStyleCheesePizza extends Pizza{
	PizzaIngredientFactory ingredientFactory;
	
	public NYStyleCheesePizza(PizzaIngredientFactory ingredientFactory){
		this.ingredientFactory = ingredientFactory;
	}
	public NYStyleCheesePizza(){
		pizzaName = "뉴욕 스타일 치즈 피자";
	}
}
