package pageObjects;

import org.openqa.selenium.WebDriver;

public class PageNavigator {

	
	final WebDriver driver;
	
	
	public PageNavigator(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public FDHomePage openHomePage() {
		driver.navigate().to("https:dev.facedrive.com");
		return new FDHomePage(driver);
	}
}
