package designpattern.factory.nyPizza;

import designpattern.factory.PizzaIngredientFactory;
import designpattern.factory.cheese.Cheese;
import designpattern.factory.cheese.ReggianoCheese;
import designpattern.factory.clam.Clams;
import designpattern.factory.clam.FreshClams;
import designpattern.factory.dough.Dough;
import designpattern.factory.dough.ThinCrustDough;
import designpattern.factory.pepperoni.Pepperoni;
import designpattern.factory.pepperoni.SlicedPepperoni;
import designpattern.factory.sauce.MarinaraSauce;
import designpattern.factory.sauce.Sauce;
import designpattern.factory.veggie.Garlic;
import designpattern.factory.veggie.Mushroom;
import designpattern.factory.veggie.Onion;
import designpattern.factory.veggie.RedPepper;
import designpattern.factory.veggie.Veggies;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory{
	public Dough createDough(){
		return new ThinCrustDough();
	}

	@Override
	public Sauce createSauce() {
		return new MarinaraSauce();
	}

	@Override
	public Cheese createCheese() {
		return new ReggianoCheese();
	}

	@Override
	public Veggies[] createVeggies() {
		Veggies veggies[] = {new Garlic(), new Onion(), new Mushroom(), new RedPepper() };
		return veggies;
	}

	@Override
	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

	@Override
	public Clams createClam() {
		return new FreshClams();
	}

}
