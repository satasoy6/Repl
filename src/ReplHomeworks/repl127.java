package ReplHomeworks;

public class repl127 {
	
	public static int countA(String s, char c)
	{
	    int count = 0;
	    c = 'a';
	    for (int i=0; i < s.length(); i++)
	    {
	        if (s.charAt(i) == c)
	        {
	             count++;
	        }
	        System.out.println(count);
	    }
	    return count;
	}

	public static void main(String[] args) {
		
		repl127 mm = new repl127();
		
		mm.countA("aaa", 'a');
		
	}
	
}