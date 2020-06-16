package ReplHomeworks;

import java.util.ArrayList;
import java.util.Scanner;

public class repl182 {
public static void main(String[] args) {
		
Scanner scan = new Scanner(System.in);
	
	ArrayList<Integer> list = new ArrayList<Integer>();
	
	for(int i = 0; i<5 ; i++) {
		list.add(scan.nextInt());
	}
	for(int num :list) {
		System.out.print(num+" ");
	}

	
}	
}


