package Praticejava;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateWords {

	public static void main(String[] args) {
		
		FindDuplicateWords("selenium is java and java is strong language java");
		
		
		

	}

	public static void FindDuplicateWords(String S) 
	{
		
		String [] words  =S.split(" "); //Here we are spliting the String Based on the Space on each words so that we can iterate the map
		
		
		
		Map <String,Integer> wordscount = new HashMap<String,Integer>() ; 
		
		for (String word: words)
		{
			if (!wordscount.containsKey(word))
			{
				wordscount.put(word, 1);
			}
			
			else 
			{
				wordscount.put(word.toLowerCase(), wordscount.get(word)+1);
			}
		}
		
		
		
	Set<String> keys =wordscount.keySet();
	
	for (String key: keys)
	{
		if (wordscount.get(key)>1)
		{
			System.out.println(key+"--->>  " +wordscount.get(key));
		}
	}
	
	
	
	
	
	
	
	
	
	
		
		
		
		
		
		
	}

}
