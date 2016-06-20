import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Verify_Latest_Bill_pages {

	public static void main(String[] args)  {
		
		System.out.println("Opening the Browser");
		
		
		
		
		
		
		//Step 1: Load the URL to the browser requested
		WebDriver driver = LoadURL.LoadBrowser(null);
		driver.getTitle();
		System.out.println(EnvVariables.Browser+" has been loaded successfully");
		
		
		
		
		//Step 2: Login to My Account
		String LoginToMyaccount_Results = MyAccountInteractions.LoginToMyaccount(driver);
		System.out.println(LoginToMyaccount_Results);
		
		
		
		
		//Step 3: Go to the Billing Page URL
		driver.get(EnvVariables.Latest_BillPage_URL);
		WebDriverWait wait = new WebDriverWait(driver, 8000);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.linkText("Loading...")));
		MyAccountInteractions.CheckIf_Gen7ErrorPage(driver);
		
		
		
	
		//Step 4: Check if the Page is loaded correctly, by checking the value, name of the page, url
		String URLofPage = driver.getCurrentUrl();
		String PageTitle = driver.getTitle();
		WebElement MandatoryID1 = myDriver.FindElementSafe(driver,By.xpath("//*[@id='content']/bill-page/div/bill-overview"));
		System.out.println(URLofPage+"***"+PageTitle+"***"+MandatoryID1);
		if (URLofPage.contains("/billsandpayments/latestbill") && PageTitle.equals("TalkTalk - My Account - Latest Bill") && MandatoryID1 ==null)
		{
			System.out.println("Billing page loaded successfully");
		}
		
		
		//Step 5: Get the Invoice name and initiate XML reading
		
		
		
	}

	

}
