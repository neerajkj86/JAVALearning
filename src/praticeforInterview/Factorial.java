package praticeforInterview;

public class Factorial {

	public static void main(String[] args) 
	{
		
		int p=factNumber(3);
		
		System.out.println(p);
	}
	
	
	public static int factNumber(int num)
	{
		//int n=1;
		
		// factorial 4 = 4*3*2*1
		
		if (num==0)
		{
			return 1;
		}
		else 
			
		return num*factNumber(num-1);
			
		
			
		
		
		
	}

}
