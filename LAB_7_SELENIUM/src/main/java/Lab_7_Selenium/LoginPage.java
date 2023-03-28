package Lab_7_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	//Class nay lam nhiem vu tim cac WebElement tuong ung o nhap email, pw, btnSignIn
	WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	public void enterEmail (String email) throws InterruptedException {
		WebElement inputEmail = driver.findElement(By.xpath("//*[@data-qa='login-email']"));
		inputEmail.sendKeys(email);
//		Thread.sleep(2000);
	}
	public void enterPassword (String password) throws InterruptedException {
		WebElement inputPassword = driver.findElement(By.xpath("//*[@data-qa='login-password']"));
		inputPassword.sendKeys(password);
//		Thread.sleep(2000);
	}
	public void clickSignIn() throws InterruptedException {
		WebElement signIn = driver.findElement(By.xpath("//*[@data-qa='login-button']"));
		signIn.click();
		Thread.sleep(2000);
	}
}
