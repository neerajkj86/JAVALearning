package praticeforInterview;

public class PrimeNumber {

	public static void main(String[] args) 
	{
		
		//System.out.println(isPrimeNum(120));
        
		getPrimeNumList(15);
		
	}
	
	public static boolean isPrimeNum (int n)
	{
		
		
	if (n%2==0)
			{
				return false;
			}
	
	else if(n<=2)
	{
		return false;
	}
		
		
		return true;
		
	}
	
	
	
	
	
	
	
	public static void getPrimeNumList(int n)
	{
		
		for (int i=2;i<=n;i++)
		{
			if (isPrimeNum(i))
				System.out.print(i + "  ");
			
		}
		
	}
	
	
	

}
