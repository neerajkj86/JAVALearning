package Praticejava;

public class BMW extends Car{

	public void start() // it means we cannot override a  parent class Static method inside the child class
	{
		System.out.println("BMW Start Method Logic");
	}
}
