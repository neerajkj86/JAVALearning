package genapctHeadstrongInterview;

public class Fabonnaciseries {

	// 0,1,1,2,3,5,8,13,21,34
	
	/**
	 * @param args
	 * 
	 * Fibonacci Series without using recursion
Fibonacci Series using recursion
	 */
	public static void main(String[] args) 
	{
		
		int n1 =0,n2=1,n3,i,count=10 ;
		
		System.out.print(n1+" "+n2);
		
		
		for (i=2;i<count;i++)
		{
			n3 = n1+n2;
			System.out.print(" "+n3);
			
			n1= n2;
			n2 = n3;
		}
		

	}

}
