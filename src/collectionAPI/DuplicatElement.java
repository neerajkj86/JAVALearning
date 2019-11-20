package collectionAPI;

import java.util.HashSet;
import java.util.Set;

public class DuplicatElement {

	public static void main(String[] args) {
		
		String names[] = {"Java","Ruby","Ruby","Python","Java"};
		
		
		Set <String> store = new HashSet<>(); //using hashset we can find duplicate elements also
		
//		store.add(e)
		
		for(String name:names) {
			
		//	Duplicatefinder.add("Neeraj");
			
			//System.out.println(name);
			if (store.add(name)==false)
				System.out.println("Duplicate element is "+name);
			
		}
		
		

	}

}
