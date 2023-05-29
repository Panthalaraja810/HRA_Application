package NewJava;

public class RemoveTheSpaceBtnInString {

	public static void main(String[] args)
	{

		String s="I am a software engineer";
		
		String[] arr = s.split(" ");
	
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]);
		}
		
	}

}
