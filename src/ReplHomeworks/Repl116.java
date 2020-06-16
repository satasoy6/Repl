package ReplHomeworks;

public class Repl116 {

//	For you to do:
//
//		Declare 3 instance variables to hold: 
//
//		year, school name and batch #
//
//		Access variables from the main method and assign specific values to them
//		Print values of your variables in the following format:
//
//		Expected Output:
//		I am a student of batch 6 studying at Syntax in the year of 2020
	
	int year= 2020;
	String schoolName= "Syntax";
	int batch= 6;
	


	public static void main(String[] args) {
		
		Repl116 mm = new Repl116 ();
		System.out.println("I am a student of batch "
		+mm.batch+" studying at "+mm.schoolName+" in the year of "+mm.year);
		
		
		
		
	}
}
