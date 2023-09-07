package Action_Class;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SingleDropDown_Amazon {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.amazon.in/");
        WebElement dropDown=driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
        Select s= new Select(dropDown);
        s.selectByIndex(4);
        Thread.sleep(3000);
        s.selectByValue("search-alias=baby");
        Thread.sleep(3000);
        s.deselectByVisibleText("Electronics");
        System.out.println(s.isMultiple());
        List<WebElement> allOptions = s.getOptions();
        for(WebElement b : allOptions) {
        	System.out.println(b.getText());
        }
	}

}
