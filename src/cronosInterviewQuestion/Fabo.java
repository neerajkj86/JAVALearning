package cronosInterviewQuestion;

public class Fabo {

	//1, 1 ,2,3,5,8,13
	public static void main(String[] args) 
	{
		
		int n1=1 ,n2=2;
		int n3=0;
		
		for (int i=1;i<5;i++)
		{
			n3 = n1+n2;
			
		
		
		System.out.print(" "+n3);
		
		n1 = n2;
		n2 = n3;
		}
	}

}
