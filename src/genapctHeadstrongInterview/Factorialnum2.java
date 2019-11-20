package genapctHeadstrongInterview;


/**
 * @author JainNe
 *  Factorial of 5 would be 5*4*3*2*1 
 *  and for this we are using recursion function 
 * 
 *
 */
public class Factorialnum2 {

	public static void main(String[] args) 
	{
		
		
		int fact =1;
		int i;
		int num = 5;
		
		for (i=1;i<=num;i++)
		{
			fact =fact*i; //     if i =1 then fact =1;when i =2 then fact = 2 ;when i =3 
			//then fact = 2*3=6; when i =4 ;then fact = 6*4 =24 and when when i =5 then it will be fact = 24*5 = 120
		}
			
		System.out.println("Factorial of "+num+" is: "+fact);	
			
			
			
		
		

	}
	
	
	
	
		
		
		
	
	
	
	
	
	

}
