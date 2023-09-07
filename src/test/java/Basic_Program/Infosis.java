package Basic_Program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Infosis {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        WebElement ele = driver.findElement(By.xpath("//textarea[@title='Search']"));
        	ele.sendKeys("infosys");
        	driver.findElement(By.xpath(""))
        	WebElement key = driver.findElement(By.xpath("//h3[text()='Infosys - Consulting | IT Services | Digital Transformation']"));
        key.click();
        Thread.sleep(3000);
        driver.close();

	}

}
