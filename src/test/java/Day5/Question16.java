package Day5;

public class Question16 {

	//{7,-3,0,2,1,-9} without bubblesort first 3max element product of 3max element
	
	public static void main(String[] args)
	{
		int[] a={7,-3,0,2,1,-9};
		
	
		int fmax=Integer.MIN_VALUE;
		int smax=Integer.MIN_VALUE;
		int tmax=Integer.MIN_VALUE;
		
		for(int i=0; i<a.length; i++)
		{
			if(fmax<a[i])
			{
				//smax=fmax;
				fmax=a[i];
			}
			else if(a[i]>smax && smax!=fmax)
			{
				//tmax=smax;
				smax=a[i];
			}
			else if(tmax<a[i] && tmax!=smax && tmax!=fmax)
			{
				tmax =a[i];
			}
			
		}
		System.out.println(fmax);
		System.out.println(smax);
		System.out.println(tmax);
	
	int prod =fmax*smax*tmax;
	System.out.println("prod: "+prod);
	
	
	}

}
