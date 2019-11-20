package thread;

public class MultiThreading2 {

	public static void main(String[] args) {
			MultiRunable t1=new MultiRunable();  
			t1.run();  
			 }  
			
	

}




class MultiRunable implements Runnable{  
	public void run(){  
	System.out.println("thread is running...");  
	}  
	
}