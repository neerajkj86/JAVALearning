/**
 * 
 */
package praticeforInterview;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @author JainNe
 *
 *
 *
 */
public class RemoveDuplicateString {

	
	public static void main(String[] args) 
	{
		
		Set <Character> set = new LinkedHashSet<Character>();
		
		String S = "Selenium";
		
		char[]a =S.toCharArray();
		
		
		for (Character ch:a)
		{
			boolean checkChar = set.contains(ch);
			if (!checkChar)
			{
				set.add(ch);
			}
			
			
		}
		
		System.out.println("After removing duplicate : " + set);
		
	}

}
