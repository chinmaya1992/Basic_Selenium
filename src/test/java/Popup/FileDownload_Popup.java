package Popup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileDownload_Popup {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		//opening firefox driver
		WebDriver driver = new FirefoxDriver();
		//maximize thr browser
        driver.manage().window().maximize();
        //implicit statement
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://the-internet.herokuapp.com/download");
        driver.findElement(By.xpath("//a[text()='sample.png']")).click();

	}

}
