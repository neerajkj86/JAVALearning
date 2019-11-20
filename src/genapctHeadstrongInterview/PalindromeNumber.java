package genapctHeadstrongInterview;

public class PalindromeNumber {

	public static void main(String[] args) {
		
		
		int n=345;
		
		int temp =n;
		int r;
		int rev=0;
		while (n>0)
		{
			r =n%10;
			rev = rev*10 + r;
			
			n=n/10;
			
		}
		
		System.out.println(rev);
		
		if (temp==rev)
		{
			System.out.println("Given " +temp+ "Number is a Palindrome number");
		}
		else
		{
			System.out.println("Given Number " +temp + "is not a Palindrome number");
		}
		
		

	}

}
