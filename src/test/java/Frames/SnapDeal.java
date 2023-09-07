package Frames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SnapDeal {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.snapdeal.com/");
        WebElement signin = driver.findElement(By.xpath("//span[text()='Sign in']"));
        Actions a = new Actions(driver);
        a.moveToElement(signin).perform();
        driver.findElement(By.xpath("(//span[text()='Register'])[1]")).click();
        driver.switchTo().frame("loginIframe");
        driver.findElement(By.xpath("//input[@placeholder='Mobile Number/ Email']")).sendKeys("123456");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[@id='close-pop']")).click();
        
        driver.switchTo().defaultContent();
        driver.findElement(By.xpath("//input[@placeholder='Search products & brands']")).sendKeys("dfgh");

	}

}
