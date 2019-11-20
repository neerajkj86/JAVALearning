package abstractdemo;

public class FactorialNumber {

	
	public static int factNumber(int num) //Fact 4=4*3*2*1

	{
		int n=1;
		for (int i=1;i<=num;i++)
		{
			n=n*i;
		}
	
	return n; 
	}
	
	
	public static void main(String[] args) 
	{
		
		int p=factNumber(6);
		
		System.out.println(p);
		
		
	}

}
