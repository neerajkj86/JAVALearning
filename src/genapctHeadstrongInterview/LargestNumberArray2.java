package genapctHeadstrongInterview;

import java.util.Arrays;

public class LargestNumberArray2 {

	public static void main(String[] args) 
	{
		
		int a[]  = {10,12,34,2,9,80};
		getSecondLargest(a ,6);
		
		System.out.println("Second Largest: "+getSecondLargest(a,6));  
		
		
	}

	
	
	
	
	
	
	
	
	
	public static int getSecondLargest(int a [],int total)

	{
		
		int temp;
		
		for (int i=0;i<total;i++)
		{
			for (int j=i+1;j<total;j++)
			{
				if (a[i]>a[j])
				{
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
					
				}
			}
		}
		
		return a[total-2]; //change here to get the any largest values from the array .. 
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
