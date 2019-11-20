package Praticejava;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StringWordsInterviewQuestion {

	public static void main(String[] args) {
		
		FindDuplicateWords("selenium is java and java is strong language java");

	}

	
	public static void FindDuplicateWords(String S)
	{
		
		
		String [] words=S.split(" ");
		
		Map<String,Integer> map = new HashMap<String, Integer>();
		
		for (String word:words)
		{
			if (!map.containsKey(word))
			{
				map.put(word, 1);
			}
			
			else
			{
				map.put(word, map.get(word)+1);
			}
		
		
		}
		
		
	Set <String> keys= 	map.keySet();
		
		for (String key:keys)
		{
			if (map.get(key)>1)
			{
				System.out.println(key+"........"+map.get(key));
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
}
