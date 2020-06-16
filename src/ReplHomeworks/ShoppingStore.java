package ReplHomeworks;


//Repl142
//In ShoppingStore class:
//Create variables as below.
//item,
//price, 
//quantity
//
//Create a constructor to initialize instance variables.
//
//Create a method with name itemTotalPrice. 
//write a logic to to calculate the total values of items in stock. and print the result. 
//return the total value. 
//
//In Main Class. 
//Create two Object of ShoppingStore and pass the parameters to Constructor. 
//then using each object call the method itemTotalPrice. 
//Store the returned value of each object. 
//Calculate sum of both object and print the result. 
//
//Output:
//Blanket Total Value 99.98
//Mattress Total Value 439.18
//You purchased 539.16 Today


public class ShoppingStore {

	String item;
	double price;
	int quantity;
	
	ShoppingStore(String item, double price, int quantity){
		this.item= item;
		this.price= price;
		this.quantity= quantity;		
	}
	double itemTotalPrice() {
		System.out.println(item+" Total Value "+(price*quantity));
		return (price*quantity);
	}
	
public static void main(String[] args) {
		
		ShoppingStore shop = new ShoppingStore ("Blanket",99.98,1);
		ShoppingStore shop1 = new ShoppingStore("Mattress",439.18,1);
		double item1= shop.itemTotalPrice();
		double item2 = shop1.itemTotalPrice();
		System.out.println("You purchased "+(item1+item2)+" Today");
	}
}

