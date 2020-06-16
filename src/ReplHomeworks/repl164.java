package ReplHomeworks;

public class repl164 {

	public static final double avgElements(int [] array){
	   double total = 0;
	
		for (int i =0; i<array.length;i++) {
			total = total + array[i];
		}
		double average = total/array.length;
		return average;
	  }
		public static void main(String[] args) {
			int[] a = {2,7,3,8,4};
			System.out.println(avgElements(a)); //should print 4.8
		}
	}

