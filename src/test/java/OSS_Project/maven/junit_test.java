package OSS_Project.maven;

import static org.junit.Assert.*;

import org.junit.Test;

public class junit_test {

	@Test
	public void test() {
		App calculator = new App();
        assertEquals(30, App.Test(10, 20));
	}
}
