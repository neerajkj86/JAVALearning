package cronosInterviewQuestion;

public class Fact2 {

	//5 = 5*4*3*2*1;
	public static void main(String[] args) 
	{
		
		int n =5;
		int fact =1;
		
		
		for (int i =1;i<=n;i++)
		{
			fact= fact*i;
		}
		
		System.out.println(fact);
		
		

	}

}
