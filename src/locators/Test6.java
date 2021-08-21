package locators;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Test6 {
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.actitime.com/login.do");
		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
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


