package ReplHomeworks;

public class repl152 {
	
//	Create 3 overloaded methods to perform subtraction of  2, 3 and 4 numbers
//	In main method execute all 3 methods to match the output:
//	 
//	Expected Output
//	40 (should come from subtracting 4 numbers)
//	30 (should come from subtracting 3 numbers)
//	20 (should come from subtracting 2 numbers)

	int sub(int a, int b) {
		return (a-b);
	}
	int sub(int a, int b, int c) {
		return (a-b-c);
	}
	int sub(int a, int b, int c,int d) {
		return(a-b-c-d);
	}
	
	public static void main(String[] args) {
		
		repl152 ss = new repl152();
		System.out.println(ss.sub(80, 10, 10, 20));
		System.out.println(ss.sub(50, 10, 10));
		System.out.println(ss.sub(30, 10));
	}
}
