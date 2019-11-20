package genapctHeadstrongInterview;

import java.util.HashSet;
import java.util.Set;

public class DuplicateinArray {

	public static void main(String[] args) {
	
		int a [] = {3,4,5,7,90,22,22,4,3};
		
		for (int i =0;i<a.length;i++)
		{
			for (int j=i+1;j<a.length;j++)
			{
				if (a[i]==a[j])
				{
					System.out.println(a[i]);
					
					break;
				}
			}
		}

		
		Set<Integer> values = new HashSet<Integer>();
		
		for (int p:a)
		if (values.add(p)==false)
		{
			System.out.println("duplicate values are" +p);
		}
		
	}

}
