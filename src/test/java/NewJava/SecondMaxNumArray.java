package NewJava;

public class SecondMaxNumArray {

public static void main(String[] args) {
		
		int a[]= {5,3,0,7,1,4};
		
		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i]<a[j])
				{
					int temp= a[i];
					a[i] =a[j];
					a[j] =temp;
				}
				
			}
		}
		System.out.println("Second Max Num in Array: "+a[1]);
		
	}

}
