package praticeforInterview;

public class ReverseString2 {

	public static void main(String[] args) 
	{

		reverseString("ABA"); //calling the String Reverse Function 

	}
	
	
	
	public static void reverseString(String S)
	{
	//char[]ch= S.charAt(S)

	String rev =""; 
	
	
		
	for (int i=S.length()-1;i>=0;i--)
	{
		rev = rev+S.charAt(i);
	}
		
		
		
		
	

	if (S.equalsIgnoreCase(rev))
	{
		System.out.println("Palindrome number");
	}
	
	else
	{
		System.out.println("not a Palindrome number");
	}
	
	}
}
