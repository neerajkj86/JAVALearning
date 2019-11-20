package praticeforInterview;

public class ReverseaNumber {

	public static void main(String[] args) {
	
		ReverseNumber(121);

	}
	
	
	public static int ReverseNumber(int n)
	{
		
		int temp = n;
		
		int r;
		
		int sum =0;
		
		while (n>0)
		{
			r=n%10;
			sum = sum*10+r;
			n=n/10;
			
		}
		
		
		if (temp==sum)
		{
			System.out.println("Given " +temp+ "Number is a Palindrome number");
		}
		else
		{
			System.out.println("Given Number " +temp + "is not a Palindrome number");
		}
		
		return sum;
		
	}

}
