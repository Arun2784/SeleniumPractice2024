package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ParallelTesting {

	WebDriver driver =null;
	
@Test
	public void test1() throws InterruptedException {
	
	System.out.println("Inside test1 method  | " + Thread.currentThread().getName());
	   WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		Thread.sleep(3000);
		driver.close();
		

	}


@Test(invocationCount = 5)
	public void test2() throws InterruptedException {
	System.out.println("Inside test2 method  | " + Thread.currentThread().getName());
	WebDriverManager.chromedriver().setup();
	driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.linkedin.com/home");
	Thread.sleep(3000);
	driver.close();

	}

}
