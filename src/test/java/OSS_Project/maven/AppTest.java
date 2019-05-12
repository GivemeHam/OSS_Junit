package OSS_Project.maven;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
	@Test
	public void testSum() {
		App app = new App();
		int result = app.sum(10, 30);
		assertEquals(40, result, 0);
	}
}
