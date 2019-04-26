package designpattern.decorator;

public class DarkLost extends Beverage{
	public DarkLost(){
		description = "다크로스트";
	}

	@Override
	public double cost() {
		
		return 1.50;
	}
	
	
}
