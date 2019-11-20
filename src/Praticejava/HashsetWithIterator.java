package Praticejava;

import java.util.HashSet;
import java.util.Iterator;
	
/**
 * @author JainNe
 * 
 * hashset store the elenment on basis of hashing concept 
 * Hashset does not maintain the insertion order and store the element based on hashcode
 * hashset does not allow duplicate values
 * allow null values
 *not sysncornized (fast)
 *inital capaity is 2*4 =16 and load factor is 0.75 
 *
 *
 */
public class HashsetWithIterator {

	public static void main(String[] args) 
	{
		
	HashSet<String> set = new HashSet();
	
	set.add("One");    
    set.add("Two");    
    set.add("Three");   
    set.add("Four");  
    set.add("One");  
    
    Iterator<String> iterator = set.iterator();
    
    while (iterator.hasNext())
    {
    	System.out.println(iterator.next());
    }
		
	
		
		
	}

}
