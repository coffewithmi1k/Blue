package FacedriveFD.FDtests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login2Test {

	
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
	public void LoadGoogleForm() {
		//PageNavigator navigator = new PageNavigator(driver);
	}
	
}
