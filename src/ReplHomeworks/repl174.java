package ReplHomeworks;

public class repl174 {
	
//	Create Class EncapsulationDemo that will have 2 variables empName and empAge;
//	Create the getter/setter methods for each variable. 
//
//	In Main Class and main method
//
//	Using setter methods assign the values as "Mario" and "32"
//	Using getter methods print the values as below outputs. 
//
//	 Expected Output:
//	Employee Name: Mario
//	Employee Age: 32
	
	private String empName;
	private int empAge;
	
	public void setEmpName(String empName) {
		this.empName=empName;
	}
	public String getName() {
		return empName;
	}
	public void setEmpAge(int empAge) {
		this.empAge=empAge;
	}
	public int getAge() {
		return empAge;
	}
	
	public static void main(String[] args) {
		
		repl174 obj = new repl174();
		obj.setEmpName("Mario");
		obj.setEmpAge(32);
		
		System.out.println("Employee name: "+obj.getName());
		System.out.println("Employee age: "+obj.getAge());
		
	}

}
