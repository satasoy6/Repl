package ReplHomeworks;

public class Repl95 {
	
//	For you to do:
//
//		Create a String given="Hello Syntax friends". 
//		Using String methods from given String create new String "Welcome Syntax family"
//
//		Expected Output:
//		Welcome Syntax family
	
	public static void main(String[] args) {
		
		String given="Hello Syntax friends";
		
		given=given.replace("Hello", "Welcome").replace("friends", "family");
		
		System.out.println(given);
		
	}

}
