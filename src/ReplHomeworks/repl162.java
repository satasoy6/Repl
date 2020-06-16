package ReplHomeworks;

public class repl162 {
	
//	For you to do:
//
//		Overload 2 final instance methods:
//
//		Call them in main method
//
//		Expected Output:
//		Final method with boolean parameter
//		Final method with String parameter
	
	public static final void method1 (boolean value){
	    System.out.println("Final method with boolean parameter");
	  }
	  public static final void method1 (String value){
	    System.out.println("Final method with String parameter");
	}

	public static void main (String [] args){
	  repl162 fk = new repl162();
	  fk.method1(true);
	  fk.method1("s");
	}
	}
