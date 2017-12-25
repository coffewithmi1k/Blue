package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CitiesPage extends PageNavigator {

	public CitiesPage(WebDriver driver) {
		super(driver);
	}

	public WebElement getConfirmationMessageCitiesPage() {
		return driver.findElement(By.xpath(
				"/html/body/app/fd-public-root/main/cities/div/fd-full-page[1]/div[1]/div[1]/div/div/fd-promote-text/div[2]/span"));
	}

	public AboutUsPage clickOnAboutUsPage() {
		driver.findElement(
				By.xpath("/html/body/app/fd-public-root/header/div/div/div[1]/div/div/div[3]/main-menu/div[3]/a"))
				.click();
		return new AboutUsPage(driver);
	}

	// When we arrive subscription Form
	public void fillSubscriptionFormWhenWeArrive() {
		driver.findElement(By.xpath(
				"/html/body/app/fd-public-root/main/cities/div/div[2]/div/div/div/form/div/div/div/div[1]/input"))
				.sendKeys("YuriiSpammer" + Math.random() * 5);
		driver.findElement(By.xpath(
				"/html/body/app/fd-public-root/main/cities/div/div[2]/div/div/div/form/div/div/div/div[2]/input"))
				.sendKeys("ILoveFacedrive" + Math.random() * 5 + "@gmail.com");
	}

	public void submitSubscriptionFormWhenWeArrive() {
		driver.findElement(By.xpath(
				"/html/body/app/fd-public-root/main/cities/div/div[2]/div/div/div/form/div/div/div/div[3]/button"))
				.click();
	}

	public WebElement getSucessfulSubscriptionMessageWhenWeArrive() {
		return driver.findElement(By.xpath("/html/body/app/fd-public-root/main/cities/div/div[2]/div/div/div/div/p"));
	}

	// NewsLetterForm
	public void fillSubscriptionFormNewsletter() {
		driver.findElement(By.xpath("/html/body/app/fd-public-root/main/cities/div/div[2]/div/div/div/form/div/div/div/div[1]/input")).sendKeys("YuriiSp"+(int)Math.random()*1000);
		driver.findElement(By.xpath("/html/body/app/fd-public-root/main/cities/div/div[2]/div/div/div/form/div/div/div/div[2]/input")).sendKeys("Yurii"+Math.random()+"spammer@gmail.com");
	}

	public void submitSubscriptionFormNewsletter() {
		driver.findElement(By.xpath("/html/body/app/fd-public-root/main/cities/div/div[2]/div/div/div/form/div/div/div/div[3]/button")).click();
	}

	public WebElement getSucessfulSubscriptionMessageNewsletter() {
		return driver.findElement(By.xpath("/html/body/app/fd-public-root/main/cities/div/div[2]/div/div/div/div/p"));
	}
}
