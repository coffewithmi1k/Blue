
package FacedriveFD.FDtests;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pageObjects.*;

public class SignUpTest {

	WebDriver driver;

	@Before
	public void setUp() {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@After
	public void tearDown() {
		driver.close();
	}

	@Test
	public void checkUserLoginWithValidData() throws InterruptedException {
		PageNavigator navigator = new PageNavigator(driver);
		FDHomePage onHomePage = navigator.openHomePage();
		LoginWithGoogleFacebook onLoginPopup = onHomePage.clickSignUPbutton();
		onLoginPopup.clickLoginWithGoogle();
		SignUpPage1 onSignUpPage1 = onLoginPopup.fillSignUpGoogleCredentialsAndSubmit();
		SignUpPage2 onSignUpPage2 = onSignUpPage1.fillFormWithValidData();

		Thread.sleep(10000);

	}

}
