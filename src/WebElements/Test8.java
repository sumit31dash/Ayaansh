package WebElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test8 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		WebElement ele = driver.findElement(By.id("keepLoggedInCheckBox"));

			if(ele.isSelected()) {
				System.out.println("pass: the element is selected");
				
			}
			else {
				System.out.println("fail: the element isn't selected");
			}
			
			driver.close();
	}

}
