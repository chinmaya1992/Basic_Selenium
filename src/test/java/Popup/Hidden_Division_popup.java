package Popup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Hidden_Division_popup {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		//opening firefox driver
		WebDriver driver = new FirefoxDriver();
		//maximize thr browser
        driver.manage().window().maximize();
        //implicit statement
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.redbus.in/");
        //address of add to cart
        driver.findElement(By.xpath("//span[@class='dateText']")).click();
       WebElement date = driver.findElement(By.xpath("//div[text()='Aug']/../../..//span[text()='26']"));
        System.out.println(date.getText());
        date.click();
	}

}
