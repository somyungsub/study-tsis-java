package designpattern.decorator;

public class Mocha extends CondimentDecorator{
	private Beverage beverage;
	public Mocha(Beverage beverage){
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return beverage.getDescription()+"모카";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return beverage.cost()+0.20;
	}

}
