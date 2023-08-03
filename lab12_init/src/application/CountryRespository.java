package application;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CountryRespository {
	private static List<Country> countries;
	
	private static void loadCountries() {
		ObjectInputStream in ;
		System.out.println("Read from Object file");
		try {
			in = new ObjectInputStream(new FileInputStream("data/countries.dat"));
			//List<Country> con =new ArrayList<Country>();
			countries=  Arrays.asList((Country[])in.readObject());
			for (Country c:countries)
				System.out.println(c);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static List<String> getContinents() {
		if (countries == null) loadCountries();
		List<String> continents = new ArrayList<String>();
		for (Country c:countries)
			if (!continents.contains(c.getContinent()))
			continents.add(c.getContinent());			
		return continents;
	}
	
	public static List<String> getRegions(String continent) {
		if (countries == null) loadCountries();
		List<String> regions = new ArrayList<String>();
		for (Country c:countries)
			if (!regions.contains(c.getRegion())&& c.getContinent().equalsIgnoreCase(continent))
				regions.add(c.getRegion());			
		return regions;
	}
	
	public static List<Country> getCountriesByRegion(String region) {
		if (countries == null) loadCountries();
		// Get countries by region
		List<Country> countriesByRegion = new ArrayList<Country>();
		for (Country c:countries)
			if (c.getRegion().equalsIgnoreCase(region))
				countriesByRegion.add(c);
		return countriesByRegion;
	}
}