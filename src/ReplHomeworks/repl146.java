package ReplHomeworks;

public class repl146 {
	repl146(){
		System.out.println("Parent constructor");
	}
	repl146(String city){
		System.out.println(city);
	}
	

}class Child extends repl146{
	
	Child(String city){
		super(city);
	}
	
}
