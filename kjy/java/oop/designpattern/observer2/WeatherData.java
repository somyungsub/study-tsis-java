package designpattern.observer2;

import java.util.Observable;

public class WeatherData extends Observable{
	
	private float temperature;
	private float humidity;
	private float pressure;
	
	public WeatherData(){}
	
	public void setMeasurements(float temperature, float humidity, float pressure){
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		
		measurementsChanged();
	}
	
	public void measurementsChanged(){
		setChanged();
		notifyObservers();
	}
	
	public float getTemperature(){
		return this.temperature;
	}
	
	public float getHumidity(){
		return this.humidity;
	}
	
	public float getPressure(){
		return this.pressure;
	}
	
	

}
