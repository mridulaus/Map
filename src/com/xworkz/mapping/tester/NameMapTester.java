package com.xworkz.mapping.tester;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class NameMapTester {

	public static void main(String[] args) {
		Map<String, String> nameAndFood = new HashMap<String, String>();
		nameAndFood.put("Mridula", "Lasagna");
		nameAndFood.put("Wahida", "Cannelloni Rolls");
		nameAndFood.put("Mrinal", "Chickenfry");
		nameAndFood.put("Darshan", "Tiramisu");
		nameAndFood.put("Kavya", "Cheesecake");
		nameAndFood.put("Piyanka", "Koreanchickenwings");
		System.out.println(nameAndFood.size());
		System.out.println(nameAndFood.containsKey("Wahida"));
		System.out.println(nameAndFood.containsKey("priyanka"));

		nameAndFood.remove("Piyanka");
		System.out.println(nameAndFood.size());

		Set<String> keyset = nameAndFood.keySet();
		Iterator<String> itr = keyset.iterator();

		while (itr.hasNext()) {
			String name = itr.next();
			System.out.println(name);
			String both = nameAndFood.get(name);

			System.out.println(name + "  " + both);
		}
		Collection<String> keyset1 = nameAndFood.values(); //values only avail for collection 
		Iterator<String> itrval = keyset1.iterator();

		while (itrval.hasNext()) {
			String food = itrval.next();
			System.out.println(food);

		}

	}

}
