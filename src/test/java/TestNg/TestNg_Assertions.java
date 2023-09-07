package TestNg;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNg_Assertions {
	
	@Test
	public void Assertions() {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       driver.get("https://www.amazon.in/");
       String title = driver.getTitle();
       //soft Assert
       SoftAssert s = new SoftAssert();
       s.assertEquals(title,"dfghj");
       System.out.println(driver.getCurrentUrl());
	}

}
