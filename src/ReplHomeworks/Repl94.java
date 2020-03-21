package ReplHomeworks;

import java.util.Scanner;

public class Repl94 {
	public static void main(String[] args) {
		
	
//		For you to do:
		
//				If browser is ChRoME it should print the: 
//				"Proceed with Chrome browser"
	
//				If browser is FireFOX it should print the: 
//				"Proceed with Firefox browser"
		
//				If browser is IE it should print the:
//				"Proceed with IE browser"
		
//				If any other browser it should print the:  
//				"Invalid browser"
			
			Scanner sc = new Scanner(System.in); 
		    

			System.out.println("Enter the browser name to proceed further with execution");
			
			String browser = sc.nextLine();
			
		
			if (browser.equalsIgnoreCase("CHROME")){
				System.out.println("Proceed with Chrome browser");
			}
			else if (browser.equalsIgnoreCase("FIREFOX")) {
				System.out.println("Proceed with Firefox browser");
			}
			else if (browser.equalsIgnoreCase("IE")) {
				System.out.println("Proceed with IE browser");	
			}else {
				System.out.println("Invalid browser");
			}
				
			
			}
			
	}


	

	

