package collectionAPI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class ArrayList2 {

	public static void main(String[] args) throws Exception
	{
		
		
		List<Integer> values=  new ArrayList<Integer>();
		
		
		values.add(2);
		values.add(53);
		values.add(5);
		values.add(56);
		values.add(1, 27);
		values.add(5);        //we can add duplicate values also in the List or arraylist...
		
		
		
		values.add(3, 44); //adding value at a particular index
		
		//Collections.sort(values); //sorting using collections classs
		for (int i : values) {
		System.out.println(i);
		}
	

	}

}
