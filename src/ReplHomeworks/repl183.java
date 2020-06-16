package ReplHomeworks;

import java.util.Iterator;
import java.util.LinkedList;

public class repl183 {

	public static void main(String[] args) {
		
		LinkedList <Integer> list = new LinkedList<>();
		for(int i=50; i<101; i++) {
			list.add(i);
		}
		
		System.out.println(list);
		
		Iterator<Integer> alist = list.iterator();
		while(alist.hasNext()) {
			if(alist.next()%3!=0) {
				alist.remove();
			}
		}
		System.out.println(list);
	}
}
