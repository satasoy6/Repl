package ReplHomeworks;

public class Repl69 {

	public static void main(String[] args) {
		
	//	Write a program to print out the pattern: 

//			1 2 3 4 5 6 7 
//			1 2 3 4 5 6 
//			1 2 3 4 5 
//			1 2 3 4 
//			1 2 3 
//			1 2 
//			1 
//			1 2 
//			1 2 3 
//			1 2 3 4 
//			1 2 3 4 5 
//			1 2 3 4 5 6 
//			1 2 3 4 5 6 7
		
		
		for (int i=8 ; i>2;i--) {
			for (int x =1;x<i;x++) {
				
				System.out.print(x+" ");
			}
			System.out.println();
		}
		for (int t = 1; t<=7;t++) {
			for (int z =1 ;z<=t;z++) {
				System.out.print(z+" ");
			}
			System.out.println();
				
		}

	}

}
