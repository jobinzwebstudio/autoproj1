import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//test message

public class LoadURL extends EnvVariables
{

		public static WebDriver LoadBrowser(String TempURL)
		{
		
			WebDriver driver = null;
			if (EnvVariables.Browser == "Firefox")
			{
			
			try
				{
					WebDriver Firefoxdriver = new FirefoxDriver();
					if (TempURL == null )
						{	
						Firefoxdriver.get(EnvVariables.URL);
						}
					else
						{
						Firefoxdriver.get(TempURL);
						}
						
					Firefoxdriver.manage().window().maximize();
					Firefoxdriver.getTitle();
					//driver.quit();
					driver = Firefoxdriver;
					
				}
			catch (Exception e) 
				{
					throw new IllegalStateException("Cannot open the Browser", e);
				}
			}
			return driver;
			
			
		}

		
}
