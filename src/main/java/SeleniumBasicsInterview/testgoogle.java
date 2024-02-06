package SeleniumBasicsInterview;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testgoogle {

	static WebDriver driver = null;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Asus\\OneDrive\\Desktop\\chromedriver-win64\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		System.out.println("url open successfully");
		Thread.sleep(3000);
		driver.close();

	}

}
