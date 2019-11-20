package collectionAPI;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class JavaInterviewQuestion {

	public static void main(String[] args) {
		
		 findDuplicateCharacter();
		{
			
		}
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void findDuplicateCharacter()
	{
		String str = "statistics";
		
	char[]a=str.toCharArray();
	
	Map<Character, Integer> map = new HashMap<Character, Integer>();
	
	for (Character ch : a)
	{
	
		if (!map.containsKey(ch))
		{
			map.put(ch, 1);
		}
		else 
		{
			map.put(ch, map.get(ch)+1);
		}
	}
	
	Set<Character> value  = map.keySet();
	
	for(Character ch:value)
	{
		if (map.get(ch)>1)
		{
			System.out.println("Key and value for duplicate characters are " +ch+" "+ +map.get(ch));
		}
	}
	
	
	
	
		
		
		 
		
		
		
		
		
	}
	
}


