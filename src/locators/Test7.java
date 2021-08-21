package locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test7 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys("sumit31dash@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("apple8665");
		driver.findElement(By.name("login")).click();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		String title=driver.getTitle();
		System.out.println(title);
		
		if(title.equals("actiTIME -  Enter Time-Track"))
		{
			System.out.println("pass:Home page is displayed");
		}
		else
		{
			System.out.println("fail:Home page isn't displayed");
		}
		String url=driver.getCurrentUrl();
		System.out.println(url);
		//driver.close();
	}

}
