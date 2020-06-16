package ReplHomeworks;

public class repl131 {
	
//	
//	In main class please declared the variables using different access modifiers that will hold value for:
//		name
//		city
//		name of the school
//		batch number
//
//		Create a method to display details in following format:
//		My name is ___ and I live in ___. I study at ___ in batch ___
//
//		Assign values to the variables and execute method display
//
//		Expected Output:
//		My name is John and I live in Miami. I study at Syntax in batch 6
	
	
	String name;
	static String city;
	protected String school;
	public int batch;

	
	public void method () {
		
		name = "Seyma";
		city = "New Jersey";
		school = "Syntax";
		batch = 6;
		
		System.out.println("My name is "+name+" and I live in "+city+". I study at "+school+" in batch "+batch);
	
	}
	public static void main(String[] args) {
		repl131 mm = new repl131();
		mm.method();
		
		
		
		
	}
	

}
