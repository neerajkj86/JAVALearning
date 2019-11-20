package abstractdemo;

public class AbstractD {

	public static void main(String[] args) 
	{
		
		//maheshPhone obj = new maheshPhone();
		
		//obj.call();
		
		
		
	}

	
}


abstract class maheshPhone
{
	
	public void call()
	{
		System.out.println("calling");
	}
	
	
	public abstract void move(); //abstract method
	
	public abstract void dance ();
	
	public abstract void cook();
	
	
}


class rameshPhone extends maheshPhone
{

	@Override
	public void move() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dance() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cook() {
		// TODO Auto-generated method stub
		
	}

	
	
}

