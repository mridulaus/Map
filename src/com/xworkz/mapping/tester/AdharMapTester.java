package com.xworkz.mapping.tester;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class AdharMapTester {

	public static void main(String[] args) {
		Map<String, Long> adhar = new HashMap<String, Long>();
		adhar.put("MR123654" , 9611751258l);
		adhar.put("UD789654", 9449781193l);
		adhar.put("PU456789", 886117120l);
		adhar.put("DP321563", 8645632540l);
		

		System.out.println(adhar.size());
		System.out.println(adhar.containsKey("PU456789"));
		System.out.println(adhar.containsKey("USA"));
		System.out.println(adhar.containsValue(8645632540l));
		
		System.out.println(adhar.size());

		Set<String> keyset = adhar.keySet();
		Iterator<String> itr = keyset.iterator();

		while (itr.hasNext()) {

			String val1 = itr.next();
			System.out.println(val1);
			Long num = adhar.get(val1);

			System.err.println(val1 + "   " + num);

		}
		
		
		Collection<Long> valueset = adhar.values();
		Iterator<Long> itr1 = valueset.iterator();
		
		while(itr1.hasNext()) {
		System.out.println( itr1.next());
			
			
		}

	}

}
