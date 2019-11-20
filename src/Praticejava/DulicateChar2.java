package Praticejava;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DulicateChar2 {

	
	
	/**
	 * this Programme is for using hashmap for duplicate elements in th given String
	 */
	public void DuplicateCharsInString(String S)
	
	
	{
		Map<Character,Integer> map = new HashMap<Character, Integer>();
		
		char[] characters=S.toCharArray();  //Convertng String into Char array to iterate
		
		/**
		 *  here we are using hashmap of Characters and integer to check if that character is already in the map or not?
		 */
		
		
		for (char c: characters)
		{
			if (!map.containsKey(c))
			{
				map.put(c, 1);
			}
			
			else {
				map.put(c, map.get(c)+1);
				
			}
			
			 
		        }
		
		Set<Character> keys = map.keySet();
        for(Character ch:keys){
            if(map.get(ch) > 1){
                System.out.println(ch+"--->"+map.get(ch)); //printing key and value which is more than once
		
		}
		
        }
	}
	
            
            public static void main(String[] args) {
        		
        		
            	DulicateChar2 dcs = new DulicateChar2(); 
               // dcs.findDuplicateChars("Java2Novice");
        		dcs.DuplicateCharsInString("Java2Novice");
        	}		
        	
}
            