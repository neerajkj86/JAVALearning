package abstractdemo;

public class AdvanceCal implements Calc

{

	public static void main(String[] args) 
	
	{
		
		//Calc Abc = new Calc(); 
		
		AdvanceCal obj1= new AdvanceCal();
		
		obj1.add();
		obj1.sub();
		obj1.calculateCos();
		obj1.calculateSin();
		
	}
	
	public void calculateCos()
	{
		System.out.println("I am in Advance Cal-COS Method");
	}

	public void calculateSin()
	{
		System.out.println("I am in Advance Cal-SIN Method");
	}

	@Override
	public void add() {
		
	}

	@Override
	public void sub() {
		
		
	}

}
