package collectionAPI;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
		
		//HashMap<String, String> obj =  new HashMap<String, String>();
		
	Map<String, String> obj =  new HashMap<String, String>();
	
	obj.put("1", "Neeraj");
	
	obj.put("2", "Rahul");
	
	obj.put("1", "Sachin");
	
	//if i will try to give the same key again then it will override the value not the key... see this result 
	
	obj.put("2", "India");
	
	System.out.println(obj);
	
	
	
		

	}

}
