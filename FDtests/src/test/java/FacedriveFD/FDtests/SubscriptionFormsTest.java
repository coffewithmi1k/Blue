package FacedriveFD.FDtests;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pageObjects.*;

public class SubscriptionFormsTest {

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

	// Valid Data;
	@Test
	public void checkCitiesPageSubscriptionFormWhenWeArriveWithValidData() throws InterruptedException {
		PageNavigator navigator = new PageNavigator(driver);
		CitiesPage onCitiesPage = navigator.openHomePage().clickCitiesSection();
		onCitiesPage.fillSubscriptionFormWhenWeArrive();
		onCitiesPage.submitSubscriptionFormWhenWeArrive();
		Assert.assertTrue(onCitiesPage.getSucessfulSubscriptionMessageWhenWeArrive().getText()
				.contains("Thanks for subscribing. We'll get back to you shortly!"));
		Thread.sleep(5000);

	}

	// Valid Data;
	@Test
	public void checkCitiesPageSubscriptionFormNewsletterWithValidData() throws InterruptedException {
		PageNavigator navigator = new PageNavigator(driver);
		CitiesPage onCitiesPage = navigator.openHomePage().clickCitiesSection();
		onCitiesPage.fillSubscriptionFormNewsletter();
		onCitiesPage.submitSubscriptionFormNewsletter();
		Assert.assertTrue(onCitiesPage.getSucessfulSubscriptionMessageNewsletter().getText().contains("Thanks for subscribing. We'll get back to you shortly!"));
		Thread.sleep(5000);


	}

	// Valid Data;
	@Test
	public void checkAboutUsPageBecomeAPartnerSubscriptionValidData() throws InterruptedException {
		PageNavigator navigator = new PageNavigator(driver);
		AboutUsPage onAboutUsPage = navigator.openHomePage().clickAboutUsSection();
		onAboutUsPage.fillBecomeAPartnerSubscriptionFormValidData();
		onAboutUsPage.submitBecomeAPartnerSubscriptionForm();
		Assert.assertTrue(onAboutUsPage.getConfirmationMessageOnBecomeAPartnerFormValidData().getText().contains("Thanks for getting in touch. We'll get back to you shortly!"));
		Thread.sleep(5000);

	}

	// Valid Data ++++add workaround for captcha; ++ check MathRandom method, looks like you got 0 often!;
	@Test
	public void checkAboutUsContactUsFormValidData() throws InterruptedException {
		PageNavigator navigator = new PageNavigator(driver);
		AboutUsPage onAboutUsPage = navigator.openHomePage().clickAboutUsSection();
		onAboutUsPage.fillContactUsFormValidData();
		Thread.sleep(10000);
		//onAboutUsPage.submitBecomeAPartnerSubscriptionForm();
		//Assert.assertTrue(onAboutUsPage.getConfirmationMessageContactUsForm().getText().contains(""));

	}

}
