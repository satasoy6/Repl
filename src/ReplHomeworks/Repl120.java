package ReplHomeworks;

public class Repl120 {

	
	static String ss="Welcome To Syntax Technologies";
	
	public static void display () {
		
		System.out.println("Welcome To Syntax Technologies");
	}
		
	
	public static void main(String[] args) {
		
		//1st way
		ss = "Welcome To Syntax Technologies";
		System.out.println(ss);
		
		//2nd way
		Repl120 obj = new Repl120();
		obj.display();
		
		//3rd way
		
		
		obj.ss = "Welcome To Syntax Technologies";
		System.out.println(obj.ss);
		
	}
//	
//	Declare static variable in class level as below and assign its value:
//
//		String ss="Welcome To Syntax Technologies"
//
//		Access variable in the main method and print it using three ways you learned so far
//
//		Hint:
//		first way: By calling directly
//		Second way: By using the className
//		Third way: By creating the object of the class
//
//		Expected Output:
//		Welcome To Syntax Technologies
//		Welcome To Syntax Technologies
//		Welcome To Syntax Technologies
}
