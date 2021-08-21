package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test8 {

	public static void main(String[] args) {
		
		// Login function Passed /Validated
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		
		
		String title = driver.getTitle();
		System.out.println(title);
		
		if(title.equals("actiTIME - Enter Time-Track"))
						 
		{
			System.out.println("Pass:Home page is displayed");
		}
		
		else
		{
			System.out.println("Fail:Home page is not displayed");
		}
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		//driver.close();

	}

}