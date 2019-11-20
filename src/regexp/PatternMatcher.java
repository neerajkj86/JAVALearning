package regexp;

import java.util.regex.Pattern;

/**
 * @author JainNe
 *  Create A Regular expression that accept alpha numeric characters only and lenght should not be more than 9 charcters
 *
 *
 */
public class PatternMatcher {

	public static void main(String[] args) {
		
         Boolean result= Pattern.matches("[a-zA-Z0-9]{9}", "NEERAJ123");
	
         System.out.println(result);
	
	}
	

}
