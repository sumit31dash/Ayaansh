package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0 {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://skillrary.com/user/login");
		driver.findElement(By.id("email")).sendKeys("abcdef");
		driver.findElement(By.name("password")).sendKeys("xyz");
		driver.findElement(By.linkText("Forgot Password")).click();
		//driver.findElement(By.partialLinkText("Forgot")).click();
	}

}
