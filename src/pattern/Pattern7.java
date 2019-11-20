package pattern;


/**
 * @author  
 *  JainNe
 *  
 *  J A V A
 *    A V A
 *      V A
 *        A
 *      
 *
 */
public class Pattern7 {

	public static void main(String[] args) {
		
		
		String s= "JAVA";
		
		for (int i =1;i<=4;i++)
		{
			for (int j =1;j<=4;j++)
			{
				
				if (j<i)
				{
					System.out.print(" ");
				}
				else
				
				System.out.print(s.charAt(j-1)+" ");
			}
			
			System.out.println();
		}		
	
		
	}

	}


