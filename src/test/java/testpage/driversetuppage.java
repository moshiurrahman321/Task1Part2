package testpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class driversetuppage {
	public static WebDriver driver;
	@BeforeTest
	public static void setDriver() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
	@AfterTest
	public static void close() {
		driver.close();
	}

}

