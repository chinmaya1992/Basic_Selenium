package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class X_path_1 {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Hiiiii");
        driver.findElement(By.xpath("//input[contains(@name,'pass')]")).sendKeys("Hello");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[text()='Create a page']")).click();

	}

}
