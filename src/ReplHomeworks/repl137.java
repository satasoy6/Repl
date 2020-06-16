package ReplHomeworks;

public class repl137 {
public static void main(String[] args) {
	

		Car c1 = new Car("Toyota","Prius",4,120,30000.0);
		Car c2 = new Car ("Toyota","Prius",120,30000.0);
		Car c3 = new Car (4,120,30000.0);
		Car c4 = new Car ("Toyota","Prius",4);
		
		c1.display();
		c2.display();
		c3.display();
		c4.display();
}		
}
class Car {
	  
	  String make;
	  String model;
	  int numberOfDoors;
	  int topSpeed;
	  double price;
	  
	  Car(String make, String model, int numberOfDoors, int topSpeed, double price){
	    this.make= make;
	    this.model = model;
	    this.numberOfDoors=numberOfDoors;
	    this.topSpeed=topSpeed;
	    this.price=price;
	  }
	  Car(String make, String model,int topSpeed, double price){
	  numberOfDoors = 4;
	  this.make= make;
	  this.model = model;
	  this.topSpeed=topSpeed;
	  this.price=price;
	}
	Car(int numberOfDoors,int topSpeed, double price){
	  make = "unknown";
	  model = "unknown";
	  this.numberOfDoors=numberOfDoors;
	  this.topSpeed=topSpeed;
	  this.price=price;
	  
	}
	Car(String make, String model, int numberOfDoors){
	  topSpeed = 90;
	  price = 0.0;
	  this.make= make;
	  this.model = model;
	  this.numberOfDoors=numberOfDoors;
	}

	public void display(){
	  System.out.println(make+" "+model+" "+numberOfDoors+" "+topSpeed+" "+price);
	}
	}
