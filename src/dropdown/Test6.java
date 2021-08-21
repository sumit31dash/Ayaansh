package dropdown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test6 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//assignment
		driver.findElement(By.id("gh-cat")).click();
		driver.findElement(By.id("gh-btn")).click();
		 driver.findElement(By.linkText("Books")).click();
		 WebElement ele = driver.findElement(By.xpath("//p[text()='Hardcover']"));
		 ele.click();

	    Select s=new Select(ele);
		s.selectByIndex(4);
		s.selectByValue("267");
		s.selectByVisibleText("Books");

		String title=driver.getTitle();
		System.out.println(title);
		
	}


}
