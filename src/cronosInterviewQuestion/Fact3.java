package cronosInterviewQuestion;

public class Fact3 {

	//5 = 5*4*3*2*1;
	public static void main(String[] args) 
	{
		
	int p=fact(5);
		
		System.out.println(p);

	}
	
	
	public static int fact (int n)
	
	{
		
		if (n==0)
		return 1;
		else 
			
			return n*fact(n-1);
		
		
		
		
		
		
	}

}
