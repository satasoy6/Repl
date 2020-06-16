package ReplHomeworks;

public class repl132 {
//	In AnotherClass declare a private, default, protected, public methods and have them each return the name of the what access modifier they are using.
//			All methods should be accessible by class name
//
//			Call methods of Another class inside Main class
//
//			Expected Output:
//			default
//			protected
//			public
	
	
		  private void method1 (){
		    System.out.println("private");
		  }
		  void method2 (){
		    System.out.println("default");
		  }
		  protected void method3 (){
		    System.out.println("protected");
		  }
		  public void method4 (){
		    System.out.println("public");
		  }
		  
		  
		

	
		  public static void main (String [] args){
		  
		 repl132 mm = new repl132 ();
		 // mm.method1();
		  mm.method2();
		  mm.method3();
		  mm.method4();
		}
		  
		}
	


