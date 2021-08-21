package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreeneraApp {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.screener.in/login/");
		driver.findElement(By.name("username")).sendKeys("sumit31dash@gmail.com");
		driver.findElement(By.name("password")).sendKeys("skd1234");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		String title=driver.getTitle();
		System.out.println(title);
		
		String url=driver.getCurrentUrl();
		System.out.println(url);
		driver.close();
	}

}
