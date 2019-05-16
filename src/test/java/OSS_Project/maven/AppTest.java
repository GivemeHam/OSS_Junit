package OSS_Project.maven;

import org.junit.Test;

import junit.framework.Assert;

public class AppTest {

	@Test(timeout = 5000)
	public void testSum() {
		App app = new App();
		Assert.assertEquals(30, App.sum(10, 20));
	}
	@Test(timeout = 5000)
	public void testSum2() {
		App app = new App();
		Assert.assertEquals(1, App.sum(10, 20));
	}

}
