package designpattern.decorator;

public class Milk extends CondimentDecorator{
	private Beverage beverage;
	public Milk(Beverage beverage){
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return beverage.getDescription()+"우유";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return beverage.cost()+0.10;
	}

}
