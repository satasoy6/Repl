package ReplHomeworks;

import java.util.*;

public class repl181 {

//	Create an array list to type String. 
//	Add these values below to your arraylist
//	hi
//	yo
//	sup
//	yolo
//	boop
//
//	Remove 1, 3, 5 element from an array
//
//	print remained values one by one in one line
//
//	Expected Output:
//	yo yolo 
	
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
		list.add("hi");
		list.add("yo");
		list.add("sup");
		list.add("yolo");
		list.add("boop");
		System.out.println(list);
		list.remove("hi");
		list.remove("sup");
		list.remove("boop");
		
		System.out.print(list);
		
	}
}
