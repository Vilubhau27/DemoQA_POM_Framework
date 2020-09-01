package demoqa.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

	public Properties prop;
	public WebDriver driver;

	public void launchURL() throws Exception {
		FileInputStream fis = new FileInputStream("C:\\Users\\vilas\\Documents\\Selenium By Shammi Jha\\Interview preparation stuff\\POM Framework\\DemoQAAutomationProject\\src\\main\\java\\demoqa.configuration\\configuration.properties");
		prop = new Properties();
		prop.load(fis);

		if (prop.getProperty("browser").equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", prop.getProperty("chromepath"));
			driver = new ChromeDriver();
		} else {
			System.out.println("No other browser supports");
		}
		driver.get(prop.getProperty("url"));
	}

}
