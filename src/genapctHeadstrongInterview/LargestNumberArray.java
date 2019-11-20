package genapctHeadstrongInterview;

import java.util.Arrays;

public class LargestNumberArray {

	public static void main(String[] args) 
	{
		
		int a[]  = {10,12,34,2,9,80};
		getSecondLargest(a ,6);
		
		System.out.println("Second Largest: "+getSecondLargest(a,6));  
		
		
	}

	
	
	
	
	
	
	
	
	
	public static int getSecondLargest(int a [],int total)

	{
		
		Arrays.sort(a);
		
		return a[total-2];
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
