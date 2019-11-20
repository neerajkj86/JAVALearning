package collectionAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class lambdaDemo3 {

	public static void main(String[] args) 
	{
		
		List<String> name = new ArrayList<String>();
		
		//List <String> values = Arrays.asList(a);
		
		name.add("Neeraj");
		
		name.add("Rahul");
		
		name.add("Pawan");
		
		name.add("sachin");
		
		
		for (int i=0 ;i<name.size();i++)
		{
			System.out.println("Using Nornal For loop"+name.get(i));
		}
		
		
		for(String a :name)
		{
			System.out.println("Using Enhanced for loop"+a);
		}
		
		
		name.forEach(s->System.out.println("Using Lambda Expression"+s)); // lambda expression
		
		
		
		
		
	}

}
