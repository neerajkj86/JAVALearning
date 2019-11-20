package praticeforInterview;

import java.util.Collection;

import collectionAPI.Arraylist;

public class Duplicateelementarray {

	public static void main(String[] args) {
		
		String names[] = {"Java","Ruby","Ruby","Python","Java"};
		
		//Arraylist values = new Arraylist();
		
		for (int i =0;i<names.length;i++) //time complexity o(n)2 //worse implementation to do
		{
			for (int j=i+1;j<names.length;j++)
			{
				
				if (names[i].equalsIgnoreCase(names[j])) {
					System.out.println("Duplicate elements are "+names[i]);
				}
			}
			
				
		}
		
	
		
		
	}

}
