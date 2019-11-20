package praticeforInterview;

public class ReverseString {

//	public static void main(String[] args) 
//	{
//
//		System.out.println(reverseString("Sachin")); //calling the String Reverse Function 
//
//	}
	
	
	
	public static String reverseString(String S)
	{
	char[]ch= S.toCharArray();

	String rev =""; 
		
	for (int i =ch.length-1;i>=0;i--)
	{
		rev = rev + ch[i];
	}
		
		return rev;
		
	}

}
