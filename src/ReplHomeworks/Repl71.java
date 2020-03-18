package ReplHomeworks;

public class Repl71 {

	public static void main(String[] args) {
	
		//Write a program that creates an array of integers that stores the following values:
		//45,78, 12,  67, 55, 89, 23, 77, 88
		//	Print only values that stored with even index including 0.

		int [] array = {45,78, 12,67,55,89,23,77,88};
		
		for (int j =0; j<array.length; j+=2) {
			
			System.out.print(array[j]+" ");
		}

	}

}
