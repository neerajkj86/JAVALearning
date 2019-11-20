package Praticejava;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashmapEntryset {

	public static void main(String[] args) {
		
		
			      
			      // create hash map
			      HashMap<Integer,String> newmap = new HashMap<Integer,String>();

			      // populate hash map
			      newmap.put(1, "tutorials");
			      newmap.put(2, "point");
			      newmap.put(3, "is best");

			      // create set view for the map
			      Set<Entry<Integer, String>> set = newmap.entrySet();

			      // check set values
			      System.out.println("Set values: " + set);
			   }    
			}
		
		
	


