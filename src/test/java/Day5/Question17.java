package Day5;

public class Question17 {

	// i/p: i am selenium o/p:  m ui nelesma
	
	public static void main(String[] args)
	{
		String st ="i am selenium";
		//long st = s.chars().count();
		
//	String[] st = s.split("");
	
		
		String rev=" ";
		
		for(int i=0; i<st.length(); i++)
		{
			if(st.charAt(i)!=' ')
			{
				rev =rev+st.charAt(i);
			}
		
		}
		for(int i=0; i<st.length(); i++)
		{

		if(st.charAt(i)==' ')
		{
			rev =rev.substring(0,i)+" "+rev.substring(i);
		}
		
		}
		System.out.println(rev);

	}

}
