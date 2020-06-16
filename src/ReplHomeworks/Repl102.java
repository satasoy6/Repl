package ReplHomeworks;

public class Repl102 {
	
//	Create a class named 'Main' with specific attributes.
//	Create two objects of that class in which you will be assigning the following values and then print them.
//	carColor='Black'
//	carYear=2019
//	carMake='BMW'
//
//	carColor='White'
//	carYear=2018
//	carMake='Toyota'
//
//	Expected Output:
//	Car color is Black and car year is 2019 and car model is BMW
//	Car color is White and car year is 2018 and car model is Toyota
	
	void Car (String carColor, int carYear, String carMake){
		
		
		System.out.println("Car color is "+carColor+" and car year is "+carYear+" and car model is "+carMake);
					
				}
			public static void main(String[] args) {
				
				
				
				Repl102 car1 = new Repl102();
				
				car1.Car("Black", 2019, "BMW");
				car1.Car("White", 2018, "Toyota");
			}
			
				
			}	
			
	
	


