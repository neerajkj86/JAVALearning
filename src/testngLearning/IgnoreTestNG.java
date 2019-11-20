package testngLearning;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

//All test will be ignored if we put on class level
@Ignore
public class IgnoreTestNG {

	@TestStudent4
	public void testcase1()
	{
		System.out.println("I am in test 1");
}
	
	@TestStudent4
	public void testcase2()
	{
		System.out.println("I am in test 2");
}
	
	@TestStudent4
	public void testcase3()
	{
		System.out.println("I am in test 3");
}
	
	@TestStudent4
	public void testcase4()
	{
		System.out.println("I am in test 4");
}

}