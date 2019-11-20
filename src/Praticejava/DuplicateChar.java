package Praticejava;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateChar {

	public static void main(String[] args) {
		
		String S = "Engineer"; //Single String to find the duplicate characters and occurence 

		FindDuplicateCharacters(S);
		
	}
	
	
	public static void FindDuplicateCharacters(String S)
	
	{
		
		char[] characters =S.toCharArray() ; //First we will convert it into character Array
		
		Map<Character,Integer> map = new HashMap<Character, Integer>();
		
		for (Character c:characters)
			
		{
			if (!map.containsKey(c))
			{
				map.put(c, 1);
		}
			else 
			{
				map.put(c, map.get(c)+1);
			}
				
			
		}
		
		
		//Now our target to print the keys which is having value more than 1 for that we wil use key sets 
		
		
		
	Set <Character> keys=map.keySet();
	
	for(Character ch:keys)
	{
		if (map.get(ch)>1)
		{
			System.out.println("Key and value for duplicate characters are " +ch+" "+ +map.get(ch));
		}
	}
		
		
		
		
		
		
	}

}
