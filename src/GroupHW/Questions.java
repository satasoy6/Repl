package GroupHW;

import java.util.Scanner;

public class Questions {

	public static void main(String[] args) {
		
//
//		Java IQ 
//		Part 1: Programming Questions
//
//		Write a program to swap 2 numbers without a temporary variable? Swap  2 strings without a temporary variable?
//
//		Write a java program to check whether a given number is prime or not?
//
//		Write a Java Program to print first 10 numbers of Fibonacci series.
//
//		Find out how many alpha characters are present in a String?  Find number of words in string?
//
//		Write a java program to reverse String? Reverse a string word by word?
//
//		Write a Java Program to find whether a String is palindrome or not?
//
//		Write a java program to find the second largest number in the array? Maximum and minimum number in the array?
//		
	
	Scanner scan = new Scanner (System.in);
	
	
	int total = 0;
	int number;
	
	for (number= 0;number!=-1;) {
		number = scan.nextInt();
		if (number!=-1) {
			total+=number;
		}
	}
	
	System.out.println("the total is ="+total);
	
	}
	
	

}
