package ReplHomeworks;

import java.util.Set;
import java.util.TreeMap;

public class repl198 {
	
	public static void main(String[] args) {
		
		TreeMap<String, String> fruit = new TreeMap<>();
		fruit.put("1 item", "apple");
		fruit.put("2 item", "banana");
		fruit.put("3 item", "pear");
		fruit.put("4 item", "tomato");
		fruit.put("5 item", "mango");
		fruit.put("6 item", "kiwi");
		
		Set<String> groceries = fruit.keySet();
		for(String g:groceries) {
			System.out.println("Key is "+g+" and values is "+fruit.get(g));
		}
		
	}

}
