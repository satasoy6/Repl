package ReplHomeworks;
 
public class repl167 {//Super class Tea

	public static void main(String[] args) {
		
		Tea obj = new Tea();
		obj.addSugar("Lemon Tea");
	}
	
}
abstract class Tea{
	String teaType;
	Tea(String teaType){
		this.teaType = teaType;
	}
	abstract void addSugar();
}
class LemonTea extends Tea{

	LemonTea(String teaType) {
		super(teaType);
		
	}

	@Override
	void addSugar() {
		System.out.println("For "+teaType+" we need 2 spoons of sugar");
		
	}
	
}
class ChaiTea extends Tea{

	ChaiTea(String teaType) {
		super(teaType);
		
	}

	@Override
	void addSugar() {
		System.out.println("For "+teaType+" we need 1 spoon of sugar");
		
	}
	
}

