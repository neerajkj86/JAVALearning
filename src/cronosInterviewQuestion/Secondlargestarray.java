package cronosInterviewQuestion;

public class Secondlargestarray {

	public static void main(String[] args) 
	{
		
		
		int a [] = {23,54,76,89,23,65,809};
		
		System.out.println("Third Largest Number is "+getSecondLargestNum(a,7));
		
		
		

	}
	
	
	
	public static int getSecondLargestNum(int a[],int total)
	{
		int temp ;
		//For Sorting i am using 2 loops to compare it 
		for (int i=0;i<a.length;i++)
		{
			for (int j=i+1;j<a.length;j++)
			{
				if (a[i]>a[j])
				{
					temp = a[i];
					a[i]=a[j];
					a[j]= temp;
				}
			}
		}
		
		
		return a[total-3];
		
	}

}
