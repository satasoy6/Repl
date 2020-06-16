package ReplHomeworks;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class repl208 {

	public static void display(String filePath) throws FileNotFoundException {
		
		FileInputStream fis=new FileInputStream(filePath);
	}
	public static void main(String[] args) {
		
		
		try {
			display("");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		
		
	}


}
