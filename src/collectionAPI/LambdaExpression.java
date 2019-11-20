package collectionAPI;

//If a Interface is having only one method then this is called as Functional Interface and Lambda expression can be used with functional interface only.
//if an Interface is having two methods then it is called as Normal Interface
// if an Interface is having no method that is known as Marker Interface eg serializable 

@FunctionalInterface
interface A
{
	void show (int i);
	default void bc() // we can declare a method with body inside a  fuctional interface..
	{
		
	}
	
}

/**
 * The Lambda expression is used to provide the implementation of an interface which has functional interface. 
 * It saves a lot of code. In case of lambda expression, 
we don't need to define the method again for providing the implementation. 
Here, we just write the implementation code.
 *  Lambda Expression is    (argument list)->{body}
 */







// by using lamba exprerssion we are reducing the code as we dont required to create a class which is just going to implement the functional interface method that can be done via lamba

public class LambdaExpression {

	public static void main(String[] args) 
	{
		
	A obj =(i) -> System.out.println("i am the best"+i);
		
	obj.show(4);

	}

}
