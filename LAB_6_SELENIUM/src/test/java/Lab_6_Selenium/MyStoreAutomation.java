package Lab_6_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MyStoreAutomation {
	WebDriver driver;
	String URL;
	String keyword;
	@BeforeClass
	public void Init() {
		URL = "https://automationexercise.com/products";
		keyword = "Stylish Dress";
		System.out.println("Mở browser");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	@Test
	public void TC_MyOderSearchValid()throws Exception {
		System.out.println("Start TC_MyOderSearchValid");
		Actions act = new Actions(driver);
		driver.get(URL);
		//thoi gian tai trang ko qua 15s
		WebDriverWait wait = new WebDriverWait(driver, 15);
		//kiem tra hien thi o tim kiem
		WebElement inputSearch = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("search_product")));
		Assert.assertEquals(true, inputSearch.isDisplayed(), "Page load failed");
		//su dung Actions de nhap du lieu tu ban phim
		act.sendKeys(inputSearch, keyword).build().perform();
		act.click(driver.findElement(By.id("submit_search"))).build().perform();
		//thoi gian tim kiem toi da 5s
		WebDriverWait wait1 = new WebDriverWait(driver,5);
		/*
		//if(driver.findElement(By.xpath("//*[@class=“features_items”]/div[4]")).isDisplayed())
		//WebElement imageLink = wait5s.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='features_items']/div[2]/div/div/div/a")));
		//Assert.assertEquals(true, imageLink.isDisplayed(), "Search failed");
		// ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='features_items']/div[3]"))
			//	.andThen(Assert.assertEquals(false, overProductItem., "Search failed"));
		*/
		//kiem tra hinh anh item hien thi hay khong
		WebElement imageLink = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='features_items']/div[2]/div/div/div/img")));
		Assert.assertEquals(true, imageLink.isDisplayed(), "Search image failed");
		//kiem tra tên tim kiem co hien thi hay khong
		WebElement productName = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='features_items']/div[2]/div/div/div/p")));
		Assert.assertEquals(true, productName.isDisplayed(), "Search product name failed");
		Assert.assertEquals(productName.getText(), keyword, "productName not match");
		//kiem tra gia ban co hien thi hay khong
		WebElement priceSearch = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='features_items']/div[2]/div/div/div/h2")));
		Assert.assertEquals(true, priceSearch.isDisplayed(), "Search price failed");
		//button Addtocart hien thi tren item
		WebElement btnAddToCart = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='features_items']/div[2]/div/div/div/a")));
		Assert.assertEquals(true, btnAddToCart.isDisplayed(), "Search price failed");
		//nhan nut Addtocart bang Actions
		act.click(driver.findElement(By.xpath("//div[@class='features_items']/div[2]/div/div/div/a"))).build().perform();
		//dam bao addResponseMsg hien thi ko qua 5s
		WebDriverWait wait2 = new WebDriverWait(driver,5);
		//them moi thanh cong voi thong bao  “Your product has been added to cart.”
		WebElement addResponseMsg = wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='features_items']/div[1]/div/div/div[2]")));
		String expect = "Your product has been added to cart." ;
		String actual = addResponseMsg.getText();
		Assert.assertEquals(expect, actual, "AddToCard message success");
		System.out.println("Finish TC");
	}
	
	@AfterClass
	public void terminate() {
		System.out.println("Close browser");
		driver.close();
	}
	
	
}
