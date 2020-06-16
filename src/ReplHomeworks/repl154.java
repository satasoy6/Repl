package ReplHomeworks;

public class repl154 {
//	Overload private instance method m1
//
//	Call each method from the main method. 
//	 
//	Expected Output:
//	private m1 method 
//	private m1 method with int parameter
	
	private void m1 () {
		System.out.println("private m1 method");
	}
	private void m1 (int a) {
		System.out.println("private m1 method with int parameter");		
	}
	public static void main(String[] args) {
		repl154 mm = new repl154();
		mm.m1();
		mm.m1(1);
				
	}
}
