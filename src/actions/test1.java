package actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class test1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement ele=driver.findElement(By.xpath("(//a[@data-type='navElements'])[2]"));
		Actions a=new Actions(driver);
		//moveToElement method used mouse hover
		a.moveToElement(ele).perform();
		driver.findElement(By.xpath("//a[@data-reactid='217']")).click();
		driver.close();
	}

}
