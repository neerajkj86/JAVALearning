package abstractdemo;

public class PrimeNumber {

	public static void main(String[] args) 
	{
		
		System.out.println("2 is prime number:"+isPrimeNumber(2));
		
		System.out.println("3 is prime number:"+isPrimeNumber(3));
		
		System.out.println("10 is prime number:"+isPrimeNumber(10));
		
		getprimenumber (13);
		
		
		

	}
	
	
	
	public static void getprimenumber (int n) //to print all the prime number till that number use this function..
	
	{
		
		for (int i=2; i<=n; i++)
		{
			if (isPrimeNumber(i))
				System.out.print(i + "  ");
			
			
		}
	}
	
	
	public static boolean isPrimeNumber(int num)

	{

		if (num<=1)
		{
			return false;	
		}

		for (int i=2;i<num;i++) {

			if (num%2==0) {
				return false;	
			}


		}

		return true;

	}
}