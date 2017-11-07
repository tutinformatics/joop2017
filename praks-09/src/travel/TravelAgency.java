package travel;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class TravelAgency {
	private static final String OUTPUT_FILENAME = "/home/martin/jtmp/joopout.txt";

	void playWithDestinations() throws FileNotFoundException {
		
		FileOutputStream out = new FileOutputStream(OUTPUT_FILENAME, true);
		System.setOut(new PrintStream(out));
		
		Destination oxford = new Destination("Oxford", 280);
		Destination tartu = new Destination("Tartu", 281);
		Destination firenze = new Destination("Firenze", 305);
		
		System.out.println(firenze.getCelsius());
		System.out.println(tartu.getFahrenheit());
		
		System.out.println(oxford.getAvgWeather(t -> t - 273.15));
		System.out.println(oxford.getAvgWeather(TravelAgency::getCelsius));
	}
	
	public static double getCelsius(double tempKelvin) {
		return tempKelvin - 273.15;
	}
	
	public static void main(String[] args) {
		try {
			new TravelAgency().playWithDestinations();
		} catch (FileNotFoundException e) {
			System.err.println(e.getMessage());
		}
	}
}
