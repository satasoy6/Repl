package ReplHomeworks;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class repl202 {

	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<>();
		map.put("ONE","AAA");
		map.put("TWO","BBB");
		map.put("THREE","CCC");
		map.put("FOUR","DDD");
		map.put("FIVE","EEE");
		
		Set<Entry<String, String>> entries = map.entrySet();
		System.out.println("HashMap Before Replace :");
		for(Entry<String, String> e : entries) {
			System.out.println(e.getKey()+" : "+e.getValue());
		}
		System.out.println("------------------");
		System.out.println("HashMap After Replace :");
		map.replace("THREE", "ASEL");
		map.replace("FIVE", "SUMAIR");
		for(Entry<String, String> e : entries) {
			System.out.println(e.getKey()+" : "+e.getValue());
		}
		
		
		
		
		
	}
}
