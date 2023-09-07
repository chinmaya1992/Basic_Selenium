package Popup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUpload_sendkeys {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		//opening firefox driver
		WebDriver driver = new FirefoxDriver();
		//maximize thr browser
        driver.manage().window().maximize();
        //implicit statement
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.foundit.in");
        driver.findElement(By.xpath("//div[contains(text(),'Upload Resume')]")).click();
        driver.findElement(By.id("file-upload")).sendKeys("D:\\CHINMAYA KUMAR JENA");


	}

}
