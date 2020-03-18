package ReplHomeworks;

import java.util.Scanner;

public class Repl78 {

	public static void main(String[] args) {
		
//		Create an int array of integers with a size of 5 
//		and input values with Scanner. 
//		Don't print prompt questions for a user.
//		Using loop print out each element of the array
//		that should look like the output 
		
		Scanner scan = new Scanner (System.in);
		
	
	
	
	
	
	int [] numbers = new int [5];
	
	for (int i = 0 ;i < numbers.length; i++ ) {
	
		numbers[i] = scan.nextInt();
		
	}
	
	for (int i = 0; i<numbers.length; i++) {
		
		System.out.println(numbers[i]*10);
		
	}
		
		
	
	
	 
	 
	 
	 	}

}
