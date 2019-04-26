package designpattern.observer2;

import java.util.Observable;
import java.util.Observer;

public class weatherDataTest {
	public static void main(String[] args){
		WeatherData weatherData = new WeatherData();
		
		Observer currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
		Observer forecastDisplay = new ForecastDisplay(weatherData);
		
		weatherData.addObserver(currentConditionsDisplay);
		weatherData.addObserver(forecastDisplay);
		
		weatherData.setMeasurements(30, 40, 50);
		weatherData.setMeasurements(20, 30, 20);
	}

}
