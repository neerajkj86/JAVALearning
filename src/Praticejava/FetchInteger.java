package Praticejava;

public class FetchInteger {

	public static void main(String[] args) 
	{
		
		String S ="ABD12345";
		
		int sum=0;
		String A =S.replaceAll("[a-zA-Z]","");
		
		System.out.println(A);
		
		int n=Integer.parseInt(A);
		
		System.out.println(n);
		int r;
		while (n>0)
		{
			 r=n%10;
		
			 
			n= n/10;
			 
			 sum = sum +r;
		}
		
		System.out.println(sum);

	}

}
