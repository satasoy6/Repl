package ReplHomeworks;

import java.util.Scanner;

public class Repl99 {
	
	public static void main(String[] args) {
//		Inputs:
//			String word;
//
//			Write a for loop that will loop through every character of a word and print out each character, each on a separate line 
//
//			 Sample inputs/outputs:
//			In: hello
//			h
//			e
//			l
//			l
//			o
//		
		Scanner inp = new Scanner(System.in);
	    System.out.print("In:");
	    String word = inp.nextLine();
	    //write your code below
	    
	  for (int i = 0; i <= word.length()-1; i++) { 
			       
			       char c = word.charAt(i);
			    		
			    		System.out.println(c);
			    	}
		
		
	}

}
