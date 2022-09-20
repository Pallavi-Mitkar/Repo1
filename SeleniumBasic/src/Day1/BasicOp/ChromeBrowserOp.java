package Day1.BasicOp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserOp {

	public static void main(String[] args) {

		
			//Absolute path
			String driverPath1="A:\\java\\workspace\\SeleniumBasic\\executables\\\\chromedriver.exe";
			//or Relative path --> '.' indicate current working dir
			String driverPath2=".\\executables\\chromedriver.exe";
			//or using System class
			String driverPath3=System.getProperty("user.dir")+"\\executables\\chromedriver.exe";
			//Set the driver executable path using System.setProperty(String key,String value)
			System.setProperty("webdriver.chrome.driver", driverPath3);
			//create an instance of required browser class
			WebDriver driver=new ChromeDriver();
			
			
			driver.get("https://www.google.co.in");
		    String actualTitle=driver.getTitle();
		    String expectedTitle="Google";
		    System.out.println("Actual Google page Title is : "+actualTitle);
		    System.out.println("Expected Google page title is: "+expectedTitle);
			System.out.println("Google title validation: "+actualTitle.equals(expectedTitle));
			
			
			String actualUrl=driver.getCurrentUrl();
			String expectedUrl="https://www.google.co";
			System.out.println("Actual Google page Url is : "+actualUrl);
		    System.out.println("Expected Google page Url is: "+expectedUrl);
			System.out.println("Google title validation: "+actualUrl.contains(expectedUrl));
			
			
			String PageSource=driver.getPageSource();
			System.out.println("Page Source Length= " +PageSource.length());
		
		    		
            driver.close();
	}

}
