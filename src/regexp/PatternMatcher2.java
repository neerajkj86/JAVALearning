package regexp;

import java.util.regex.Pattern;

/**
 * @author JainNe
 *  Create A Regular expression that accept 10 digit numeric characters only and starting from 7 ,8,9, only ..
 *  assume password for a login fields 
 *
 *
 */
public class PatternMatcher2 {

	public static void main(String[] args) {
		
         Boolean result= Pattern.matches("[789]{1}[0-9]{9}","0123456789" );
         System.out.println(result);
         
         System.out.println(Pattern.matches("[789]{1}[0-9]{9}","9123456789"));
	
        
	
	}
	

}
