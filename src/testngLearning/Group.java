package testngLearning;


import org.testng.annotations.Test;


public class Group 
{
	// soft assertion is used if we want to execute the full code despite there are some failure in the code at different level.
	
	@TestStudent4(groups= {"Sanity"})
	public void A()                   //Lets assume test B is dependent on test A
	{
	System.out.println("In test A");
	
	}
	@TestStudent4 (dependsOnMethods = "A", groups= {"Sanity","Smoke"})
	public void B()
	{
	System.out.println("In test B");
	
	}
	@TestStudent4(groups = {"Regression"})
	public void C()
	{
	System.out.println("In test C");
	
	//Assert.fail("Failed due to some reason");
	
	}
	@TestStudent4(groups= {"Functional"})
	public void D()
	{
	System.out.println("In test D");
	
	}
	
	

}
