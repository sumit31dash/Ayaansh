package testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationAndAssertions {
public WebDriver driver;
@BeforeMethod
public void openapp() {
	
	driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/login.do");
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);	
}

@Test
public void login() {
	driver.findElement(By.name("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
	driver.findElement(By.xpath("//div[text()='Login ']")).click();
	String t = driver.getTitle();
	Reporter.log(t,true);
	String url = driver.getCurrentUrl();
	Reporter.log(url, true);
	// assertions = validation
	Assert.assertEquals(t, "actiTIME - Login");
}
@AfterMethod
public void closeapp() {
   
	driver.close();
		
}	
}
