package Praticejava;

public class StringReverse2 {

	
	public static void main(String[] args) 
	{
		
          String S1 = "Neeraj";
          
          String Rev="";
          
         int Lenth= S1.length();
         
         
          
         for (int i=Lenth-1;i>=0;i--)
         {
        	 Rev= Rev+ S1.charAt(i);
         }
         
         System.out.println("Reverse String is "+Rev);
	}

}
