package abstractdemo;

import java.util.Vector;

//Arraylist is the winner. 50 % increase the memory. 

public class VectorDemo2 {

	public static void main(String[] args) {
		
	Vector<Integer> V = new Vector<Integer>(); //increase the capacity by 100 % //Synchronized//Threadsafe
	
	V.add(4);
	
	V.add(6);
	
	V.add(4);
	
	V.add(1); 
    V.add(2); 
V.add(4);
	
	V.add(6);
	
	V.add(4);
	
	V.add(1); 
    V.add(2);
    
    V.add(2);
    V.remove(4);
    for (int i: V)
    {
    	System.out.println(i);
    }
    
	System.out.println(V.capacity());
	
	
	
	}

}
