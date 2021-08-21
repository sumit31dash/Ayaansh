package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Simplilearn {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
	driver.get("https://accounts.simplilearn.com/user/login?redirect_url=https%3A%2F%2Flms.simplilearn.com%2F");
		//X path by attributes
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("ram");
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("ram123");
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	
	String title=driver.getTitle();
	System.out.println(title);
	
	String url=driver.getCurrentUrl();
	System.out.println(url);
	driver.close();
	}

}
