package Day1.BasicOp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {
		
		
		String CurrentWorkingDir=System.getProperty("user.dir");
		String ChromeExePath=CurrentWorkingDir+"\\Executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", ChromeExePath);
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		String PageTitle=driver.getTitle();
		String ExpectedTitle="Facebook – log in or sign up";
		System.out.println("Actual Title is: "+PageTitle);
		System.out.println(PageTitle.equals(ExpectedTitle));
		
		String CurrentUrl=driver.getCurrentUrl();
		String ExpectedUrl="https://www.facebook.com";
		System.out.println(CurrentUrl.contains(ExpectedUrl));
		
		String PageSource=driver.getPageSource();
		System.out.println(PageSource.length());
		
		
		
		
		
		driver.close();

	}

}
