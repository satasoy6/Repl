package ReplHomeworks;

public class Repl101 {
//	
//	Create a class 'Main' (please do not make it public as Repl will give you an error)
//	Inside class String variable 'name' and integer variable 'roll_no'. 
//
//	Creating an object of the class and assign the value of 2 to roll_no and value of "John" to name
//
//	Your program should print the following:
//	Name is John and roll number is 2
//	
	
	void  Roll (String name , int roll_no){
		
		roll_no = 2;
		name = "John";
		
		System.out.println("Name is "+name+" and roll number is "+ roll_no);
	}
	
	
	public static void main(String[] args) {
		
		 System.out.println("Hello world!");
		 
		 Repl101 obj = new Repl101 ();
		 
		 obj.Roll("John", 2);
		
	}

}
