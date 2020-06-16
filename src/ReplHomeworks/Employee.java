package ReplHomeworks;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Employee {
	
	private String fullName;
	private String ssn;
	private double salary;
	
	public Employee(String fullName, String ssn, double salary) {
		//super();
		this.fullName = fullName;
		this.ssn = ssn;
		this.salary = salary;
	}
	
	public final String getFullName() {
		return fullName;
	}

	public final String getSsn() {
		return ssn;
	}

	public final double getSalary() {
		return salary;
	}

	public static void main(String[] args) {
		
		Set<Employee> emp = new LinkedHashSet<>();
		emp.add(new Employee("John Doe","123456789",80000.0));
		emp.add(new Employee("Jane Smith","987654321",90000.0));
		emp.add(new Employee("Jackie Chan","0",1000000.0));
		
	
		Iterator<Employee> type= emp.iterator();
		while(type.hasNext()) {
		Employee methods = 	type.next();
		System.out.println(methods.getFullName());
		System.out.println(methods.getSsn());
		System.out.println(methods.getSalary());
		}
		
	}

	
}
