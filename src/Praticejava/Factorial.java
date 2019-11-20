package Praticejava;

public class Factorial {

	public static void main(String[] args) 
	{
		
	
	
	System.out.println(fact(0));
	
	
	}
	
	
	public static int FactorialR(int n)
	{
		if (n==0)
		
		return 1;
		else 
		return (n*FactorialR(n-1));	
			
		
	}
  
	
	
	public static int fact(int n) {
	
		int fact = 1;
		if (n==0)
		{
			return 1;
		}
		for(int i=1;i<=n;i++)
		{
			fact= fact*i;
		}
		return fact;
	}
	
	
	
	
	
	
	
	
	
	
	
}
