package NewJava;

public class FindFirstMinWithoutBubbleSort {

	public static void main(String[] args) {

		int[] a= {5,3,0,1,4};
		
		int fmin= a[0];
		
		for(int i=0; i<a.length; i++)
		{
		if(fmin>a[i])
		{
			fmin =a[i];
		}
		
		}
		System.out.println(fmin);
	}
	

}
