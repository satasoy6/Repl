package ReplHomeworks;

public class repl209 {

	public static void checkTemperature(int temp) {
		if(temp<32) {
		throw new RuntimeException ("It is freezing");
		}
	}
	public static void main(String[] args) {
	
		try{
			checkTemperature(30);
		}catch(RuntimeException e) {
			System.out.println(e);
		}
	}
}
