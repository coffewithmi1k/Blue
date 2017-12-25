package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HowItWorksPage extends PageNavigator {
	
	public HowItWorksPage(WebDriver driver) {
		super(driver);
	}

	
	public WebElement getConfirmationMessageHowItWorks() {
		return driver.findElement(By.xpath("//*[@id=\"hiw-main\"]/div[1]/div[1]/div/div/fd-promote-text/div[2]/span/div"));
	}
	
	public CitiesPage clickOnCitiesPage() {
		driver.findElement(By.xpath("/html/body/app/fd-public-root/header/div/div/div[1]/div/div/div[3]/main-menu/div[2]/a")).click();
		return new CitiesPage(driver);
	}
}
