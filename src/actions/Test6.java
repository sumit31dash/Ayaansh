package actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Test6 {

	public static void main(String[] args) throws InterruptedException {
		//assignment
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/index.php");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.name("addresstype")).click();
	    driver.findElement(By.linkText("Selenium Training")).click();
	    Thread.sleep(3000);
		WebElement ele =driver.findElement(By.id("add"));
		Actions a=new Actions(driver);
		//double click method used
		a.doubleClick(ele).perform();
		//drop down
		Select s=new Select(ele);
		s.selectByIndex(1);
		s.selectByValue("category.php?category=testing");
		s.selectByVisibleText("May");
	}

}
