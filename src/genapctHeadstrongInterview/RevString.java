package genapctHeadstrongInterview;



/**
 * this is a programme to reverse a String
 * 
 * 
 * 
 * @author JainNe
 *
 */
public class RevString {

	
	
	public static void main(String[] args) 
	{
		
		String S = "Neeraj";
		
		String rev = "";
		
		for (int i = S.length()-1;i>=0;i--)
		{
			rev = rev + S.charAt(i);
		}
		
		System.out.println(rev);
		

	}

}
