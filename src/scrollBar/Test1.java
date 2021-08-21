package scrollBar;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        
		//type casting 
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		//top to bottom scroll
		js.executeScript("window.scrollBy(0,5000)");
		
		Thread.sleep(3000);
		// bottom to up scroll
		js.executeScript("window.scrollBy(0,-5000)");
	}

}
