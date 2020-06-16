package ReplHomeworks;


import java.util.LinkedList;
import java.util.List;

public class repl186 {
	
//	public boolean isPrime() {
//		for(int i=1; i < 100; i++){
//
//            boolean isPrime = true;
//
//            //check to see if the number is prime
//            for(int j=2; j < i ; j++){
//
//                    if(i % j == 0){
//                            isPrime = false;
//                            break;
//                    }
//            }
//            // print the number
//            if(isPrime)
//                    System.out.print(i + " ");
//	}
//
//		
//		return isPrime();
//		
//	}
//	
	private static boolean isPrime(int num) {
		int i, m = 0, flag = 0;
		boolean b=false;
			m = num / 2;
			if (num == 0 || num == 1 || num < 0) {
				b=false;
				flag = 1;
			} else  {
				for (i = 2; i <= m; i++) {
					if (num % i == 0) {
						b=false;
						flag = 1;
						break;
					}
				}
			}
			if (flag == 0 && num > 1) {
				b=true;
			}
		return b;
	}
public static void main(String[] args) {
		
		List<Integer> prime = new LinkedList<>();
		
		for(int i =1 ; i<100 ; i++) {
			prime.add(i);
			List <Integer>prime1 = new LinkedList<>();
				for(int x:prime) {
					
					if(isPrime(x))
						prime1.add(x);
				
			}
				prime.clear();
				prime.addAll(prime1);
				
		}System.out.println(prime);
	
}
	
	
}

