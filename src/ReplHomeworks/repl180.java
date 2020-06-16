package ReplHomeworks;

import java.util.ArrayList;
import java.util.List;

public class repl180 {
	
//	ArrayList Remove 
//
//	Create an Arraylist of type Integer. 
//	Add below elements to it. 
//	111
//	222
//	333
//	444
//	555
//	666
//	Print the ArrayList. 
//	remove all the elements. 
//	Print the Arraylist. 
	
	
	public static void main(String[] args) {
		 ArrayList<Integer> obj = new ArrayList<>();
		    obj.add(111);
		    obj.add(222);
		    obj.add(333);
		    obj.add(444);
		    obj.add(555);
		    obj.add(666);
		    
		    System.out.println(obj);
		    obj.clear();
		    System.out.println(obj);
		    
		
	}

}
