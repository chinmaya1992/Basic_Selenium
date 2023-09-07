package TestNg_Annotations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Annotations {
	WebDriver driver;
	@BeforeMethod
	public void oprning() {
		WebDriverManager.edgedriver().setup();
		 driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test(priority=1,invocationCount=2)
	public void fbBrowser() {
		driver.get("https://www.facebook.com/");
	}
	
	@Test(priority=-1)
	public void amazonBrowser() {
		driver.get("https://www.amazon.in/");
	}
	
	@AfterMethod
	public void closing() {
		driver.close();
	}
	
	

}
