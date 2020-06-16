package ReplHomeworks;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Student {
	
	int studentId;
	String name;
	String lastName;
	
	
	public Student(int studentId, String name, String lastName) {
		//super();
		this.studentId = studentId;
		this.name = name;
		this.lastName = lastName;
	}
	public void display() {
		System.out.println("Student details: "+name+" "+lastName+" with id: "+studentId);
	}


	public static void main(String[] args) {
		
		Set<Student> student = new LinkedHashSet<>();
		student.add(new Student(101,"Samir","Jawaid"));
		student.add(new Student(10,"Asel","Umurzakova"));
		student.add(new Student(103,"Diego","Juarez"));
		student.add(new Student(104,"Sohil","Aryan"));
		student.add(new Student(105,"Alijon","Nazarov"));
		
		Iterator<Student> it = student.iterator();
		while(it.hasNext()) {
			Student str = it.next();
			str.display();
		}
		
		
		
	}

}
