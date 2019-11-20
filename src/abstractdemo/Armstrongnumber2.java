package abstractdemo;

public class Armstrongnumber2 {

	public static void main(String[] args) 
	{
		
		isArmstrongnumber(371);
	}
	
	
	public static void isArmstrongnumber(int n)
	{
	int t = n;
	int r;
	int cube =0;
	
	
		while (n>0)
		{
			r = n%10;
			n= n/10;
			
			cube = cube +(r*r*r);
			
			
			
		}
		
		if (t==cube)
		{
			System.out.println("this is armstrong number");
	}
		else
		{
			System.out.println("this is not armstrong number");
		}
	}
	
	
	

}
