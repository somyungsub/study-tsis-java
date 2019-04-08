package designpattern.Observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement{
	private float temp, humidity;
	private Subject weatherData;

	public CurrentConditionsDisplay(Subject weatherData){
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	@Override
	public void display() {
		System.out.println("Current conditions : "+temp+"F degrees and "+humidity+"% humidity");
	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		this.temp = temp;
		this.humidity = humidity;
		display();
	}
}
