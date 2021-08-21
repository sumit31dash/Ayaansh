package frames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
        // assignment
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com/");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		  driver.findElement(By.xpath("//span[text()='Sign In']")).click();
		  driver.findElement(By.xpath("//a[text()='login']")).click();
		  driver.switchTo().frame(0);
		  driver.findElement(By.id("userName")).sendKeys("8658593780");
		 
		 Thread.sleep(3000);
		  driver.findElement(By.id("checkUser")).click();
		  driver.close();
	}

}
