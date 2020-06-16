package ReplHomeworks;

public class Repl117 {
	
//	For you to do:
//		declare 3 instance variables to hold an integer, double and char values.
//
//		Create 2 instances of the class and assign values to variables and the print them
//
//		Expected Output:
//		10
//		10.23
//		a
//		100
//		100.23
//		s
	
	int a = 10;
	double b = 10.23;
	char c = 'a';
	
	void number1() {
		
		int x = 100;
		double y = 100.23;
		char z = 's';
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}
	

	
	public static void main(String[] args) {
		
		Repl117 mm = new Repl117();
		System.out.println(mm.a);
		System.out.println(mm.b);
		System.out.println(mm.c);
		
		mm.number1();
	}	
}
