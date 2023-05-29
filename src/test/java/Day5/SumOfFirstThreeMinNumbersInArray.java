package Day5;

public class SumOfFirstThreeMinNumbersInArray {

	public static void main(String[] args)
	{
		int[] a= {7, -6, 11, 9, 0,4};
		
		int fmin=a[0];
		int smin=a[1];
		int tmin=a[2];
		
		for(int i=0; i<a.length; i++)
		{
			if(fmin>a[i])
			{
				fmin=a[i];
			}
			else if(a[i]<smin && smin!=fmin)
			{
				smin=a[i];
			}
			else if(smin>a[i] && tmin!=smin)
			{
				tmin=a[i];
			}
		}
		
		System.out.println(fmin+" "+smin+" "+tmin);
		
	}

}
