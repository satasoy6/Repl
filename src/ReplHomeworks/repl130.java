package ReplHomeworks;

public class repl130 {

//	For you to do:
//		Please create methods with different access modifiers (one for each access modifier) and call them properly in main method one by one
//		 
//		In each method write the logic accordingly like for private method write the logic in the println Statement as "This is Private Method" accordingly for rest of the methods that have different access modifiers should be a total of 4 outputs, please make sure they are in the same order that is printed below.
//
//		Expected Output:
//		This is Private Method
//		This is Default Method
//		This is Protected Method
//		This is Public Method

	private void method1 () {	
		System.out.println("This is Private Method");
	}
	void method2 () {
		method1();
	}
	protected void method3 () {
		System.out.println("This is Protected Method");
	}
	public void method4() {
		System.out.println("This is Public Method");
	}
	
	public static void main(String[] args) {
		
		repl130 mm = new repl130();
		
		mm.method1();
		mm.method2();
		mm.method3();
		mm.method4();
	}
}
