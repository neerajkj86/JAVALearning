package Praticejava;

import java.util.HashMap;

import java.util.Map;
import java.util.Set;

public class DuplicateArray4 {

	public static void main(String[] args) {
		
		String [] names = {"Java","Python","Ruby","JavaScript" ,"Java"};
		
		Map<String, Integer> values = new HashMap<String, Integer>();
		
		for (String name: names)
		{
			Integer count  =values.get(name);
			if (count ==null)
			{
				values.put(name, 1);
			}
			
			else {
				values.put(name, count++);
			}
			
		}
		
		
		// get the values from the map
		
	Set<String> keys=values.keySet();
	
	for (String key: keys)
	{
		if (values.get(key)>1)
			System.out.println("Duplicate array are"+key+ values.get(key) );
	}
		

	}

}
