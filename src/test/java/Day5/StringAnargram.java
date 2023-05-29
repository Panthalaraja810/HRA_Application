package Day5;

public class StringAnargram {

	public static void main(String[] args) 
	{
		String a="Rahul";
		String b="ulahuR";
	
		String s = a.toLowerCase();
		String st = b.toLowerCase();
		
		
		if(s.length()==st.length())
		{
			char[] ab = s.toCharArray();
			char[] ba = st.toCharArray();
		
		
		for(int i=0; i<s.length(); i++)
		{
			if(ab[i]==ba[i])
			{
				System.out.println("anagram");
				
			}
			else
			{
				System.out.println("not anagram");
			}
			
		}
		}
		
		
				
	}

}
