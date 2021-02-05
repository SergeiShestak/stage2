package driver;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverSingleton {
	
	private static WebDriver driver;	
	
	private DriverSingleton() {}
	
	public static WebDriver getDriver() {
		
		if(null == driver) {
			switch(System.getProperty("browser")) {
			case("firefox"):{
				
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
				break;
			}
			default:{
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
			}
				
		}
		driver.manage().window().maximize();	
	}
	return driver;	
		
	}
	public static void closeDriver() {
		
		driver.close();
		driver = null;
		
	}
}
