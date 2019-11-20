package genapctHeadstrongInterview;


/**
 * @author JainNe
 *  Factorial of 5 would be 5*4*3*2*1 
 *  and for this we are using recursion function 
 * 
 *
 */
public class Factorialnum {

	public static void main(String[] args) 
	{
		
		int p=	fact(5);
		
		System.out.println(p);
		

	}
	
	
	
	
	public static int  fact(int n)
	{
	
	if (n==0)
	{
		return 1;
	}
	else 
	
		return n*fact(n-1);
		
		
		
		
		
	
		
		
		
	}
	
	
	
	
	

}
