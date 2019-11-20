package JavaProgrammes;

/**
 * @author JainNe
 *
 *This is a programme to capitalise the first letter of each word in java
 *
 */
public class CapitaliseFirstletter {

	
	
	public static void main(String[] args) {
		
		String S = "neeraj is a good employee";
		
		String capitalizeWord="";  
		
		String []words = S.split(" ");

		
		//System.out.println(words.toString());
		
		for (String word: words)
		{
			String First =word.substring(0, 1); //end index will be skipped 
			String AfterFirst = word.substring(1);
			capitalizeWord = capitalizeWord+First.toUpperCase()+AfterFirst+" ";
		}
		
		
		System.out.println(capitalizeWord);
	}

}
