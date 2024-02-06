package SeleniumBasicsInterview;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class SendKeys_JavaScriptExeccutor {

	
	static WebDriver driver = null;
	public static void main(String[] args) {

		
		driver.get("https://login.yahoo.com/?");	
		
		JavascriptExecutor js = ((JavascriptExecutor) driver);
				
		//js.executeScript("docuement.getElementById('id').value" = 'test@yahoo.com'; ");
		
		//driver.findElement(By.xpath("//*[@id=\"login-username\"]")).sendKeys(emailid);
		driver.findElement(By.xpath("//*[@id=\"login-signin\"]")).click();
		
	}

}
