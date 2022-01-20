package practice;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RetryClass {
	@Test(retryAnalyzer = com.crm.comcast.GenricUtility.RetryimplimentationClass.class)
	public void retry() {
		Assert.assertEquals(true, false);	
	}

}
