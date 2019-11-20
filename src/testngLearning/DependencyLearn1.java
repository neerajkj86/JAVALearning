package testngLearning;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyLearn1 {

	@TestStudent4 (groups="Sniff")
	public void testcase1()
	{
		System.out.println("I am in test 1");
		Assert.fail("Test Failed");
	}
	
	@TestStudent4 (dependsOnMethods ="testcase1",groups="Sniff")
	public void testcase2()
	{
		System.out.println("I am in test 2");
	}
	
	@TestStudent4(dependsOnMethods="testcase1")
	public void testcase3()
	{
		System.out.println("I am in test 3");
	}
	
	@TestStudent4(dependsOnMethods="testcase1",alwaysRun=true)
	public void testcase4()
	{
		System.out.println("I am in test 4");
	}
	
	@TestStudent4(dependsOnMethods="testcase1",groups="Sniff")
	public void testcase5()
	{
		System.out.println("I am in test 5");
	}
	
	
}
