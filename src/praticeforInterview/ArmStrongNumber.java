package praticeforInterview;

public class ArmStrongNumber {

	public static void main(String[] args) {
		
		armStrongNum(5444);
		
	}
	
	
	
	public static int armStrongNum(int n)
	{
		
		int r ;
		
		int cube=0;
		
		int temp = n;
		
		while (n>0)
		{
			r = n%10;
			cube =cube+r*r*r;
			n=n/10;
		}
		
		if (temp==cube)
		{
			System.out.println("Given Number is ArmString Number");
		}
			
		else 
		{
			System.out.println("Given Number is not ArmString Number");
		}
		
		
		
		
		
		
		
		return cube;
		
	}

}
