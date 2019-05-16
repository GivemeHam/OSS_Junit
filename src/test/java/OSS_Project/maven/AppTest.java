package OSS_Project.maven;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import jdk.nashorn.internal.ir.annotations.Ignore;
import junit.framework.Assert;

public class AppTest {
	static int num1 = 0;
	static int num2 = 0;
	static App app = null;

	@Test(timeout = 5000)
	public void testSum() {
		Assert.assertEquals(num1 + num2, App.sum(num1, num2)); //return true;
	}
	@Test(timeout = 5000)
	public void testFail() {
		Assert.assertEquals(num1 - num2, App.sum(num1, num2)); //return false;
	}
	@Test(timeout = 5000)
	public void same() {
		Assert.assertSame(num1, num2); //return false;
	}
	@Ignore // 실행되지 않는다.
	public void ignore() {
		Assert.assertEquals(1, App.sum(num1, num2)); 
	}
	@Before	// @Test 실행전마다 실행된다.
	public void before() {
		if(num1 == 0) num1 = 10;
		if(num2 == 0) num2 = 20;
	}
	@BeforeClass	//@Test 실행전 한번만 실행된다.
	public static void beforeClass() {
		app = new App();
		num1 = 10;
		num2 = 20;
	}
	@AfterClass		//@Test 실행후 한번만 실행된다.
	public static void afterClass() {
		app = null;
	}

}
