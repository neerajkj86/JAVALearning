package abstractdemo;

public class Palindromenumber {

	public static void main(String[] args) 
	{

		isPalindromeNumber(151);

	}
	
	
	
	public static void isPalindromeNumber(int n)
	
	{
		
		int r=0;
		int sum=0;
		int t;
		
		t=n;
		
		while(n>0)
		{
			
			r=n%10; // get the remiander
			sum = (sum*10)+r;
			n = n/10;
			
			
			
		}
		
		if (t== sum)
		{
			System.out.println("Palindrome number");
		}
		
		else
		{
			System.out.println("not a Palindrome number");
		}
		
	}

}
