package Praticejava;

public class Constructoroverirding extends Override

{
	//By rule in Java, a constructor cannot be overridden but a method can be overridden.
	
	public void Override() //without void we will get the compile time error
	{
		System.out.println("I am in child Constructor");
	}



	public static void main(String[] args) 
	{
		
		Override obj = new Override();
		
		System.out.println(obj);
		
	}

}
