package ReplHomeworks;

public class Parentt {

	public static void main(String[] args) {
		
		child2 obj =new child2();
		obj.name();
		obj.name1();
		obj.name2();
		//obj.name3();
	}
	public void name() {
		System.out.println("I am Parent public method");
	}
	 protected void name1() {
		System.out.println("Iam Parent protected method");
	}
	void name2() {
		System.out.println("I am Parent Default method");
	}
	private void name3() {
		System.out.println("I am parent private method");		
	}
}
	class child2 extends Parentt{
	public void name() {
		System.out.println("I am child public method");
	}
	protected void name1() {
		System.out.println("Iam child protected method");
	}
	void name2() {
		System.out.println("I am child Default method");
	}
	private void name3() {
		System.out.println("I am child private method");		
	}
  	
}

