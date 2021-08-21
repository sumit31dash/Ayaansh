package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linkedin {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.linkedin.com/login?fromSignIn=true&trk=guest_homepage-basic_nav-header-signin");
		driver.findElement(By.id("username")).sendKeys("rahul");
		driver.findElement(By.id("password")).sendKeys("rhl");
		//X path by attributes
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		

		String title=driver.getTitle();
		System.out.println(title);
		
		String url=driver.getCurrentUrl();
		System.out.println(url);
		driver.close();
	}

}
