package Locatorpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import testpage.driversetuppage;

public class RunPage extends driversetuppage {
	
	static String baseurl="https://userinyerface.com/";
	
	
@Test
public void Helpform() throws InterruptedException {
	driver.get(baseurl);
	driver.manage().window().maximize();
     Assert.assertTrue(true, "Mainpage is open");
	driver.findElement(By.xpath("//a[contains(text(),'HERE')]")).click();
	driver.findElement(By.cssSelector("a.help-form__help-button")).click();
	Assert.assertEquals(driver.getTitle(),"User Inyerface - A worst-practice UI experiment");

	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[contains(text(),'Help')]")).click();
	Thread.sleep(3000);
	
}
@Test
public void Timer() throws InterruptedException {
	Thread.sleep(3000);
	driver.get(baseurl);
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath ("//a[contains(text(),'HERE')]")).click();
	Thread.sleep(5000);
}
}
