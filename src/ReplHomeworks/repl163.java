package ReplHomeworks;

public class repl163 {
	
//	For you to do:
//
//		Create an instance final method that will reverse a String and return that new String
//
//		Call method from the main method
//
//		Expected Output:
//		olleh
	
	public static final String reverse (String a) {
		String reverse = "";
		for (int i = a.length()-1;i>=0;i--) {
			reverse = reverse + a.charAt(i);
		}
		return reverse;
	}
	public static void main(String[] args) {
	
		repl163 r = new repl163();
		String newString = r.reverse("hello");
		System.out.println(newString);
}
}
