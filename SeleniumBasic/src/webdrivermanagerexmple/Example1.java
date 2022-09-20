package webdrivermanagerexmple;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Example1 {

	public static void main(String[] args) {
	     //  String driverpath=System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
	    //   System.setProperty("webdriver.chrome.driver", driverpath);
		
		
		//step1: using webdrivermanager setup the required browsers executables file
		WebDriverManager.chromedriver().setup();
		
		//Step2: Create an instance of chrome browser
		WebDriver driver=new ChromeDriver();
		
		//driver.manage().timeouts().implicitlyWait(30, TimeUnits.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		WebElement username=driver.findElement(By.id("username"));
		username.clear();
		username.sendKeys("admin");
		WebElement password=driver.findElement(By.name("password"));
		password.clear();
		password.sendKeys("Test@123");
		WebElement sbmtbtn=driver.findElement(By.className("buttonBlue"));
		sbmtbtn.click();
		driver.close();
	}

}
