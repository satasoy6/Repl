package ReplHomeworks;

import java.util.LinkedList;

public class repl187 {

	public static void main(String[] args) {
		
		LinkedList<Integer> list = new LinkedList<>();
		list.add(111);
		  list.add(222);
		  list.add(333);
		  list.add(444);
		  list.add(555);
		  list.add(666);
		  
		  int total = 0;
		  for(int i=0;i<list.size();i++) {
			 total += list.get(i);
		  }System.out.println("Result of sum is "+total);
		  
		
	}
}
