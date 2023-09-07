package Pom_pratice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import POM1.SkillraryDemo;
import POM2.AddToCart;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Skillrary {

	public static void main(String[] args) {
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://demoapp.skillrary.com/");
        SkillraryDemo sd = new SkillraryDemo(driver);
        
        sd.courseLink();
        Actions a = new Actions(driver);
        sd.seleniumTraining();
        AddToCart atc = new AddToCart(driver);
     
        a.doubleClick().perform();
        atc.plusBtn();
        atc.atcBtn();

	}

}
