package collectionAPI;



public class SingletonLazyInit {

	public static void main(String[] args) {
		
		Ab.GetInstance();
		Ab.GetInstance(); //only once instance is created here

	}

}




class Ab{

	public static Ab obj;
	
	private Ab()
	{
		System.out.println("Instance Created");
	}
	
	public static Ab GetInstance()
	{
		
		if (obj ==null)
		obj = new Ab();
		return obj;
		
	}
	
	
}