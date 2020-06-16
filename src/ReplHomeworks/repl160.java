package ReplHomeworks;

public class repl160 {

	public static void main(String[] args) {
		
		Animal [] animal = { new Animal(""), new Cat(""),new kitten1("milk"), new kitten2("snacks"), new kitten3("everything")};
		
		for (Animal a : animal ) {
			a.eat();
			a.sleep();
			
		}
	}
}
class Animal{
	  String food;
	  Animal(String food){
	    this.food = food;
	  }
	  
	void eat() {
	}

	void sleep(){
	  }
	  
	}
	class Cat extends Animal{
	  Cat(String food) {
			super(food);
			
		}
	  void eat (){
		    System.out.println("Cat eats");
		  }

	void sleep(){
	     System.out.println("Cat sleeps a lot");
	  }
	}
	class kitten1 extends Cat{
	  kitten1(String food) {
			super(food);
		}
	void eat (){
	    System.out.println("kitten1 eats "+food);
	  }
	  void sleep(){
	     System.out.println("kitten1 sleeps a lot");
	  }
	  
	}
	class kitten2 extends Cat{
	  kitten2(String food) {
			super(food);
		}
	void eat (){
	    System.out.println("kitten2 eats "+food);
	  }
	  void sleep(){
	     System.out.println("kitten2 sleeps a lot");
	  }
	}
	class kitten3 extends Cat{
	  kitten3(String food) {
			super(food);
		}

	void eat (){
	    System.out.println("kitten3 eats "+food);
	  }
	void sleep(){
	     System.out.println("kitten3 sleeps a lot");
	  }
	}
