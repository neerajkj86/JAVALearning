package JavaProgrammes;

public class MaxofTwoNumbers {

	public static void main(String[] args) {
		
		int a [] = {12,15,32,54,2,90,123};
		
		//getLargestnumber(a,7);
		System.out.println("Second Largest: "+getSecondLargest(a,7));  

		
	}

	
	
	public static int getSecondLargest(int a[],int total)
	{
		
		int temp ;
		
		for (int i =0;i<total;i++)
		{
			for (int j=i+1;j<total;j++)
			{
				if (a[i]>a[j])
				{
					temp = a[i];
					a[i] = a[j];
					a[j]= temp;
				}
			}
		}
		
		
		
		return a[total-2]; // to get the third largest we have to change it to total-3 and so on,
		
		
	}
}
