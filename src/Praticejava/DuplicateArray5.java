package Praticejava;

import java.util.HashMap;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateArray5 {

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
	
	Set <Entry <String ,Integer>> entryset=values.entrySet();
	
	for (Entry <String ,Integer> entry: entryset )
	{
		if (entry.getValue()>1)
		{
			System.out.println("duplicate values are"+entry.getKey());
		}
	}
	
	}

}
