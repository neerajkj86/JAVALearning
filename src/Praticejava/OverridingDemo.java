package Praticejava;



class A{  
protected void msg(){System.out.println("Hello java");}  
}  
  
public class OverridingDemo extends A{  

	protected void msg(){System.out.println("Hello Child Class");}//C.T.Error  
 
public static void main(String args[]){  
	//OverridingDemo obj=new OverridingDemo();
A obj = new OverridingDemo();	
	
   obj.msg();  
   }  
}  