package genapctHeadstrongInterview;

public class ArrayLargestusingoneforloop {

	public static void main(String[] args) {
		
		int a [] = {3,5,78,76,12,4};
		int largest = a[0];
		int smallest =a[0];
		
	
		
		for (int i =1;i<a.length;i++ )
			
		{
			if (a[i]>largest)
			{
				largest = a[i];
				
			}
			
			else if (a[i]<smallest)
			{
				smallest = a[i];
			}
			
			
		}
		
		 System.out.println("Largest Number: "+largest);
	        System.out.println("Smallest Number: "+smallest);
		
		

	}

}
