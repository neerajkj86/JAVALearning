package Praticejava;

public class StringReverse4 {

	
	public static void main(String[] args) 
	{
		
          int num = 131;
          
          int temp ;
          
          int sum=0;
          int r=0;
          temp=num;
          
          while(num>0) {
        	  
        	  r = num%10;      // 13%10 =3 sum=1
        	  sum = sum*10+r;      // 131
        	  num =num/10;
        	  
        	  
        	  
          }
          
          System.out.println("Reverse number is"+sum);
          
     
          
          
	}       

}
