package Lab_7_Selenium;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class CaptureScreenshot {
	WebDriver driver;
	public static void takeScreenshot (WebDriver driver, String testcaseName) {
		try {
			//tao ten anh trung ten testcase, kieu anh la png
			String imageName = testcaseName +".png";
			
			//thuc hien chup anh man hinh, lay ra doi tuong file anh source
			TakesScreenshot screenshot = (TakesScreenshot) driver;
			File source = screenshot.getScreenshotAs(OutputType.FILE);
			
			//tao doi tuong file voi ten da dat ben tren tai thu muc /ScreenShots
			//Sau do thuc hien copy file anh nguon vao file dich do
			File destiny = new File("./ScreenShots/" + imageName);
			FileHandler.copy(source, destiny);
		} catch (Exception ex) {
			System.out.println("Da xay ra loi khi chup man hinh");
			ex.printStackTrace();
		}
	}
}
