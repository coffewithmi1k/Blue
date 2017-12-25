package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SupportPage extends PageNavigator {
	
	public SupportPage(WebDriver driver) {
		super(driver);
	}

	
	public WebElement getConfirmationMessageSupportPage() {
		return driver.findElement(By.xpath("/html/body/app/fd-public-root/main/support/div/fd-full-page/div[1]/div[1]/div/div/fd-promote-text/div[2]/div"));
	}
	
	public DriverPage clickOnDriverPage() {
		driver.findElement(By.xpath("/html/body/app/fd-public-root/header/div/div/div[1]/div/div/div[3]/main-menu/div[5]/a")).click();
		return new DriverPage(driver);
	}
}
