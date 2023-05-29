package NewJava;

public class FirstMaxTwoNumwithoutBubbleSort {

	public static void main(String[] args) {

		int[] a= {5,3,0,1,4,6,7,8};
		
		int fmax= 0;
		int smax= 0;
		
		for(int i=0; i<a.length; i++)
		{
		if(fmax<a[i])
		{
			smax=fmax;
			fmax =a[i];
		}
//		else if(a[i]>smax)
//		{
//			smax= a[i];
//		}
		
		if(a[i]<fmax && a[i]>smax)
		{
			smax =a[i];
		}
		}
		System.out.println(fmax);
		System.out.println(smax);
	}


}
