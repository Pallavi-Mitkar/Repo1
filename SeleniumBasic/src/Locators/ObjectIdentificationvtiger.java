package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ObjectIdentificationvtiger {

	public static void main(String[] args) {
		String CurrentWorkingDir=System.getProperty("user.dir");
		String ChromeExePath=CurrentWorkingDir+"\\Executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", ChromeExePath);
		WebDriver driver=new ChromeDriver();
		
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
