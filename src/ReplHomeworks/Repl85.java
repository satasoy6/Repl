package ReplHomeworks;

public class Repl85 {

	public static void main(String[] args) {
		
		
		
		//Write a program that sums all numbers that are on even index and on even row.
		

		int[][] a = {
			{-5,-2,-3,7},
			{1,-5,-2,2},
			{1,-2,3,-4}
		};
		
		int sum=0;
		
		 for (int i = 0; i<a.length; i++) {
			
			 if (i%2==0) {
				 for (int x = 0; x<a[i].length;x++)
					 
					 if (x%2==0) {
						sum=sum+a[i][x];
					 }
			 } 
		 }System.out.println(sum);
		 

		 
		 
		
	

	}

}
