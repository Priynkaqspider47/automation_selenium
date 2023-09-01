package groups_testng;

import org.testng.annotations.Test;

public class Runner_groups {
	@Test(groups= {"Functional"})
	public void group1()
	{
		System.out.println("compose");
	}
	@Test(groups = {"Sanity"})
	public void group2()
	{
		System.out.println("sent items");
	}
	@Test(groups = {"regression"})
	public void group3()
	{
		System.out.println("trash");
	}
		
	}


