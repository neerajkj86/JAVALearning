package interfacedemo;

public class TestClass {

	public static void main(String[] args) {
	
		Pnb p = new Pnb();
		
		System.out.println("ROI:"+p.rateOfInterest());
		
		bank b = new SBI();
		
		System.out.println("ROI:"+b.rateOfInterest());
		
	}

}
