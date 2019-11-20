package Praticejava;

public class Palindrome {

	
	public static void main(String[] args) 
	{
		
		isPalindromeNumber(14);
	}
	
	
	
	
	
	public static void isPalindromeNumber(int n)
	
	{
		
            
            	
       int temp =n;

            	int sum =0;
            	
            	int r=0;
            	
            	while (n>0)
            	{
            		r = n%10;
            		sum = sum*10+r;
            		n = n/10;
            	}
            	
           
            	if (temp ==sum) {
            	
            		System.out.println("Nummber is palindrome " +temp);
            		
            		
            	}
            	
            	else
            	{
            		System.out.println("Number is not palindrme "+temp);
            	}
            	
	}
	
	
}
