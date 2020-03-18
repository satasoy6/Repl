package ReplHomeworks;

import java.util.Scanner;

public class Repl92 {

	public static void main(String[] args) {
		
//		For you to do:
//
//			Using Scanner class input string value. 
//			Print out the following:
//			"The first 3 letters of ___ is ___"
//
//			For example, if the input is "banana", 
//			your output should be: 
//			"The first 3 letters of banana is ban".
		
		Scanner scan = new Scanner(System.in);
		
		String item="";
		String letters="";
		System.out.println("Enter a word");
		
		item = scan.next();
		
		System.out.println("The first 3 letters of "+item+" is "+item.substring(0, 3));
		
		

	}

}
