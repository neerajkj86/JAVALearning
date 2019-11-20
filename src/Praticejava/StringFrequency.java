package Praticejava;

public class StringFrequency {

	
	public static void main(String[] args) 
	{
		
          String str = "Welcome to Javatpoint portal";
          
          //System.out.println(S1.charAt(4));
          
          int count =0;
          int lenth= str.length();

          for (int i=0;i<lenth-1;i++) {

        	  if (str.charAt(i) =='t')           {
        		  
        		  count++;
        	  }
          }
          
          System.out.println("Frequescy of t is "+count);
          
          
          
	}

}
