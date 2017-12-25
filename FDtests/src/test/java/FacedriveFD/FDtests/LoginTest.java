package FacedriveFD.FDtests;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pageObjects.*;

public class LoginTest {

	
	WebDriver driver;
	
	@Before
	public void setUp() {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
	}
	
	@After
	public void tearDown() {
		driver.close();
	}
	
	@Test
	public void checkUserLoginWithValidData() throws InterruptedException {
		PageNavigator navigator = new PageNavigator(driver);
		FDHomePage onHomePage = navigator.openHomePage();
		LoginWithGoogleFacebook onLoginWithGoogleFacebook = onHomePage.clickSignUPbutton();
		onLoginWithGoogleFacebook.clickLoginWithGoogle();
		DashboardPage onDashboardPage = onLoginWithGoogleFacebook.fillLoginGoogleCredentialsAndSubmit();
		
		Assert.assertTrue(onDashboardPage.getConfirmationMessageDashboardPage().getText().contains("Total Earnings"));
		
		Thread.sleep(10000);
		
		
	}
	
	
	

}
