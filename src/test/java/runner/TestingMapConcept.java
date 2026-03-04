package runner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TestingMapConcept {
	
	public static void main(String[] args) {
		
		
		HashMap<String, String> hm = new HashMap<String, String>();
		
		hm.put("Punjab", "Chandigarh");
		hm.put("Himachal", "Shimla");
		hm.put("Haryana", "Chandigarh");
		hm.put("Maharashtra", "Mumbai");
		
		
		String capital = hm.get("Haryana");
		
		System.out.println(capital);
		
		ArrayList<Map<String, String>> al = new ArrayList<Map<String, String>>();
		
		HashMap<String, String> hm1 = new HashMap<String, String>();
		hm1.put("India", "New Delhi");
		
		al.add(hm1);
		
		HashMap<String, String> hm2 = new HashMap<String, String>();
		hm1.put("Germany", "Berlin");
		
		al.add(hm2);
		
		
		Map<String, String> firstContent = al.get(0);
		
		
		String nationCapital = firstContent.get("Germany");
		
		System.out.println(nationCapital);
		
	}

}