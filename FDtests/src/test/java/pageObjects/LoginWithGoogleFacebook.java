package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginWithGoogleFacebook extends PageNavigator {

	

	public LoginWithGoogleFacebook(WebDriver driver) {
		super(driver);
		
	}

	public void clickLoginWithGoogle() {
		driver.findElement(By.xpath("/html/body/app/fd-public-root/fd-login-modal/div/div/div/div[2]/fd-promote-text/div[3]/div/a[2]")).click();
	}

	public DashboardPage fillLoginGoogleCredentialsAndSubmit() throws InterruptedException {
		WebElement field;
		WebDriverWait wait = new WebDriverWait(driver, 20);

		field = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@autocomplete='username']")));
		driver.findElement(By.xpath("//input[@autocomplete='username']")).sendKeys("coffeacc12");
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/content/span")).click();
		
		field = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@autocomplete='current-password']")));
		driver.findElement(By.xpath("//input[@autocomplete='current-password']")).sendKeys("qwe1156q");
		driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/content/span")).click();

		return new DashboardPage(driver);

	}

	//For SignUP
	public SignUpPage1 fillSignUpGoogleCredentialsAndSubmit() throws InterruptedException {
		WebElement field;
		WebDriverWait wait = new WebDriverWait(driver, 20);

		field = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@autocomplete='username']")));
		driver.findElement(By.xpath("//input[@autocomplete='username']")).sendKeys("coffeacc25");
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/content/span")).click();
		
		field = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@autocomplete='current-password']")));
		driver.findElement(By.xpath("//input[@autocomplete='current-password']")).sendKeys("qwe1156q!");
		driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/content/span")).click();

		return new SignUpPage1(driver);
	
	}
}
