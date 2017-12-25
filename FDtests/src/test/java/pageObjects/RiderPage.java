package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RiderPage extends PageNavigator {
	
	public RiderPage(WebDriver driver) {
		super(driver);
	}

	
	public WebElement getConfirmationMessageRiderPage() {
		return driver.findElement(By.xpath("//*[@id=\"riders-main\"]/div[1]/div[1]/div/div/div/fd-promote-text/div[2]/span"));
	}
	
	public FDHomePage clickOnHomePage() {
		driver.findElement(By.xpath("/html/body/app/fd-public-root/header/div/div/div[1]/div/div/div[2]/a/img")).click();
		return new FDHomePage(driver);
	}
}
