package praticeforInterview;

import cronosInterviewQuestion.*;
import praticeforInterview.*;;

public class TestStudent4 {

	public static void main(String[] args) {
		SBI s = new SBI();
		
		ICICI i = new ICICI();
		
		Axis a = new Axis();
		
		Bank b = new SBI(); //referece variable from parent class but calling 
		
		Bank c = new Bank();
		
		//Bank.getRateOfInterest();
		
		
		System.out.println("SBI Rate of Interest: "+s.getRateOfInterest());  
		System.out.println("ICICI Rate of Interest: "+i.getRateOfInterest());  
		System.out.println("AXIS Rate of Interest: "+a.getRateOfInterest()); 
		//System.out.println("Bank Rate of Interest"+b.getRateOfInterest());
		//System.out.println("Bank Rate of Interest"+c.getRateOfInterest());
	}

}
