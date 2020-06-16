package ReplHomeworks;



public class Person {

	 private String firstName;
	  private String lastName;
	  private int birthMonth;
	  private int birthDay;
	  private int birthYear;
	  private String ssn;
	  
	 public  Person(String firstName, String lastName,int birthMonth,int birthDay,int birthYear, String ssn)
	  {
		  this.firstName=firstName;
		  this.lastName=lastName;
		  this.birthMonth=birthMonth;
		  this.birthDay=birthDay;
		  this.birthYear=birthYear;
		  this.ssn= ssn;
	  }
	  public String getFirstName() {
		  return firstName;
	  }
	  
	  public String getLastName() {
		  return lastName;
	  }
	  public int getbirthMonth() {
		  return birthMonth;
	  }
	  public int getBirthDay() {
		  return birthDay;
	  }
	  public int getBirthYear() {
		  return birthYear;
	  }
	  public String getSsn() {
		  return ssn;
	  }
	  public String formatBirthday() {
		return this.birthMonth+"/"+this.birthDay+"/"+this.birthYear;
	  }
	
	  public static void main(String[] args) {
		
		  Person p = new Person("John","Doe",10,25,1900,"123-45-6789");
		System.out.println( p.getFirstName()); 
		System.out.println( p.getLastName()); 
		System.out.println(p.formatBirthday());
		System.out.println(p.getSsn());
		
//		Create the a Person class with the following:
//			Class Variables
//			firstname
//			lastname
//			birthmonth
//			birthday
//			birthyear
//			String ssn
//
//			Constructor
//			The main constructor should take in all values and assign them to their respective private class variables
//
//			Methods
//			Create a public getters to access all the variables. 
//
//			Create a public method called formatBirthday, which will return a String composed of their birthday in mm/dd/yyyy format.  For example, if birthmonth=3, birthday=22, birthyear=2000, it should return the String "3/22/2000"
//
//			in Main Class. 
//
//			Instantiate and object of Person and provide values. follows below outputs for values. 
//
//			using getter and method print them separately. 
//			Note: Read carefully the steps. 
//
//			Expected Output:
//			John
//			Doe
//			10/25/1900
//			123-45-6789
		  
		  
		  
		  
	}
}
