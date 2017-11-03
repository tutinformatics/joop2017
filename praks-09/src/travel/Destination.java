package travel;

import java.util.function.DoubleFunction;

public class Destination implements DestinationModel{

	private String name;
	private double avgTempKelvin;

	public Destination(String name, double avgTempKelvin) {
		this.name = name;
		this.avgTempKelvin = avgTempKelvin;
	}
	
	@Override
	public String getName() {
		return name;
	}

	@Override
	public double getKelvin() {
		return avgTempKelvin;
	}

	@Override
	public double getAvgWeather(DoubleFunction<Double> tempHandler) {
		return tempHandler.apply(getKelvin());
	}

	public double getCelsius() {
		return getKelvin() - 273.15;
	}

	public double getFahrenheit() {
		return getKelvin() * 9/5 - 459.67;
	}
}
