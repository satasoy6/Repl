package ReplHomeworks;

public class Repl115 {
	
//	Write a method header with the following specs:    
//
//		Returns:
//		a String
//		Name:
//		censorLetter
//		Parameters:
//		a String
//		a char
//
//		Then complete the method by programming the following behavior
//		Replace all instances of given character with a "*" within the given String.
//		See below examples.
//
//		Examples:
//		censorLetter("computer science",'e') ==> "comput*r sci*nc*"
//		censorLetter("trick or treat",'t') ==> "*rick or *rea*"
	
	void censorLetter (String a ,char c) {
		
		
		a = "computer science";
		c= '*';
		a.replace('e', c);
		
		System.out.println(a);
		
	}
	
	public static void main(String[] args) {
		
		Repl115 mm = new Repl115();
		
		mm.censorLetter("computer science", c);
		
		
	}
	
}
