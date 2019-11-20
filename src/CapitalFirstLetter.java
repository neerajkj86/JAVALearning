
public class CapitalFirstLetter {

	public static void main(String[] args) 
	{
		
		String S = "neeraj jain is a good boy";
		
		String Capitalizeword =" "; 
		
		String [] words =S.split(" ");
		
		
		
		
		
		for (String word: words)
		{
			
			String first = word.substring(0, 1); //end index would be skipped
			
			String AfterFirst = word.substring(1);
			 Capitalizeword = Capitalizeword+first.toUpperCase()+AfterFirst.toLowerCase()+" ";
					
		}
		
		System.out.println(Capitalizeword);

	}

}
