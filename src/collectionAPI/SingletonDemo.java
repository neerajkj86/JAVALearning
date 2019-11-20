package collectionAPI;

/**
 * @author JainNe
 * Single instance of each class we will not allow to create 2 object of same class that is the purpose
 * 
 * Create Static instance VaRIABLE First
 * create a private constructor 
 * create static method which retrun the object 
 */
public class SingletonDemo {

	
	
	
	
	
	public static void main(String[] args) 
	{
	
		Abc obj1 = Abc.getInstance(); // this is the only way to initate the object variable we cannot create using new keyword 
		
		Abc obj2 = Abc.getInstance();
		
		
		
	}	
}


class Abc
{
	static Abc obj = new Abc(); //early initilazation but we can do lazy initalization as well which we will see later
	
	private Abc()
	{
		
	}
	
	public static Abc getInstance()
	{
		return obj;
		
	}
	
	
	
	
	
	
}




