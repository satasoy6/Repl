package ReplHomeworks;

public class Repl113 {
	
//	Create a method with the following specs:  
//
//		Returns:
//		an integer
//		Name:
//		sumEvenToX
//		Parameters:
//		an integer called "x"
//		Purpose:
//		calculate the sum of the EVEN integers from 1 to x (including x)
//
//		Examples:
//		sumEvenToX(5) ==> 6
//		sumEvenToX(8) ==> 20
	
	
	public static int sumEvenToX (int x) {
		
		
		int sum =0;
		for (int i = 1; i<=x ; i++) {
			
			if (i%2==0) {
				
				sum +=i;
			}
		}System.out.print(sum);
		return sum;
		
	}
	public static void main(String[] args) {
		
		Repl113 mm = new Repl113();
		
		mm.sumEvenToX(0);
	}

}
