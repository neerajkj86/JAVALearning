package oopsconcepts;


//Q) Why is the Java main method static?
//Ans) It is because the object is not required to call a static method. 
//If it were a non-static method, JVM creates an object first then call main() 
//method that will lead the problem of extra memory allocation.
public class Nonstaticvariable {

	
	static int i=5;
	public static void main(String[] args) {
	
		System.out.println(i);
		

	}

}
