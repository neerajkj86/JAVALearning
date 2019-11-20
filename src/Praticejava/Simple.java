package Praticejava;

public class Simple 
{
	
	public static void main(String args[])
	{
	
		Car obj = new Car();
		
		obj.start();
		
		
	}
	
}
	
	class Car
	
	{
		
		private Car() //Private constructor cannot be called in the main method
		{
			
		}
	
	
	public void start()
	{
		System.out.println("Parent Car Start Logic");
	}
	
	public void Stop()
	{
		System.out.println("Parent Car Stop Logic");
	}
	
	public void ReFuel()
	{
		System.out.println("Parent Car Refuel Logic");
	}

}

 
	 