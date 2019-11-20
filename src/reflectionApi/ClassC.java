package reflectionApi;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class ClassC   

{
	
	public static void main(String[] args) {
		
		ClassA obj = new ClassA();
		
		Class claze=obj.getClass();
		
	Constructor[] cons = claze.getConstructors();
	
	System.out.println(cons.length);
	
	System.out.println(claze.getName());
	
	Method[] arrayofmethods=claze.getDeclaredMethods();
	
	for (Method m:arrayofmethods )
	{
		System.out.println(m.getName());
	}
	
	
	
	}
	

}
