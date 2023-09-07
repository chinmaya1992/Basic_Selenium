package Popup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alter_Popup {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.firefoxdriver().setup();
		//opening firefox driver
		WebDriver driver = new FirefoxDriver();
		//maximize thr browser
        driver.manage().window().maximize();
        //implicit statement
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://demoapp.skillrary.com/product.php?product=selenium-training");
        //address of add to cart
        driver.findElement(By.xpath("//button[text()=' Add to Cart']")).click();
        //shifting our control to popup
        Alert al = driver.switchTo().alert();
        System.out.println(al.getText());
        Thread.sleep(3000);
        al.accept();
        }

}
