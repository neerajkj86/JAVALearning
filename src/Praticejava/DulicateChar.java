package Praticejava;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DulicateChar {

	public static void main(String[] args) {
		
		
		String S = "indian";
		
	//	char S1=S.charAt(2);
		
		//System.out.println(S1);
				
		char[] characters =S.toCharArray();		//convert String to character Array

		
		
		
		Map <Character,Integer> map = new HashMap<Character, Integer>();
		
		for (Character c: characters)
		{
			if (!map.containsKey(c))
			{
				map.put(c, 1); //here 1 occurenece if key c
				
				
			}
			
			else
			{
				map.put(Character.toLowerCase(c), map.get(c)+1);
			}
		}
		
	
		Set <Character> keys =  map.keySet(); //set view of the map here
		
		for (char key: keys)
		{
			if (map.get(key)>1)
				System.out.println(key+"--->>"+map.get(key));
		}
		
		
		System.out.println(map);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
}