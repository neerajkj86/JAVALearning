package regexp;

import java.util.regex.Pattern;

/**
 * @author JainNe
 *  Create A Regular expression that accept 11 digit AlphaNumeric characters only and starting from HR, only ..
 *  assume GST number for Haryana State 
 *
 *
 */
public class PatternMatcher3 {

	public static void main(String[] args) {
		
         Boolean result= Pattern.matches("[A-Z]{1}[0-9]{9}","H123456789");
         System.out.println(result);
         
         System.out.println(Pattern.matches("[HR]{2}[0-9]{9}","HR123456789"));
	
        
	
	}
	

}
