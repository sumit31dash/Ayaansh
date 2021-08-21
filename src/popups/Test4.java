package popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test4 {

	public static void main(String[] args)  {
		// assignment on hidden division pop up
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		driver.findElement(By.xpath("//button[text()='Jun 21 - Jun 27, 2021']")).click();
		
		WebDriverWait w=new WebDriverWait(driver,10);
		WebElement ele =driver.findElement(By.id("(//span[text()='30'])[2]"));
		ele.click();
		w.until(ExpectedConditions.elementToBeClickable(ele)).click();
		driver.close();//not complete line no 26
	}

}
