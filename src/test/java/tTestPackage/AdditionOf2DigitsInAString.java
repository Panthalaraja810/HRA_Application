package tTestPackage;

public class AdditionOf2DigitsInAString {

	public static void main(String[] args) 
	{
		String s ="a12b11c2b";
		
		int sum=0;// 0 11 23
		int tsum=0;// 0 1 11 0 1 12 0 2
		
		for(int i=0; i<s.length(); i++)
		{
			
			if(s.charAt(i)>='0' && s.charAt(i)<='9')
			{
				int n =s.charAt(i)-48;//50-48=2
				tsum =tsum*10+n; //0*10+2=2
			}
			else
			{
				sum =sum+tsum; //11+12=23
				tsum =0; //0
			}
		}
		sum =sum+tsum; //23+2=25
		System.out.println(sum);//25
	}

}
