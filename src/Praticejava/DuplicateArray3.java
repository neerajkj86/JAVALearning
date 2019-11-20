package Praticejava;

import java.util.HashSet;
import java.util.Set;

public class DuplicateArray3 {

	public static void main(String[] args) {
		
		String [] names = {"Java" , "Python","Ruby","Java Script" ,"Java"};
		
		Set<String> values = new HashSet<String>();
		
		for (String name: names)

		{
			if (values.add(name)==false)
			{
				System.out.println("Duplicate value is "+name);
			}
		}

	}

}
