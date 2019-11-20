package JavaProgrammes;

public class NumberfromString {

	public static void main(String[] args) {
		
		String s = "Neeraj123";
		
		String A =s.substring(6);
		
		System.out.println(A);
		
		int n=Integer.parseInt(A); //convert String into Integer
		
		int sum = 0;
		int r ;
		while (n>0)
		{
			 r=n%10;
			
			
			sum = sum+r;
			
			n= n/10;
		}
		
		
		System.out.println(sum);
		
		
		
		
	}

}
