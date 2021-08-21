package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.actitime.com/login.do");
	Thread.sleep(3000);
	driver.findElement(By.linkText("Forgot your password?")).click();
	Thread.sleep(3000);
	driver.findElement(By.id( "forgetPasswordEmailOrUsername")).sendKeys("sumit");
	Thread.sleep(3000);
	driver.findElement(By.linkText("Request Login Info")).click();
	}
}
