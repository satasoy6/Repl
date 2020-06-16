package ReplHomeworks;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class repl196 {

	public static void main(String[] args) {
		
		Map<String, String> address = new HashMap<>();
		address.put("Street", "Patrick ST");
		address.put("Suite", "265");
		address.put("City", "Vienna");
		address.put("Zip", "22180");
		address.put("Country", "United State");
		
//		System.out.println(address.size());
//		address.clear();
//		System.out.println(address.size());
		
		Map<String, String> add = new LinkedHashMap<>();
		add.put("Street", "Patrick ST");
		add.put("Suite", "265");
		add.put("City", "Vienna");
		add.put("Zip", "22180");
		add.put("Country", "United States");
		
		 for (String keys : add.keySet()){
	          System.out.println(add.get(keys));
	        }
//		Collection <String> v = add.values();
		
//		for(String val :v) {
//			System.out.println(val);
//		}
		
		
		
		
		
		
	}
	
}
