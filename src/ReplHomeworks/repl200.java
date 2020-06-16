package ReplHomeworks;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class repl200 {

	public static void main(String[] args) {
		
		Map<String, String> address = new LinkedHashMap<>();
		address.put("Street", "Patrick ST");
		address.put("Suite", "265");
		address.put("City", "Vienna");
		address.put("Zip", "22180");
		address.put("Country", "United State");
		
		for( String ad :address.values()) {
			System.out.println(ad);
		}
		
		//print all values in upper case using entrySet
		
		Set<Entry<String, String>> entry = address.entrySet();
		for(Entry<String, String> e : entry) {
			System.out.println(e.getValue().toUpperCase());
		}
		
		
			
		
		
	
		
		}
		
	}

