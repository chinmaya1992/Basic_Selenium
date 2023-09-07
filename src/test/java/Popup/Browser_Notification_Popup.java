package Popup;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser_Notification_Popup {

	public static void main(String[] args) {
		
		HashMap<String, Integer> contentStrings = new HashMap<String, Integer>();
		HashMap<String, Object> profile = new HashMap<String, Object>();
		HashMap<String, Object> prefs = new HashMap<String, Object>();
		
		contentStrings.put("notifications", 0);
		profile.put("managed_default_content_settings", contentStrings);
		prefs.put("profile", profile);

		EdgeOptions options = new EdgeOptions();
		options.setCapability("preferences", prefs);
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.quikr.com/");

	}

}
