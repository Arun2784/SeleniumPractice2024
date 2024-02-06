package SeleniumBasicsInterview;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeIncognitoMode {

	static WebDriver driver;
	
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

	
		driver.manage().window().maximize();
		driver.get("https://www.Google.com");
		driver.close();

	}

}
