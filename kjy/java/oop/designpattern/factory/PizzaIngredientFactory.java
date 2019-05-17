package designpattern.factory;

import designpattern.factory.cheese.Cheese;
import designpattern.factory.clam.Clams;
import designpattern.factory.dough.Dough;
import designpattern.factory.pepperoni.Pepperoni;
import designpattern.factory.sauce.Sauce;
import designpattern.factory.veggie.Veggies;

public interface PizzaIngredientFactory {
	public Dough createDough();
	public Sauce createSauce();
	public Cheese createCheese();
	public Veggies[] createVeggies();
	public Pepperoni createPepperoni();
	public Clams createClam();
}
