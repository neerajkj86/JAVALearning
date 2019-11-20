package Praticejava;

import java.util.Arrays;

public class Larestnsmallestarray {

	public static void main(String[] args) {
		
		//TO find the Largest and smallest number from this Array
		
		int num[] = {321,24,66,88,123};
		
		
		int largest = num[0];
		
		int smallest = num[0];
		
		
		for (int i =1;i<num.length;i++)
		{
			if (num[i]>largest) 
				largest=num[i];
			
			else if(num[i]<smallest)
				 smallest= num[i];
			
		}
		
		System.out.println("given array is this :"+Arrays.toString(num) );
		
		System.out.println("Largest number is "+largest);
		
		System.out.println("smallest number is "+smallest);
		
		
	}

}
