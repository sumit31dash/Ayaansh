package locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(3000);
		driver.findElement(By.linkText("actiTIME Inc.")).click();
		
		driver.findElement(By.linkText("Start Using actiTIME")).click();
		
		driver.findElement(By.id("firstName")).sendKeys("sumit");
		// assignment not completed
		/*driver.findElement(By.name("lastName")).sendKeys("abc123");
		driver.findElement(By.id("emailAddress")).sendKeys("sumit31dash@gmail.com");
		driver.findElement(By.name("company")).sendKeys("tcs");
		driver.findElement(By.linkText("start-trial-submit")).click();*/
	}

}
