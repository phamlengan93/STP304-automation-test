package Baitapmau;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExampleTest {
	private ChromeDriver driver;
	@BeforeClass
	public void init() {
		System.out.println("Open browser");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	@Test
	public void TC01_VerifyAgree() {
		System.out.println("Start TC01");
		driver.get("https://accounts.lambdatest.com/register");
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("i_agree"))).click();
		System.out.println("Finish TC01");
	}
	@Test
	public void TC02_VerifySignIn() {
		System.out.println("Start TC02");
		driver.get("https://accounts.lambdatest.com/register");
		WebDriverWait wait = new WebDriverWait(driver, 15);
		driver.findElementByXPath("//a[text()='Sign In']").click();
		System.out.println("Finish TC02");
	}
	@AfterClass
	public void terminate() {
		System.out.println("Close browser");
		driver.close();
	}
}
