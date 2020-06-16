package ReplHomeworks;
//Create a method hello() in parent class that will print "method in Parent class" then override  that method is 3 Subclasses implementing login to print "method in Child1/Child2/Child3 class"
//
//In Main Class create 3 object of the child classes and store in into an array and call method hello():
//
//Expected Output:
//method in Child1 class
//method in Child2 class
//method in Child3 class

public class repl159 {
	
  void hello(){
		    System.out.println("method in Parent class");
		  }

	 public static void main (String [] args){
		    
		 repl159 [] array = {new child1(), new abcf(), new child3()};
		    for (repl159  c : array) {
		    	c.hello();
		  }
		}
    }
		class child1 extends repl159{
		  void hello(){
		    System.out.println("method in Child1 class");
		  }
		}
		class abcf extends repl159{
		  void hello(){
		    System.out.println("method in Child2 class");
		  }
		}
		class child3 extends repl159{
		  void hello(){
		    System.out.println("method in Child3 class");
		  }
		}


