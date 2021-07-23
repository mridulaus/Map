package com.xworkz.mapping.tester;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class GovtMapTester {

	public static void main(String[] args) {
		Map<String, Integer> government = new HashMap<String, Integer>();
		government.put("GovtTeacher" , 90000);
		government.put("IASOfficer", 100000);
		government.put("PoliceOfficer", 60000);
		government.put("GovtDoctor", 95000);
		

		System.out.println(government.size());
		System.out.println(government.containsKey("IASOfficer"));
		System.out.println(government.containsKey("Lawyer"));
		System.out.println(government.containsValue(77000));
		
		

		Set<String> keyset = government.keySet();
		Iterator<String> itr = keyset.iterator();

		while (itr.hasNext()) {

			String govtOfficer = itr.next();
			System.out.println(govtOfficer);
			Integer sal = government.get(govtOfficer);

			System.err.println(govtOfficer + "   " + sal);

		}
		
		
		Collection<Integer> valueset = government.values();
		Iterator<Integer> itr1 = valueset.iterator();
		
		while(itr1.hasNext()) {
		System.out.println( itr1.next());
			
			
		}

	}

}
