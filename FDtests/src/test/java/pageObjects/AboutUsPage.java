package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AboutUsPage extends PageNavigator {
	
	public AboutUsPage(WebDriver driver) {
		super(driver);
	}

	
	public WebElement getConfirmationMessageAboutUsPage() {
		return driver.findElement(By.xpath("/html/body/app/fd-public-root/main/about/fd-full-page/div[1]/div[1]/div/div/fd-promote-text/div[2]/span"));
	}
	public SupportPage clickOnSupportPage() {
		driver.findElement(By.xpath("/html/body/app/fd-public-root/header/div/div/div[1]/div/div/div[3]/main-menu/div[4]/a")).click();
		return new SupportPage(driver);
	}
	//Become A Partner form
	public void fillBecomeAPartnerSubscriptionFormValidData() {
		driver.findElement(By.xpath("/html/body/app/fd-public-root/main/about/div/div[7]/div/fd-promote-text/div[3]/div/form/div/div/div/div[1]/input")).sendKeys("coffeCompany"+(int)Math.random()*10000);
		driver.findElement(By.xpath("/html/body/app/fd-public-root/main/about/div/div[7]/div/fd-promote-text/div[3]/div/form/div/div/div/div[2]/input")).sendKeys("YuriiSpammer"+(int)Math.random()*10000+"@gmail.com");

	}
	public void submitBecomeAPartnerSubscriptionForm() {
		driver.findElement(By.xpath("/html/body/app/fd-public-root/main/about/div/div[7]/div/fd-promote-text/div[3]/div/form/div/div/div/div[3]/button")).click();
	}
	
	public WebElement getConfirmationMessageOnBecomeAPartnerFormValidData() {
		return driver.findElement(By.xpath("/html/body/app/fd-public-root/main/about/div/div[7]/div/fd-promote-text/div[3]/div/div/p"));
	}
	//Contact US form
	public void fillContactUsFormValidData() throws InterruptedException {
		//Name
		driver.findElement(By.xpath("//*[@id=\"contact-us-name\"]")).sendKeys("YuriiSpammerUmUmUm");
		//Email
		driver.findElement(By.xpath("//*[@id=\"contact-us-email\"]")).sendKeys("coffeFun"+(int)Math.random()*10000+"@gmail.com");
		//DropDown
		Select dropdown = new Select(driver.findElement(By.xpath("//*[@id=\"contact-us-subject\"]")));
		dropdown.selectByVisibleText("Distributor");
		//Message
		driver.findElement(By.xpath("//*[@id=\"contact-us-message\"]")).sendKeys("Yey!!!");
		
	}
	public void submitContactUsForm() {
		driver.findElement(By.xpath("")).click();
	}
	public WebElement getConfirmationMessageContactUsForm() {
		return driver.findElement(By.xpath(""));
	}
}