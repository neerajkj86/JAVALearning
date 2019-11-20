package cronosInterviewQuestion;

public class Armstrong {

	// 153 = 1*1*1+5*5*5 + 3*3*3 = 153 
	public static void main(String[] args) 
	{
		
		int cube =0;
		int n =143;
		int r ;
		int temp = n;
		
		while (n>0)
		{
			r = n%10;
			n = n/10;
			cube = cube + r*r*r; 
			
		}
		
		if (cube == temp)
		System.out.println("Given Number is The Armstrong number ");
		else 
			System.out.println("Given Number is not The Armstrong number ");
		
		
		
	}

}
