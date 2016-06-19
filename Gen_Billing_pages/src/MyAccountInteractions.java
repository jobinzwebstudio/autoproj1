import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyAccountInteractions extends EnvVariables
{

	public static String LoginToMyaccount(WebDriver driver)
	{	
		String LoginToMyaccount_Results = "";
		
		//Check if the page loaded is My Account Login page only
		
		if (driver.getTitle().equals(DOMnames.LoginPageTitle));
		{
			System.out.println("Login page was loaded");
		}
		
		
		
		//Start the login interactions
		driver.findElement(By.id("username")).sendKeys(EnvVariables.MAUsername);
		driver.findElement(By.id("password")).sendKeys(EnvVariables.MAPassword);
		driver.findElement(By.id("loginButton")).click();
		
		try {
		
			myDriver.WaitTillPageloads(driver);	
				if (driver.getCurrentUrl().contains("errormessage"))
				{
					System.out.println("Fatal error has been Occured, possibly env down");
				}
			}
		
		catch (TimeoutException e) {
	        return "Build your own errormessage...";
	    }
		
		
		
		//Check if the customer have reached the login page	
		
		//Wait until MA dashboard loads
		
			WebDriverWait wait = new WebDriverWait(driver, 100000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Home")));
			System.out.println("Page loaded completed");
		
		
			if (driver.getCurrentUrl().contains("tvinterrupt"))
			{
				driver.findElement(By.id(DOMnames.TVinteruptSkipButton)).click();
			}
		
		if (driver.getTitle().equals(DOMnames.Gen6HomePageTitle));
		{
			System.out.println(driver.getTitle()+" Home Page Loaded successfully");
		}
		
		
		
		return LoginToMyaccount_Results;
		
		
	}

	
	
	///////Check if a Oops page came for Gen 7 or not/////////////
	
	public static void CheckIf_Gen7ErrorPage(WebDriver driver)
	{
	 System.out.println(driver.getCurrentUrl());
		if(driver.getCurrentUrl().contains("/error"))
	 {
	
	
	for (int i=1; i<6; i++)
	{
		System.out.println("Oops Error occured, Trying to reload the page.... Attempt No: "+i);
		myDriver.FindElementSafe(driver, By.xpath(DOMnames.OopsErrorpageXpath)).click();
		
		if (i == 6)
		{
			System.out.println("Exiting the test as API looks failing");
		}
	}
	
	 }
}
}


