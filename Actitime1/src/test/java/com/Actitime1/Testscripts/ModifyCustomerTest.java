package com.Actitime1.Testscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ModifyCustomerTest {
	@Test
	public void createCustomerTest() throws InterruptedException {
		Reporter.log("customer created successfully",true);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com");
		Thread.sleep(5000);
		driver.close();
	}
	public void modifyCustomerTest() throws InterruptedException {
		Reporter.log("customer created successfully",true);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com");
		Thread.sleep(5000);
		driver.close();
	}
}
