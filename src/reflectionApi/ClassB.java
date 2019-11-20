package reflectionApi;

import java.lang.reflect.Method;

public class ClassB {
    
	public static Class clazz;
	public static void main(String[] args) 
	{
		ClassA obj= new ClassA();
		
		System.out.println(obj.getClass().getName());
		
		clazz=obj.getClass();
	
		clazz.getSimpleName();
		System.out.println(clazz.getSuperclass());
		
	Method[] ArrayofMethod=	clazz.getMethods();
	
	clazz.getDeclaredMethods();
	
	System.out.println(ArrayofMethod.length);
	
	for (Method m: ArrayofMethod)
	{
		System.out.println(m.getName());
	}
	
	
		
		
		
		
	}

}
