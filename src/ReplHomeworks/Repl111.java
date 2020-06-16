package ReplHomeworks;

public class Repl111 {
	
//	Create a method that will accept a String as a parameter 
//	and return new String all in upper case
//
//			Call method
//
//			Expected Output:
//			TEST
	
	void method (String abc) {
		
		abc = abc.toUpperCase();
		System.out.println(abc);
	}

	
	public static void main(String[] args) {
		
		Repl111 mm = new Repl111() ;
		mm.method("test");
			
//		ASEL's SOLUTION
		
//		public static String makeCapital(String name)
//		{
//			return name.toUpperCase();
//		}
//		
//		//test case below (dont change):
//		public static void main(String[] args){
//			System.out.println(makeCapital("test"));
//		}
//	}
		
	}
}
