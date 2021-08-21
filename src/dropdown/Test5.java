package dropdown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test5 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/index.php");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//assignment
		driver.findElement(By.name("addresstype")).click();
	    driver.findElement(By.linkText("Selenium Training")).click();
	    Thread.sleep(3000);
		WebElement ele =driver.findElement(By.xpath("//button[@class='btn btn-primary btn-lg btn-flat']"));
		ele.click();
		Select s=new Select(ele);
		s.selectByIndex(1);
		s.selectByValue("category.php?category=testing");
		s.selectByVisibleText("May");
		driver.close();
	}

}
