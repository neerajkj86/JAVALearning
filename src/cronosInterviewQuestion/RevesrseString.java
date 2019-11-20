package cronosInterviewQuestion;

public class RevesrseString {

	public static void main(String[] args) 
	{
		
		String A = "Neeraj";
		
		String rev = " ";
		
		for (int i=A.length()-1;i>=0;i--)
		{
			rev = rev+A.charAt(i);
		}
		
		System.out.println(rev);
	}

}
