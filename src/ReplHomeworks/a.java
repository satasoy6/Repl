package ReplHomeworks;

public class a {
	public static void main(String[] args) {
		a a1 = new a(10);
		b b1 = new b(20);
		b1.m1();
		b1.m2();
	}
	
	int i =1 ;
	a(int i){
		this.i=i;
	}
	

}
class b extends a{
	
	int i=20 ;
	
	b(int i){
		super(i);
	}
	void m1() {
		System.out.println(this.i);
	}
	void m2 () {
		System.out.println(super.i);
	}
}