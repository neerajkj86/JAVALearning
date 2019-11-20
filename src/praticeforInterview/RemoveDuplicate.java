package praticeforInterview;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicate {

	/**
	 * String s = "Selenium"

We need to remove duplicates in a given string.
The output should be,
Selnium
Create HashSet to maintain insertion-order
Convert given/test String into character-array using toCharArray(); method
Iterate through char[] array using enhanced for-each loop
Leave spaces, as it isn’t considered while deleting/removing duplicate occurrences/characters
While iterating, check whether character already present in LinkedHashSet
If not present in LinkedHashSet, then add that particular character into LinkedHashSet using add(); method; otherwise leave it, as it is duplicate character/occurence
finally, print to console

	 */
	public static void main(String[] args) {
		
		
		String S = "Selenium";
		
		Set<Character> set=new LinkedHashSet<Character>();
		StringBuilder sb = new StringBuilder();
		
	char[]a =S.toCharArray();
		
	for (Character ch: a)
	{
		if (!set.contains(ch))
		
			set.add(ch);
		sb.append(ch);
		
		
	}
	
	
	System.out.println("After removing duplicate : " + set);
	
	
	
	
	
	
	
	
	
	
	
	
	System.out.println("String after duplicates removed : " + sb.toString());
	}
	
	}


