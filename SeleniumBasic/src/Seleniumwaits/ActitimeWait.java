package Seleniumwaits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeWait {

	public static void main(String[] args) {
		String driverpath=System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", driverpath);
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.actitime.com");
		//implicit wait
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				
	}

}
