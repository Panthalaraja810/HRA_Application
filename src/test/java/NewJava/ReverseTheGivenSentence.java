package NewJava;

public class ReverseTheGivenSentence {

	public static void main(String[] args) {

		String s="I am a software engineer";  //engineer software a am I
		
		String[] str = s.split(" ");
		
		for(int i= str.length-1; i>=0; i--)
		{
			System.out.print(str[i]+" ");
		}
		
		
		
	}

}
