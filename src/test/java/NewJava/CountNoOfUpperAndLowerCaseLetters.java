package NewJava;

public class CountNoOfUpperAndLowerCaseLetters {

	public static void main(String[] args) 
	{
		
		String s ="I am A SoFtWaRe";
		int upper=0; 
		int lower=0;
		
		for(int i=0; i<s.length(); i++)
		{
			if(s.charAt(i)>='a' && s.charAt(i)<='z')
			{
				lower++;
			}
			else if(s.charAt(i)>='A' && s.charAt(i)<='Z')
			{
				upper++;
			}
		}
		System.out.println("upper case= "+upper);
		System.out.println("lower case= "+lower);
	}

}
