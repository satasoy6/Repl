package ReplHomeworks;
//1. Complete the SyntaxTechnologies class:
//
//Include the following class variables:
//* schoolName(String)
//* batch(int)
//* year(int)
//* lastDayOfClass(String)
//
//Write two constructors:
//* non-argument constructor
//* parameterized constructor
//
//Create method to display values of instance variables.
//
//2. In Main Class:
//Create two different objects of the SyntaxTechnologies class using both constructors and call display method.
//
//Expected Output:
//null 0 0 null
//Syntax 6 2020 07/30/2020


public class repl136 {
	
	 String schoolName ,lastDayOfClass;
	 int batch, year;
	
	repl136(){
		
	}
	repl136(String schoolName , int batch, int year, String lastDayOfClass){
		 this.schoolName=schoolName;
	     this.batch=batch;
	     this.year=year;
	     this.lastDayOfClass=lastDayOfClass;
		
	}
	public void display () {
		
		System.out.println(schoolName+" "+batch+" "+year+" "+lastDayOfClass);
	}
	public static void main(String[] args) {
		
		repl136 obj = new repl136();
		obj.display();
		repl136 obj2 = new repl136("Syntax",6,2020,"07/30/2020");
		obj2.display();				
	}
}
