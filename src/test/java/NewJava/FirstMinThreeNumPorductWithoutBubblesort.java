package NewJava;

import java.util.Arrays;

public class FirstMinThreeNumPorductWithoutBubblesort {

	public static void main(String[] args) {

		int[] a= {5,3,1,6,7,8};
		
		int fmin= a[0];
		int smin= a[0];
		int tmin= a[0];
		
		for(int i=0; i<a.length; i++)
		{
		if(fmin>a[i])
		{
			fmin =a[i];
		}
		else if(fmin==smin || a[i]<smin)
		{
			smin =a[i];
		}
		if(fmin==tmin || a[i]<tmin)
		{
			tmin=a[i];
		}
		}
		
		int prod =fmin*smin*tmin;
		
		System.out.println(fmin);
		System.out.println(smin);
		System.out.println(tmin);
		System.out.println("prod is:"+prod);
	}

}
	