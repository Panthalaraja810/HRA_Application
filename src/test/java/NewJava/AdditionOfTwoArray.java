package NewJava;

public class AdditionOfTwoArray 
{

	public static void main(String[] args) 
	{
		
		int[] a= {4,6,8,2,4,8,8,6,4};
		int[] b= {9,8,7,5};
		
		int len =a.length;
		if(a.length<b.length)
		{
			len = b.length;
		}
		
		for(int i=0; i<len; i++)
		{
			try 
			{
				System.out.println(a[i]+b[i]+" ");
			}
			
			catch (Exception e) 
			{
				if(a.length<b.length)
				{
					System.out.println(b[i]);
				}
				else
				{
					System.out.println(a[i]);
				}
						
			}
		}
	}

}
