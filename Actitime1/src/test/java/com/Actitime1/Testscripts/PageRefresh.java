package com.Actitime1.Testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PageRefresh {
	
	@Test
	public void create() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		WebElement element = driver.findElement(By.id("email"));
		driver.navigate().refresh();
		element.sendKeys("abc@gmail.com");
		Thread.sleep(5000);
		driver.close();
	}
	

}
