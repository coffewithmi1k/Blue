package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DashboardPage extends PageNavigator {

	
	
	public DashboardPage(WebDriver driver) {
		super(driver);
	}
	
	
	public WebElement getConfirmationMessageDashboardPage() {
		return driver.findElement(By.xpath("/html/body/app/fd-driver-component/fd-driver-layout/div[2]/fd-driver-dashboard/div/div[1]/div/fd-driver-dashboard-summary/div/fd-driver-earnings/h5"));
	}
	
	/*
	 * public DashboardPage fillLoginGoogleCredentialsAndSubmit() throws InterruptedException {
		driver.findElement(By.xpath("//input[@autocomplete='username']")).sendKeys("coffeacc12");
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/content/span")).click();
		WebDriverWait wait=new WebDriverWait(driver, 20);
		WebElement passwordField;
		passwordField= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@autocomplete='current-password']")));
driver.findElement(By.xpath("//input[@autocomplete='current-password']")).sendKeys("qwe1156q");
driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/content/span")).click();
		
		return new DashboardPage(driver);
		
	}
	 */
}
