package ReplHomeworks;

import java.util.Scanner;

public class Repl100 {

//	Given the following inputs:
//		String s;
//
//		Write a for loop that will print out each letter of the string s, separated by spaces, on the same line.
//
//		Sample input/outputs:
//		In: hello
//		h e l l o
	
	
	public static void main(String[] args) {
		
		
		Scanner inp = new Scanner(System.in);
	    System.out.print("In:");
	    String s = inp.nextLine();
	    
	    char [] chars = s.toCharArray();
	    
	    for (char ch :chars) {
	    	System.out.print(ch);
	    }
	   
		
		
		
		
		
		
	}
}
