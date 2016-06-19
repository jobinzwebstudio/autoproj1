import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class myDriver {
	
	
	//Add wait until the page loads.
	
	public static void WaitTillPageloads(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 100000);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id='loadingBar']")));
		System.out.println("Page loaded completed");
	}

	 public static WebElement FindElementSafe(WebDriver driver, By by)
	    {
	        try
	        {
	            return driver.findElement(by);
	        }
	        catch (NoSuchElementException e)
	        {
	            System.out.println("Element "+by+" is not found. ");
	        	return null;
	        }
	    }
	 
	 public static boolean Exists(WebElement element)
	    {
	        if (element == null)
	        { return false; }
	        return true;
	    }
	 
	 
	
	
}
