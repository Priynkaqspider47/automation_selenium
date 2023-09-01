package listeners;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Runner_cls_lis 
{
@Test
public void test1()
{
	System.out.println("hello bangalore");
}
@Test
public void test2() 
{
	
System.out.println("heelo india");
Assert.fail();
}

@Test(dependsOnMethods = "test2")
public void test3() 
{
	
System.out.println("heelo shimoga");
}
}
