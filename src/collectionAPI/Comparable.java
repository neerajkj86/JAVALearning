package collectionAPI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Comparable {

	public static void main(String[] args) {
		
		List<Laptop> laps = new ArrayList<>();
		
		laps.add(new Laptop("dell", 16, 6000000));
		
		laps.add(new Laptop("Apple",32, 5000));
		
		laps.add(new Laptop("acer", 40, 5900));
		
		Comparator<Laptop> com = new Comparator<Laptop>() 
		{
			
			public int compare(Laptop o1, Laptop o2) {
				
				if (o1.getPrize()> o2.getPrize())
				
					return 123;
				
				else 
					
					return -1;
		
			}
		};
		
		Collections.sort(laps, com);
		
		for (Laptop l : laps)

		{
			System.out.println(l);
		}
		
		
		
		
		
	}

}
