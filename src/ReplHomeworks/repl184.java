package ReplHomeworks;

import java.util.LinkedList;
import java.util.List;

//Create Linked List that will store first 10 numbers of fibonacci series
//
//Print number from Linked List 1 by 1 all in 1 line

public class repl184 {

	public static void main(String[] args) {
		
		List<Integer> fibonacci = new LinkedList<>();

		fibonacci.add(0, 0);
		fibonacci.add(1, 1);
		int sum = 0;
		for(int i =2;i<10;i++) {
			sum=fibonacci.get(i-1)+fibonacci.get(i-2);
			fibonacci.add(sum);
		}
		System.out.println(fibonacci);
		
	}
}
