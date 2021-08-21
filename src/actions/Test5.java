package actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test5 {
	public static void main(String[] args) {
		// assignment done
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://luxire.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement ele=driver.findElement(By.xpath("//a[text()='Account']"));
		Actions a=new Actions(driver);
		a.moveToElement(ele).perform();
		 driver.findElement(By.xpath("//a[text()='Login']")).click();
		
	}

}
