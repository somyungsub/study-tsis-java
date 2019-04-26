package designpattern.decorator;

public class Whip extends CondimentDecorator{
	private Beverage beverage;
	public Whip(Beverage beverage){
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return beverage.getDescription()+"휘핑";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return beverage.cost()+0.30;
	}

}
