package ReplHomeworks;

public class repl124 {
	
//	For you to do:
//
//		Declare two static variables to hold
//		country name
//		continent
//
//		Create a method to display the value of static variables in the following format:
//		 
//		____ located on ____ continent
//
//		In the main method assign values to a static variable and execute method display
//
//		Expected Output:
//		Morocco located on Africa continent
	
	 static String countryName;
	 
	 static String continent;
	  
	static void method (){
	    
	    System.out.println(countryName+" is located on "+continent+" continent");
	  }
	  
	  public static void main (String []args){
	   
	    
	    countryName="Morocco";
	    continent="Africa";
	    
	    method();
	    
	  }
}
