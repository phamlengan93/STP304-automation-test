package Lab5;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Lab5 {
	ChromeDriver driver;
	@BeforeClass
	public void startBrowser() {
		System.out.println("Open browser");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.google.com.vn/");
		
	}
	@Test
	public void TC01_inputGoogleSearch()throws Exception {
		System.out.println("Start TC01");
		WebDriverWait wait = new WebDriverWait(driver,15);
		driver.findElementByName("q").sendKeys("selenium");
		Thread.sleep(2000);
		System.out.println("Finish TC01");
	}
	@Test
	public void TC02_searchButton() {
		System.out.println("Start TC02");
		driver.findElementByXPath("//input[@name='btnK']").click();
		System.out.println("Finish TC02");
	}
	@AfterClass
	public void terminal() {
		driver.close();
		System.out.println("Close browser");
	}
}
