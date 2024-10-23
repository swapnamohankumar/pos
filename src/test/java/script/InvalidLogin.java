package script;

import org.testng.Assert;
import org.testng.annotations.Test;

import generic.BaseTest;
import page.LoginPage;

public class InvalidLogin extends BaseTest
{
	@Test(priority = 2)
	public void testInvalidLogin()
	{
//		1. enter invalid user name
		test.info("enter invalid user name :abc");
		LoginPage loginPage=new LoginPage(driver);
		loginPage.setUserName("abc");
		
//		2. enter invalid password
		test.info("enter invalid password :xyz");
		loginPage.setPassword("xyz");
		
//		3. click on go button
		test.info("click on go button");
		loginPage.clickGoButton();
		
//		4. should display error message
		test.info("should display error message");
		boolean result = loginPage.verifyErrMsgIsDisplayed(wait);
		Assert.assertTrue(result);
		
	}
}
