package ReplHomeworks;

import java.util.Scanner;

public class Repl76 {

	public static void main(String[] args) {
//		
//		Write a program that creates a String array with size 7. 
//		Ask the user to input Days of a week beginning with Sunday using Scanner class.
//		Add these inputs to your array and then print all values from that array
//
//		Example:
//		Please enter day 1 of the week
//		Sunday
//		Please enter day 2 of the week
//		Monday
//		Please enter day 3 of the week
//		Tuesday etc
		
		Scanner scan = new Scanner (System.in);
		
		String [] day = new String[7];
		
		for (int i = 0; i<day.length ;i++) {
		
			System.out.println("Please enter day "+(i+1)+" of the week");
			day[i]=scan.next();
		}
		for (int j = 0; j<=day.length-1;j++) {
			
			System.out.println(day[j]);
		}
		
		
		
		

	}

}
