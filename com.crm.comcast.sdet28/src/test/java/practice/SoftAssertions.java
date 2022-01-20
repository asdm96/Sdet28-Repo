package practice;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertions {
	@Test
	public void sample() {
		String expectedName="Adarshhhgdjhg"; 
		String actualName="Adarsh";
		
		Reporter.log("this is soft asster class ",true);
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(expectedName, actualName);
		
		sa.assertAll();
		
	}

}
