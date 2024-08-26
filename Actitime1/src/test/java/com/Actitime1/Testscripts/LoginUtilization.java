package com.Actitime1.Testscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginUtilization {
	
	@Test
	public void login() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://online.actitime.com/tieto/login.do");
		LoginPage lp=new LoginPage(driver);
		WebElement element = lp.getUntbx();
		driver.navigate().refresh();
		element.sendKeys("abc@gmail.com");
		Thread.sleep(5000);
		driver.close();
	}

}
