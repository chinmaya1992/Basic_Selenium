package TestNg_Distribution;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;
import org.testng.annotations.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNg_CrossBrowser{
	
	@Parameters({"browsername"})
	
	
	@Test
	public void CrossBrowser(String browser) throws Throwable{
		WebDriver driver;
		if(browser.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			 driver = new EdgeDriver();
		}
		else {
			WebDriverManager.firefoxdriver().setup();
			 driver = new FirefoxDriver();
		}
		
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.get("https://www.facebook.com/");
	    Thread.sleep(2000);
	    driver.close();
	}
	
	
}
