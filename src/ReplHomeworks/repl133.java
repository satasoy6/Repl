package ReplHomeworks;

public class repl133 {
	
	 static String str;
	 public static String  alphabetical(String str){
	  char previous = str.charAt(0);
	 		char current;
	 		String newString = "" + previous;
	 		for (int i = 1; i <= str.length()-1; i++) {
	 			current = str.charAt(i);
	 			if (current > previous) {
	 				newString += str.charAt(i);
	 			}
	 			previous = current;
	 		}
	 		return newString;
	 	}
	   public static void main(String[] args){
	 		System.out.println(alphabetical("hello")); //"hlo"
	 		System.out.println(alphabetical("software"));//"stwr"
	 		System.out.println(alphabetical("language"));//"lnug"
	 }
	   
	   //ALTERNATIVE WAY
//	   
//	   class Main {
//		   String new_word = "";
//		   	static String alphabetical(String str) {
//		   		String new_word = "";
//		   		char[] x = str.toCharArray(); //Asel bize charArray gostermedi
//		   		new_word += x[0];
//		   		for (int i = 1; i < x.length; i++) {
//		   			if (x[i] > x[i - 1]) { // Gulsum
//		   				new_word = new_word + x[i];
//		   			}
//		   		}
//		   		return new_word;
//		   	}
//		   	//test case below (dont change):
//		   	public static void main(String[] args){
//		   		System.out.println(alphabetical("hello")); //"hlo"
//		   		System.out.println(alphabetical("software"));
//		   		System.out.println(alphabetical("language"));
//		   	}
//		   }

}
