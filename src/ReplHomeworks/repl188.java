package ReplHomeworks;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class repl188 {
//	
//	Create a method that will remove an element
//	based on the specified condition from given List and return new List;

//	 Expected Output:  
//	[USA, Kazakhstan, Pakistan, Russia]
	
	public static List <String> removeElement(List<String>list, String letter){
		
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			if(it.next().startsWith(letter)) {
				it.remove();
			}
		}		
		return list;		
	}
	public static void main(String[] args) {
		
		List<String> countries = new LinkedList<>();
		countries.add("Armenia");
		countries.add("USA");
		countries.add("Kazakhstan");
		countries.add("Australia");
		countries.add("Pakistan");
		countries.add("Russia");
		countries.add("Azerbaijan");
		
		System.out.println(countries);
		System.out.println(removeElement(countries,"A"));
		
		
		
	}

}
