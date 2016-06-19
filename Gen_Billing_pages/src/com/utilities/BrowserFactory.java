package com.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class BrowserFactory {
	
	static WebDriver driver;
	
	@BeforeMethod
	public static WebDriver LoadURL()
	
	
	{
		
		//if (Browser.equalsIgnoreCase("firefox"))
		{
		driver = new FirefoxDriver();
		driver.get("https://myaccount.talktalk.co.uk");
		driver.manage().window().maximize();
		}
		
		return driver;
	}
	
	@Test (dataProvider = "data")
	public void login(String Username, String Password)
	{
	
		driver.findElement(By.cssSelector("#username")).sendKeys(Username);
		driver.findElement(By.cssSelector("#password")).sendKeys(Password);
		driver.findElement(By.cssSelector("#loginButton")).click();
		System.out.println(driver.getTitle());
		
	}
	
	@AfterMethod
	public void browser_quit()
	{
		driver.quit();
	}
	

	@DataProvider(name="data")
	public Object[][] passdata()
	{
		Object[][] data = new Object[3][2];
		
		data [0][0] = "somenew";
		data [0][1] = "test123";
		
		data [1][0] = "netezed@gmail.com";
		data [1][1] = "Cambridge@123";
		
		
		
		return data;
	}
	
	
}
