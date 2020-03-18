package ReplHomeworks;

import java.util.Scanner;

public class Repl68 {

	public static void main(String[] args) {
		
	//	Write a program to print out the pattern: 

//			 
//			$$$$
//			$  $
//			$  $
//			$$$$
//		
		
		
		int i, j = 0; 
        
        for (i = 1; i <= 4; i++) 
        { 
            for (j = 1; j <= 4; j++) 
            { 
                if (i == 1 || i == 4 ||   j == 1 || j == 4)             
                    System.out.print("$");             
                else           
                    System.out.print(" ");             
            } 
            System.out.println(); 
        } 
    }
		

	}


