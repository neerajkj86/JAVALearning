package JavaProgrammes;

public class VerifyStringContainsNumeric {

	public static void main(String[] args) 
	{
		
		System.out.println(isNumeric("123"));
		
	}
	
	
	public static boolean isNumeric(CharSequence cs)
	{
		
		
		for (int i=0;i<cs.length();i++)
		{
			
			if(!Character.isDigit(cs.charAt(i)))
			{
				return false;
			}
		}
		
		
		
		
		
		
		
		return true;
		
	}
	

}
