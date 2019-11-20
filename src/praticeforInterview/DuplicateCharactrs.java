package praticeforInterview;

import java.util.HashMap;
import java.util.Map;

/**
 * @author JainNe
 *
 * count the occurence of any character in the string using hashmap
 *
 *
 *
 */
public class DuplicateCharactrs {

	public static void main(String[] args) 
	{
		
		String a = "Indian";
		
		Map <Character,Integer>map = new HashMap<>();
		
		for (int i =0;i<a.length();i++)
		{
			char c=a.toLowerCase().charAt(i);
			
			
			if (map.get(c)!=null)
			
				map.put(c, map.get(c)+1);
			
			
			else map.put(c, 1);
			
		}
		
		System.out.println(map);
		
		
		
		

	}

}
