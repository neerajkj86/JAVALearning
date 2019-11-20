package genapctHeadstrongInterview;

public class Fabonnaciseries2 {

	// 0,1,1,2,3,5,8,13,21,34
	
	/**
	 * @param args
	 * 
	 * Fibonacci Series without using recursion
Fibonacci Series using recursion
	 */
	public static void main(String[] args) 
	{
		 int count= 10;
		 System.out.print(n1+" "+n2);//printing 0 and 1  
		fabseries(count-2);
		
		
		

	}
	
	
	
	
	
	static int n1=0,n2=1,n3=0; 
	public static void fabseries(int count)
	{
       if (count >0)
       {
    	   n3 = n1+n2;
    	   n1 = n2;
    	   n2 =n3;
    	   System.out.print(" "+n3);
    	   
    	   fabseries(count-1);
       }
		
	}
	
	
	
	

}
