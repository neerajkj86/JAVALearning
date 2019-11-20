package Praticejava;

import java.util.HashMap;

public class CountACharacter {

	public static void main(String[] args) {
		
		String s = "javaj2ee"; //count the occurence of any character in the string using hashmap

		HashMap<Character, Integer> hm = new HashMap<>();
		
		//System.out.println(hm);
		
		for (int i =0;i<s.length();i++)
			
		{
			char c =s.charAt(i);
			
			if (hm.get(c)!=null) //get will return the value of key i.e character from the string.
			{
				
				hm.put(c, hm.get(c)+1);
			}
			
			else 
			hm.put(c, 1);	
		}
		
		System.out.println(hm);
	
		
		
		
	}
	}
		
		
