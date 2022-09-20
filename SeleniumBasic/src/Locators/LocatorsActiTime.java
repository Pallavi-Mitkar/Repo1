package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsActiTime {

		public static void main(String[] args) {
			String CurrentWorkingDir=System.getProperty("user.dir");
			String ChromeExePath=CurrentWorkingDir+"\\Executables\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", ChromeExePath);
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://demo.actitime.com");
			System.out.println(driver.getTitle());
			String pageUrl=driver.getCurrentUrl();
			System.out.println("Page Url is: "+pageUrl);
			String expectedURL="https://demo.actitime.com";
			System.out.println("Url validation status: "+pageUrl.contains(expectedURL));
			driver.findElement(By.id("username")).sendKeys("admin");
			driver.findElement(By.name("pwd")).sendKeys("manager");
			driver.findElement(By.id("loginButton")).click();
			//verify home page
			String homePageTitle=driver.getTitle();
			System.out.println("Home page title: "+homePageTitle);
			System.out.println("Home page validation status: "+homePageTitle.equals("actiTIME - Enter Time-Track"));
			//click on logout link
			driver.findElement(By.id("logoutLink")).click();
											    
			driver.close();
			

	}

}
