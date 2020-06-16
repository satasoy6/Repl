package ReplHomeworks;

public class repl207 {

	public static void main(String[] args) {
		
		int [] array= {0,1,2};
		try {
			System.out.println(array[4]);
		}catch(ArrayIndexOutOfBoundsException ae) {
			ae.printStackTrace();
		}
		
	}
}
