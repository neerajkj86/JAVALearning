package genapctHeadstrongInterview;

/**
 * @author JainNe
 *
 * 153 is a armstrong number 
 * if 1*1*1+5*5*5+3*3*3 = 153
 *
 */
public class ArmstrongNumber {

	
		
	
	
	public static void main(String[] args) 
	{
	
		int n =133;
		int temp =n;
		int r;
		int cube =0;
		while (n>0)
		{
			r = n%10;
			n =n/10;
			cube = cube +r*r*r;
			
		}
		
		if (temp ==cube)
		{
			System.out.println("Given number is Armstrong ");
		}
		else
			System.out.println("Given number is not Armstrong ");
			

	}

}
