package praticeforInterview;

import java.util.Arrays;

public class MaximumtwoElements {

	public static void main(String[] args) {
		
	 int num [] = {3,2,4,5,89,1};
	 
	 
	 int Largest = num[0];
	 int smallest = num[0];
	 
	 for (int i=1;i<num.length;i++)

	 {
		 if (num[i]>Largest)
			 
			 Largest = num[i];
		 
		 else if (num[i]<smallest)
			 
			 smallest =num[i];
			 
		 
			 //System.out.println();
			 
					 
	 }
	 
	 System.out.println("given array is this :"+Arrays.toString(num) );
		
		System.out.println("Largest number is "+Largest);
		
		System.out.println("smallest number is "+smallest);
	 
	 
		

	}

}
