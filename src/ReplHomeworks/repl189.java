package ReplHomeworks;

import java.util.HashSet;
//
//Create the HashSet with list of Integers add the below numbers for the list
//111
//111
//111
//999
//999
//999
// 
//Print elements one by one.

public class repl189 {
	
	public static void main(String[] args) {
		
		HashSet<Integer> hset = new HashSet<>();
		hset.add(111);
		hset.add(111);
		hset.add(111);
		hset.add(999);
		hset.add(999);
		hset.add(999);
		
		for(Integer h: hset) {
			System.out.println(h);
		}
		
	}

}
