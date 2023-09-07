package ScrollBar;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scrolling_WithCordinates {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.amazon.in/");
        WebElement career = driver.findElement(By.xpath("//a[text()='Careers']"));	
        org.openqa.selenium.Point coOrdinates = career.getLocation();
         int x = coOrdinates.getX();
         int y = coOrdinates.getY();
        
        //downcasting statement
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(" + x + "," + y + ")"); 
        js.executeScript("arguments[0].click();",career);
        Thread.sleep(3000);
        
        
      //  career.click();
	

	}

}
