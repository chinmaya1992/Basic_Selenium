package dataDriven;

import java.io.FileInputStream;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class PropertiesFile {

	public static void main(String[] args) throws Throwable {

        Properties p = new Properties();
        FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\Data.properties");
        p.load(fis);
        String appURL= p.getProperty("url");
       String User = p.getProperty("username");
       String password = p.getProperty("password");
       WebDriverManager.edgedriver().setup();
		//opening firefox driver
		WebDriver driver = new EdgeDriver();
		//maximize thr browser
       driver.manage().window().maximize();
       //implicit statement
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       driver.get(appURL);
       driver.findElement(By.xpath("//input[@id='email']")).sendKeys(User);
       driver.findElement(By.xpath("//input[@name='pass']")).sendKeys(password);
        

	}

}
