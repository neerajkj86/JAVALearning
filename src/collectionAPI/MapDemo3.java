package collectionAPI;

import java.util.HashMap;
import java.util.Map;

public class MapDemo3 {

	public static void main(String[] args) {
		
		//HashMap<String, String> obj =  new HashMap<String, String>();
		
	Map<Integer, String> obj =  new HashMap<Integer, String>();
	
	obj.put(77, "Neeraj");
	
	obj.put(2, "Rahul");
	
	obj.put(43, "Sachin"); //if i will try to give the same key again then it will override the value not the key... see this result
	
	// also if we give the duplicate entry ie same key and value again then it will take one entry only..means duplicate entry is not allowed.
	
	obj.put(43, "sachin");
	
	obj.put(9000, "Selenium"); //its not giving the result in the order of keys ,,so remember this logic 
	//System.out.println(obj);
	
	//Get is used to get any specicifc kya value
	
	String Value =obj.get(1);

	//System.out.println("Values from Map is "+Value);
	
	//System.out.println(obj.hashCode());
	
	        System.out.println(obj.entrySet());
	//System.out.println(obj);	
		
	        for (Map.Entry<Integer, String> data:obj.entrySet())
	        {
	        System.out.println("Key from Map is "+data.getKey()+"and Value is "+  data.getValue());
	        }
	
		

	}

}
