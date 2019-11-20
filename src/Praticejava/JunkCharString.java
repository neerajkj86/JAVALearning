package Praticejava;

public class JunkCharString {

	public static void main(String[] args) {
	
		String S = "Neeraj@#$%^";

		//Regular Expression [a-zA-Z0-9]
		
		String s1= S.replaceAll("[^a-zA-Z0-9]", "");
		
	
		
		//System.out.println(s1);
		
		
		
		
		String S2 = "Neeraj123";
		
		
		String S3=S2.replaceAll("[a-zA-Z]","");
		
		
		System.out.println(S3);
		
		
		
		int sum = 0; 
		
		int n=123;
        
        while (n != 0) 
        { 
            sum = sum + n % 10; 
            n = n/10; 
        } 
		
        System.out.println(sum); 
		
		
		
		//System.out.println(S3.valueOf(S3));
		
		
		//int i=Integer.parseInt("S3");  
		
		//System.out.println(i);
		
	}
	

}
