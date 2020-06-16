package ReplHomeworks;


//Repl140
//1. Complete the Employee.java class:
//
//Include the following class variables:
//* name(String)
//* lastName(String)
//* employeeId(int)
//* startDate(String)
//* salary(int)
//
//
//Write two constructors:
//
//* non-argument constructor
//* parameterized constructor that will initialize all instance variables
//
//Create two different objects of the Employee class using both constructors and print the values of the properties inline using a print method.
//
//
//Output:
// 
//null null 0 null 0
//Joe Smith 12345 01/01/1970 35000

public class Employee1 {

	String name;
	String lastName;
	int employeeID;
	String startDate;
	int salary;
	
	Employee1(){
		
	}
	Employee1(String name,String lastName,int employeeID,String startDate,int salary){
		this.name = name;
		this.lastName = lastName;
		this.employeeID = employeeID;
		this.startDate = startDate;
		this.salary = salary;
		
	}
	void print () {
		System.out.println(name+" "+lastName+" "+employeeID+" "+startDate+" "+salary );
	}
	
	public static void main(String[] args) {
		
		Employee1 emp1 = new Employee1 ();
		emp1.print();
		
		Employee1 emp2 = new Employee1 ("Joe","Smith",12345,"01/01/1970",35000);
//		emp2.name = "Joe";
//		emp2.lastName = "Smith";
//		emp2.employeeID = 12345;
//		emp2.startDate = "01/01/1970";
//		emp2.salary = 35000;
		emp2.print();
//		
		
	}
}
