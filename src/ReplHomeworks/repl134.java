package ReplHomeworks;

public class repl134 {
	
//	Create the maxLength method that will accept String array of words and
//	return the word with the largest length.
//
//			Method should visible only within same package!
//
//			Expected Output:
//			this is long

	
	protected static String maxLength(String [] arr) {
		
		int getMaxLength = 0;
		String longest ="";
		
		for (String s : arr) {
			if(s.length()>getMaxLength) {
				getMaxLength = s.length();
				longest = s;										
			}			
		}
		return longest;
		
	}
	public static void main(String[] args) {
		String[] arr = {"hey","yolo","hi","this is long"};
		System.out.println(maxLength(arr));
		//should print "this is long"
	}
	
	

	// hoca boyle yapmis
//	static String maxLength(String[] words) {
//		int index = 0;
//		int elementLength = words[0].length();
//		for (int i = 1; i < words.length; i++) {
//			if (words[i].length() > elementLength) {
//				index = i;
//				elementLength = words[i].length();
//			}
//		}
//		return words[index];
}
