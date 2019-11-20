package java8Features;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;



/**
 *   I have to filter even values from the given list  
 * 
 * 
 * 
 *
 *
 */
public class StreamAPI {

	public static void main(String[] args) 
	{
		
		List<Integer> values = new ArrayList<Integer>();
		
		values.add(0);
		
		values.add(5);
		
		values.add(10);
		
		values.add(15);
		
		values.add(20);
		
		values.add(25);
		
		System.out.println(values);
		
		values.forEach(i->System.out.println(i));
		
		List<Integer> valueseven =values.stream().filter(i->i%2==0).collect(Collectors.toList());
		
		System.out.println(valueseven);
		
		
		
		
		
		
		
		

	}

}
