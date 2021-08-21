package popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test2 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/index.php");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//assignment of class
		WebElement ele = driver.findElement(By.id("course"));
		Actions a=new Actions(driver);
		//moveToElement method used for mouse hover
		a.moveToElement(ele).perform();
		driver.findElement(By.xpath("(//a[text()='Selenium Training'])[2]")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary btn-lg btn-flat']")).click();
		Alert a1 = driver.switchTo().alert();
		System.out.println(a1.getText());
		//to cancel we use dismiss method (alert pop up)
		a1.dismiss();
		driver.close();
	}

}
