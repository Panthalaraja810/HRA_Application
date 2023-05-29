package NewJava;

public class FirstMinNumArray {

	public static void main(String[] args)
	{
		int[] a= {5,3,2,0,6,1,4};
		
		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i]>a[j])
				{
					int temp= a[i];
					a[i] =a[j];
					a[j] =temp;
				}
			}
			
		}
		System.out.println("First Min Num in Array: "+a[0]);
	}

}
