package Day1.BasicOp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitime {

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
		driver.close();
		

	}

}
