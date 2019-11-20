package pattern;

public class Pattern3 {

	public static void main(String[] args) {
		
		
//		  *
//	    * * 
//	  * * * 
//  * * * * 
//* * * * *

		
		for (int i=1;i<=5;i++) //i=1;j=4
		{
			for(int j=4;j>=i;j--)  
			{
			System.out.print(" ");	
			}
			
		
		
		for (int k=1;k<=i;k++)
		{
			System.out.print("*");
			
		}
	System.out.println(); 
		
		}
	}

}
