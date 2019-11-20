package collectionAPI;

import java.util.ArrayList;
import java.util.List;

//If a Interface is having only one method then this is called as Functional Interface and Lambda expression.
//if an Interface is having two methods then it is called as Normal Interface
// if an Interface is having no method that is known as Marker Interface eg serialization.



/**
 * The Lambda expression is used to provide the implementation of an interface which has functional interface. 
 * It saves a lot of code. In case of lambda expression, 
we don't need to define the method again for providing the implementation. 
Here, we just write the implementation code.
 *  Lambda Expression is    (argument list)->{body}
 */







// by using lamba exprerssion we are reducing the code as we dont required to create a class which is just going to implement the functional interface method that can be done via lamba

public class LambdaExpression2 {

	public static void main(String[] args) 
	{
		
		List<String> list=new ArrayList<String>();  
        list.add("ankit");  
        list.add("mayank");  
        list.add("irfan");  
        list.add("jai");  

        list.forEach(
        		
        		(n)->System.out.println(n)
        		);

	}

}
