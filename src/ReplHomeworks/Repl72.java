package ReplHomeworks;

public class Repl72 {

	public static void main(String[] args) {
		
		//Write a program that creates an array with the 
		//following values{s, a, y,  b, n, c, t,  d, a, e, x} 
		//Print the values so the output should look like below
		//syntax
		
	char [] array = {'s',  'a', 'y',  'b', 'n', 'c', 't', 'd', 'a', 'e', 'x'} ;
	
	for(int j = 0; j<array.length; j+=2) {
		
		System.out.print(array[j]);
	}
		
	}

}
