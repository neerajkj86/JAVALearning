package collectionAPI;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapEntryset {

	public static void main(String[] args) {
		
		Map <Integer,String> words = new HashMap <Integer, String>(); 
		
		words.put(1, "Java");
		
		words.put(2, "selenium");
		
		words.put(3, "Appium");
		
		words.put(4,"TestNG");
		
		System.out.println(words);
		
		
		//Keyset Function for getting all the keys and this retuns the set
		
	Set<Integer> keys=words.keySet();
		
	System.out.println(keys);

	
	Set set = words.entrySet();
	
	System.out.println("Set Values are " +set);
	

	//Entryset is used to get Set view of the mapping 
	
	
	}
	
}
