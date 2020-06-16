package ReplHomeworks;

public class repl135 {
	
//	For you to do:
//		Create the maxValue method that will accept int array and return return the maximum value in the array. 
//
//		Method should visible every class in any package!
//
//		Expected Output:
//		22

	public static int maxValue (int [] arr) {
		
		int getMax = arr[0] ;

		for (int i=1 ; i<arr.length; i++) {
			if (arr[i]>=getMax) {
				getMax = arr[i];
			}
						
		}return getMax;
	}

	
	public static void main(String[] args) {
		int[] arr = {5,12,-3,7,3,22};
		System.out.println(maxValue(arr)); //should print 22
		
	}
}
