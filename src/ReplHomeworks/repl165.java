package ReplHomeworks;

//Abstraction
//
//Create a Parent Class that will have two overloaded abstract methods m1
//
//Make Main class as concrete subclass to Parent Class 
//
//In main method call the methods. 
//
//Expected Output:
//m1 without parameters
//m1 method with parameter

public abstract class repl165 {
	public abstract void m1();
	public abstract void m1(String a); 
	 public static void main(String [] args){
	   
	   repl165 mm = new teyp();
	   mm.m1();
	   mm.m1("m1");
	 }
}
class teyp extends repl165{
	 
	public void m1(){
	    System.out.println("m1 without parameters");
	  }
	  public void m1(String a){
	    System.out.println("m1 method with parameter");
	  }
	}
