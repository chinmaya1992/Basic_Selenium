package Action_Class;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultiSelect {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://demoapp.skillrary.com/");
        WebElement dropDown = driver.findElement(By.id("cars"));
        Select s = new Select(dropDown);
        s.selectByIndex(0);
        Thread.sleep(2000);
        s.selectByValue("199");
        Thread.sleep(2000);
        s.deselectByIndex(0);
        s.deselectByValue("199");
        System.out.println(s.isMultiple());
        List<WebElement> options = s.getAllSelectedOptions();
        for(WebElement b:options) {
        	System.out.println(b.getText());
        }
	}

}
