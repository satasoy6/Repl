
package ReplHomeworks;

public class Repl118 {
	
//	For you to do:
//
//		Declare 3 instance variables to hold:
//		name of the country
//		capital
//		population size
//
//		Create a method to display values of instance variables
//
//		Create 2 Object, assign values to instance variables, execute method display;
//
//		Expected Output:
//		The capital of USA is Washington DC and population is 330000000
//		The capital of Kazakhstan is Astana and population is 18500000

	
	String country;
	String capital;
	long population;
	
	void display (String country,String capital,long population) {
		
		System.out.println("The capital of "+country+" is "+capital+" and population is "+population);
					
	}
	public static void main(String[] args) {
		
		
		Repl118 mm = new Repl118();
	
		mm.display("USA", "Washington DC", 330000000);
		
		Repl118 mm2 = new Repl118();
		
		mm2.display("Kazakhstan", "Astana", 18500000);
	}
	
}
