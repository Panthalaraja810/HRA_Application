package NewJava;

//sort the array: int a[]={5,3,0,1,4}; 


public class ArrayBubbleSort {

	public static void main(String[] args) {
		
		int a[]= {5,3,0,1,4};
		
		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i]>a[j])
				{
					int temp =a[i];
					a[i] =a[j];
					a[j] =temp;
				}
			}
			System.out.print(a[i]+" ");
		}
		
		
	}

}
