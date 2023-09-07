package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath2 {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.instagram.com/");
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Hiiiii");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Hello");
        Thread.sleep(3000);
       


	}

}
