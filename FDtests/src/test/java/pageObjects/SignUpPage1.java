package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignUpPage1 extends PageNavigator {

	
	
	public SignUpPage1(WebDriver driver) {
		super(driver);
	}
	
	public SignUpPage2 fillFormWithValidData() throws InterruptedException {
		WebElement field;
		WebDriverWait wait = new WebDriverWait(driver, 20);

		field = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.id("fd-register-drive-name")));

	//Name
	    driver.findElement(By.id("fd-register-drive-name")).clear();
	    driver.findElement(By.id("fd-register-drive-name")).sendKeys("AutoName");
	    //last Name;
    driver.findElement(By.id("fd-register-drive-last-name")).clear();
    driver.findElement(By.id("fd-register-drive-last-name")).sendKeys("AutolastName");
    //Phone
    driver.findElement(By.id("fd-register-drive-phone")).clear();
    driver.findElement(By.id("fd-register-drive-phone")).sendKeys("+1231231232");
    //City Dropdown
    Select dropdown = new Select(driver.findElement(By.id("fd-register-drive-region")));
    dropdown.selectByVisibleText("Lviv");
    //Eula Checkbox;
    driver.findElement(By.id("fd-accept-tc")).click();
    driver.findElement(By.xpath("/html/body/app/fd-public-root/main/fd-create-driver-modal/div/div/div/div[2]/form/div/button")).click();
    return new SignUpPage2(driver);
    



		
		
	}
	
}
