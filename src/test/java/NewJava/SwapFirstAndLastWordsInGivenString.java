package NewJava;

public class SwapFirstAndLastWordsInGivenString {

	public static void main(String[] args) {
		
		String s="I am a software engineer"; //engineer am a software I
		
		String[] st =s.split(" ");
		
		String temp =st[0];
		st[0] =st[st.length-1];
		st[st.length-1] =temp;
		
		for(int i=0; i<st.length; i++)
		{
			System.out.print(st[i]+" ");
		}
		
		
	}

}
