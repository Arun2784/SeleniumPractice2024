package testng;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class howtoPassParameter {
     WebDriver driver;	
	
	@Test
	@Parameters({"browser", "url", "emailid"})
	public void YahooLogintest(String browser, String url, String emailid) {
		if(browser.equals("chrome")) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();	
		}
		
		else if(browser.equals("Firefox")) {
			
			WebDriverManager.firefoxdriver().setup();
			
			driver = new FirefoxDriver();	
			
		}
		
		driver.get("https://login.yahoo.com/?");	
		driver.findElement(By.xpath("//*[@id=\"login-username\"]")).sendKeys(emailid);
		driver.findElement(By.xpath("//*[@id=\"login-signin\"]")).click();

	}

}
