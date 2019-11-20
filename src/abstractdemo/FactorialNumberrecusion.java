package abstractdemo;

public class FactorialNumberrecusion {

	
	public static int fact(int num) //Fact 4=4*3*2*1

	{
		
		
		if (num==0)
			return 1;
		else
			return 
				num*fact(num-1);
		
	}
	
	
	public static void main(String[] args) 
	{
		
		int p=fact(6);
		
		System.out.println(p);
		
		
	}

}
