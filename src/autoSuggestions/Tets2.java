package autoSuggestions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tets2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		// assignment
		 WebElement ele = driver.findElement(By.id("twotabsearchtextbox"));
		 ele.sendKeys("phone");
		 Thread.sleep(3000);
		 List<WebElement> ele1 = driver.findElements(By.xpath("//img[@width='1500px']"));
		 System.out.println(ele1.size());
		 for(WebElement text:ele1){
			 System.out.println(text.getText());
		 }
	
		 driver.close();
	}

}
