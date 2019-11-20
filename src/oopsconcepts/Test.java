package oopsconcepts;

public class Test {

	public static void main(String[] args) {
		SBI s = new SBI();
		
		ICICI i = new ICICI();
		
		Axis a = new Axis();
		
		Bank b = new SBI(); //referece variable from parent class but calling 
		
		Bank c = new Bank();
		
		System.out.println("SBI Rate of Interest: "+s.getRateOfInterest());  
		System.out.println("ICICI Rate of Interest: "+i.getRateOfInterest());  
		System.out.println("AXIS Rate of Interest: "+a.getRateOfInterest()); 
		System.out.println("Bank Rate of Interest"+b.getRateOfInterest());
		System.out.println("Bank Rate of Interest"+c.getRateOfInterest());
	}

}
