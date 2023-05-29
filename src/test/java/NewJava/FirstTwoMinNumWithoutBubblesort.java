package NewJava;

public class FirstTwoMinNumWithoutBubblesort {

	public static void main(String[] args) {

		int[] a= {5,3,0,1,4,6,7,8};
		
		int fmin= a[0];
		int smin=a[0];
		
		for(int i=0; i<a.length; i++)
		{
		if(fmin>a[i])
		{
			fmin =a[i];
		}
		if(a[i]>fmin && a[i]<smin)
		{
			smin =a[i];
		}
		}
		System.out.println(fmin);
		System.out.println(smin);
	}

}
