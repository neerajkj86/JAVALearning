package Praticejava;

public interface InterfaceDemo 
{
	//The Java compiler adds public and abstract keywords before the interface method. 
	//Moreover, it adds public, static and final keywords before data members.
	//Interface cannot be instantiated as like abstract class.
	public static final int MIN =10;
	
	
	public abstract void print ();
	
	default void test() //since java 8 we can have default method which can have metod body as well
	{
		
	}
	

}


