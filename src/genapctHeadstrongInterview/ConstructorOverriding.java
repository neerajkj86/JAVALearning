package genapctHeadstrongInterview;

public class ConstructorOverriding {

	public static void main(String[] args) 
	{
			
	Animal obj = new Dog();
	
	obj.move();
	
	
	
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	class Animal {
		   public void move() {
		      System.out.println("Animals can move");
		   }
		}

		class Dog extends Animal {
		   public void move() {
		     super.move();   // invokes the super class method
		      System.out.println("Dogs can walk and run");
		   }
		}
	
	
	

}
