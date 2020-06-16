package ReplHomeworks;

public class repl156 {
//	Overload Constructor of the Main class
//
//	Create 2 Objects of Main class to execute both constructors
//
//	Expected Output:
//	Welcome to the Syntax
//	I am the student at Technologies
	
	repl156(){
		System.out.println("Welcome to the Syntax");		
	}
	repl156(String name){
		System.out.println("I am the student at "+name);
	}
	public static void main(String[] args) {
		
		repl156 obj = new repl156 ();
		repl156 obj2 = new repl156("Technologies");
	}
}
