package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DriverPage extends PageNavigator {
	
	public DriverPage(WebDriver driver) {
		super(driver);
	}

	
	public WebElement getConfirmationMessageDriverPage() {
		return driver.findElement(By.xpath("//*[@id=\"hiw-main\"]/div[1]/div[1]/div/div/div/fd-promote-text/div[2]/span"));
	}
	
	public RiderPage clickOnRiderPage() {
		driver.findElement(By.xpath("/html/body/app/fd-public-root/header/div/div/div[1]/div/div/div[3]/main-menu/div[6]/a")).click();
		return new RiderPage(driver);
	}
}
