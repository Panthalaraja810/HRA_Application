package Day5;

public class Question19 {

	public static void main(String[] args) {

		
		String s="my name is ok";
		
		String[] st = s.split(" ");
		

		
		for(int i=0; i<st.length; i++)
		{
			String str = st[i];
			for(int j=s.length()-1; j>=0; j--)
			{
				System.out.print(s.charAt(j));
				
			}
			break;
		}
	}
	

}
