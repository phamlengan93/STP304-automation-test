package Lab_7_Selenium;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.testng.Assert.*;
import org.testng.ITestResult;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Lab7DemoTest {
	WebDriver driver;
//Class này định nghĩa 5 method
	@BeforeClass
	public void init() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();//Mở browser
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	}
	@Test(priority = 0)
	public void TC01_LoginFirstAccount() throws InterruptedException {
		//Lay ra thong tin baseUrl, email1, pw1 tu file properties
		String baseUrl = PropertiesFileUtils.getProperty("base_url");
		String email1 = PropertiesFileUtils.getProperty("email_1");
		String password1 = PropertiesFileUtils.getProperty("password_1");
		//tai trang baseUrl
		driver.get(baseUrl);
		//Tim kiem va click chuot vao SignIn
		WebElement iconSignIn = driver.findElement(By.xpath("//a[@href='/login']"));
		iconSignIn.click();
		//khoi tao LoginPage tu PageFactory va nhap vao thong tin email, pw, click btnSignIn
		LoginPage loginPage = new LoginPage(driver);
		PageFactory.initElements(driver, loginPage);
		loginPage.enterEmail(email1);
		loginPage.enterPassword(password1);
		loginPage.clickSignIn();
		//dam bao login thanh cong bang cach ktra "Sign out" hien thi chua
		WebDriverWait wait = new WebDriverWait(driver,30);
		WebElement iconSignOut = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='/logout']")));
		//WebElement iconSignOut = driver.findElement(By.xpath("//a[@href='/logout']"));
		assertEquals(true, iconSignOut.isDisplayed(),"Dang nhap khong thanh cong");
		//Dang xuat bang click SignOut
		iconSignOut.click();
		Thread.sleep(2000);
		}
	@Test(priority=1)
	public void TC02_LoginSecondAccount() throws InterruptedException {
		String baseUrl = PropertiesFileUtils.getProperty("base_url");
		String email2 = PropertiesFileUtils.getProperty("email_2");
		String password2 = PropertiesFileUtils.getProperty("password_2");
		driver.get(baseUrl);
		//tim kiem click chuot vao SignIn
		WebElement iconSignIn = driver.findElement(By.xpath("//a[@href='/login']"));
		iconSignIn.click();
		//khoi tao LoginPage tu PageFactory va nhap vao thong tin email, pw, click btnSignIn
		LoginPage loginPage = new LoginPage(driver);
		PageFactory.initElements(driver, loginPage);
		loginPage.enterEmail(email2);
		loginPage.enterPassword(password2);
		loginPage.clickSignIn();
		//dam bao login thanh cong bang cach ktra "Sign out" hien thi chua
		WebDriverWait wait = new WebDriverWait(driver,30);
		WebElement iconSignOut = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='/logout']")));
		//WebElement iconSignOut = driver.findElement(By.xpath("//a[@href='/logout']"));
		assertEquals(true, iconSignOut.isDisplayed(),"Dang nhap khong thanh cong");
		//Dang xuat bang click SignOut
		iconSignOut.click();
		Thread.sleep(2000);
	}
	//Method ktra kqua sau moi method @Test 
	//va thuc hien chup man hinh neu kqua Test failed
	@AfterMethod
	public void takeScreenshot(ITestResult result) throws InterruptedException {
		Thread.sleep(1000);
		//tham so dau vao cua ham la ItestResult  chua kqua cuar @Test va ten cua testcase
		//neu kqua failed thi chup lai man hinh
		if (ITestResult.FAILURE==result.getStatus()) {
			try {
				CaptureScreenshot.takeScreenshot(driver, result.getName());
				System.out.println("Da chup man hinh: "+result.getName());
			} catch(Exception e) {
				System.out.println("Exception while taking screenshot"+e.getMessage());
			}
		}
	}
	@AfterClass
	public void terminate() {
		driver.close();
		System.out.println("Close browser");
	}
	
}
