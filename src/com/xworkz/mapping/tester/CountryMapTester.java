package com.xworkz.mapping.tester;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class CountryMapTester {

	public static void main(String[] args) {
		Map<String, Double> countryAndPopulation = new HashMap<String, Double>();
		countryAndPopulation.put("India", 136.64d);
		countryAndPopulation.put("SouthKorea", 5.16d);
		countryAndPopulation.put("Japan", 12.63d);
		countryAndPopulation.put("GreenLand", 32.82d);
		countryAndPopulation.put("Australia", 2.54d);

		System.out.println(countryAndPopulation.size());
		System.out.println(countryAndPopulation.containsKey("India"));
		System.out.println(countryAndPopulation.containsKey("USA"));
		System.out.println(countryAndPopulation.containsValue(56.39D));
		// countryAndPopulation.remove("Australia");
		System.out.println(countryAndPopulation.size());

		Set<String> keyset = countryAndPopulation.keySet();
		Iterator<String> itr = keyset.iterator();

		while (itr.hasNext()) {

			String country = itr.next();
			System.out.println(country);
			Double population = countryAndPopulation.get(country);

			System.err.println(country + "   " + population);

		}
		
		
		Collection<Double> valueset = countryAndPopulation.values();
		Iterator<Double> itr1 = valueset.iterator();
		
		while(itr1.hasNext()) {
		System.out.println( itr1.next());
			
			
		}
		

	}

}
