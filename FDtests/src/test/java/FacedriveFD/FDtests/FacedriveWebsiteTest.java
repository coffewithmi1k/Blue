package FacedriveFD.FDtests;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pageObjects.*;


public class FacedriveWebsiteTest {

	
	
	WebDriver driver;
	
	
	@Before
	public void setUp() {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
	}
	@After
	public void tearDown() {
		driver.close();
	}
	@Test
	public void CheckHomePageIsOpened() {
		PageNavigator navigator = new PageNavigator(driver);
		FDHomePage onHomePage = navigator.openHomePage();
		Assert.assertTrue(driver.getTitle().contains("facedrive"));
	}
	@Test
	public void checkWebsiteSections() throws InterruptedException {
		PageNavigator navigator = new PageNavigator(driver);
		FDHomePage onHomePage = navigator.openHomePage();
		//CHANGE THIS THREAD TO EXPLICIT WAIT UNTIL VISIBLE;
		//Thread.sleep(4000); 
		HowItWorksPage onHowItWorksPage = onHomePage.clickHowitworksSection();
		Assert.assertTrue(onHowItWorksPage.getConfirmationMessageHowItWorks().getText().contains("HOW IT WORKS"));
		//Thread.sleep(4000);
		CitiesPage onCitiesPage = onHowItWorksPage.clickOnCitiesPage();
		Assert.assertTrue(onCitiesPage.getConfirmationMessageCitiesPage().getText().contains("IS YOUR CITY NEXT?"));
		AboutUsPage onAboutUsPage =onCitiesPage.clickOnAboutUsPage();
		Assert.assertTrue(onAboutUsPage.getConfirmationMessageAboutUsPage().getText().contains("FORCE FOR CHANGE"));
		SupportPage onSupportPage = onAboutUsPage.clickOnSupportPage();
		Assert.assertTrue(onSupportPage.getConfirmationMessageSupportPage().getText().contains("ASK SUPPORT"));
		DriverPage onDriverPage = onSupportPage.clickOnDriverPage();
		Assert.assertTrue(onDriverPage.getConfirmationMessageDriverPage().getText().contains("DRIVERS"));
		RiderPage onRiderPage = onDriverPage.clickOnRiderPage();
		Assert.assertTrue(onRiderPage.getConfirmationMessageRiderPage().getText().contains("TO RIDE"));
		onRiderPage.clickOnHomePage();
		onHomePage.getConfirmationMessageHomePage().getText().contains("EARN MORE");
		Thread.sleep(5000);
		
	}
	
	
	
	
}
