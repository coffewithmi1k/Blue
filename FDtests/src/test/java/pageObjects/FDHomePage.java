package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FDHomePage extends PageNavigator {

	
	public FDHomePage(WebDriver driver) {
		super(driver);
	}
	
	
	public HowItWorksPage clickHowitworksSection() {
		driver.findElement(By.xpath("/html/body/app/fd-public-root/header/div/div/div[1]/div/div/div[3]/main-menu/div[1]/a")).click();
		return new HowItWorksPage(driver);
	}
	public WebElement getConfirmationMessageHomePage() {
		return driver.findElement(By.xpath("/html/body/app/fd-public-root/main/home/fd-full-page/div[1]/div[1]/div/div/fd-promote-text/div[2]/div/span"));
	}
	
	public CitiesPage clickCitiesSection() {
		driver.findElement(By.xpath("/html/body/app/fd-public-root/header/div/div/div[1]/div/div/div[3]/main-menu/div[2]/a")).click();
		return new CitiesPage(driver);
	}
	public AboutUsPage clickAboutUsSection() {
		driver.findElement(By.xpath("/html/body/app/fd-public-root/header/div/div/div[1]/div/div/div[3]/main-menu/div[3]/a")).click();
		return new AboutUsPage(driver);
	}
	public SupportPage clickSupportSection() {
		driver.findElement(By.xpath("/html/body/app/fd-public-root/header/div/div/div[1]/div/div/div[3]/main-menu/div[4]/a")).click();
		return new SupportPage(driver);
	}
	public DriverPage clickDriverSection() {
		driver.findElement(By.xpath("/html/body/app/fd-public-root/header/div/div/div[1]/div/div/div[3]/main-menu/div[5]/a")).click();
		return new DriverPage(driver);
	}
	public RiderPage clickRiderSection() {
		driver.findElement(By.xpath("/html/body/app/fd-public-root/header/div/div/div[1]/div/div/div[3]/main-menu/div[6]/a")).click();
		return new RiderPage(driver);
		
	}
	//Socials /SIgn Singup;    
	public LoginWithGoogleFacebook clickSignUPbutton() {
		driver.findElement(By.xpath("/html/body/app/fd-public-root/header/div/div/div[1]/div/div/div[4]/div/div[2]/button")).click();
		return new LoginWithGoogleFacebook(driver);
	}
	
	
	
	
	
	
}
