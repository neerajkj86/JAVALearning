package Praticejava;

public class PrimeNumber2 {

	public static void main(String[] args) 
	{
		
		getprimeNum(131);	
	}	
		
	
	
	public static void getprimeNum(int n)
	{
		
		for (int i =2;i<=10;i++) {
		
			if (isprime(i)) {
				System.out.print(i + " ");
			}
		}
		
		
	}
	
		
		public static boolean isprime(int n)
		{
				
			
		if (n%2==0)
		{
			//System.out.println("Numberr is not prime");
			return false;
		}
		
		else 
		{
			//System.out.println("Number is prime");
			
		}
		return true;
		
	}
	
	
}
