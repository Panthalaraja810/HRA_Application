package NewJava;

public class Append0sAtTheLastInArray 
{

	public static void main(String[] args) 
	{
		int[] a= {4,0,2,0,5,0};  //4,2,5,0,0,0
		
		
//		for(int i=0; i<a.length; i++)
//		{
//			for(int j=i+1; j<a.length; j++)
//			{
//				if(a[i]==0)
//				{
//					int temp =a[i];
//					a[i] =a[j];
//					a[j] =temp;
//				}
//			}
//			System.out.println(a[i]);
//		}
		
		int[] b=new int[a.length];
		
		int m=0;
		int n=a.length-1;
		
		for(int i=0; i<a.length; i++)
		{
			if(a[i]!=0)
			{
				b[m] =a[i];
				m++;
			}
			else 
			{
				b[n] =a[i];
				n--;
			}
		}
		 
		for(int i=0; i<a.length; i++)
		{
			System.out.println(b[i]);
		}
		
		


	}

}
