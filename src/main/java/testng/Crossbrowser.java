package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Crossbrowser {

	WebDriver driver =null;
	
	@Parameters("browser")
	@BeforeTest
		public void setup(String browserName)  {
		
		if(browserName.equalsIgnoreCase("chrome")) {
			
			System.out.println("browser  name is  " + browserName);
			System.out.println("Threadnumber is -: " +Thread.currentThread().getId());
			System.setProperty("webdriver.chrome.driver"
					, "C:\\Users\\Asus\\OneDrive\\Desktop\\chromedriver-win64//chromedriver.exe");
				driver= new ChromeDriver();	
		}
		
		else if (browserName.equalsIgnoreCase("FireFox")){
			System.out.println("browser  name is  " + browserName);
			System.out.println("Threadnumber is -:" +Thread.currentThread().getId());
			   WebDriverManager.firefoxdriver().setup();
				driver= new FirefoxDriver();	
			
		}
		else if (browserName.equalsIgnoreCase("IE")){
			System.out.println("browser  name is  " + browserName);
			System.out.println("Threadnumber is -:" +Thread.currentThread().getId());
			   WebDriverManager.edgedriver().setup();
				driver= new EdgeDriver();	
			
		}	

		}
	
	@Test
	public void login() throws InterruptedException {
		driver.get("https://www.Google.com");
		Thread.sleep(3000);
		
		
	}
	
	@AfterTest
	
	public void tearDown() {
		
		driver.close();
		System.out.println("Test completed");
		
		
	}
	
	
}
