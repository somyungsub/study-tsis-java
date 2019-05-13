package designpattern.factory;

import designpattern.factory.cheese.Cheese;
import designpattern.factory.clam.Clams;
import designpattern.factory.dough.Dough;
import designpattern.factory.pepperoni.Pepperoni;
import designpattern.factory.veggie.Veggies;

public class Pizza {
	public String pizzaName;
	public Cheese cheese;
	public Clams clams;
	public Veggies[] veggies;
	public Pepperoni pepperoni;
	public Dough dough;
	
	public void prepare(){
		System.out.println(pizzaName+"를 준비합니다.");
	}
	public void bake(){
		System.out.println(pizzaName+"를 굽습니다..");
	}
	public void cut(){
		System.out.println(pizzaName+"를 자릅니다.");
	}
	public void box(){
		System.out.println(pizzaName+"를 포장합니다.");
	}
	

}
