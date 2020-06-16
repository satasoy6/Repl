package ReplHomeworks;

public class repl122 {

	
//	For you to do:
//
//		Create a variable that will hold the count of all instances of the Main class
//
//		Create 3 Object of the class and print value of the count variable;
//
//		Expected Output:
//		3
	
	
	static int count;

	public static void main(String[] args) {
		repl122 obj1 = new repl122();
		count++;
		repl122 obj2 = new repl122();
		count++;
		repl122 obj3 = new repl122();
		count++;

		System.out.println(count);
}
}
