package pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class ActitimeLoginTest {

	public static void main(String[] args) {

		//execute Actitime login method
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		ActitimeloginPomRespository a =new ActitimeloginPomRespository(driver);
		a.username("admin");
		a.password("manager");
		a.login();
		driver.close();

	}

}
