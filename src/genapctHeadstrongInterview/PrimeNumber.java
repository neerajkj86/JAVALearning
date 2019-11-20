package genapctHeadstrongInterview;




//20 is prime number or not so we need to check that 20 is dividable from 2 to 10 and if remndeer is 0 then its not prime else yes 

public class PrimeNumber {

	
	
	public static void main(String[] args) {
		
		
		
		getPrimeNumList(13);
		
//		Boolean flag = isPrimeNumber(13);
//		if (flag == true)
//		{
//			System.out.println("given number is prime") ;
//		}
//		
//		else System.out.println("given number is not prime");
//		
		
		
		

	}
	
	
	
	
	public static boolean isPrimeNumber(int n)
	{
		
		for (int i =2;i<10;i++)
		if (n%i==0)
		{
			 return false ;
			
		}
		
		else if (n<=2)
		{
			return false;
		}
		
	
		
		
	
		
	return true;		
		
	}
	
	
	public static void getPrimeNumList(int n)
	{
		
		for (int i=2;i<=n/2;i++)
		{
			if (isPrimeNumber(i))
				System.out.print(i + "  ");
			
		}
	
	}
	
		
		
	}
	


