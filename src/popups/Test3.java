package popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {

	public static void main(String[] args) throws InterruptedException {
		//assignment for home alert popup
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		driver.findElement(By.id("container_users")).click();
		driver.findElement(By.xpath("//div[text()='New User']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='createUserPanel_firstNameField']")).sendKeys("sumit");
		driver.findElement(By.xpath("//div[@class='closeButton hideButton_panelContainer']")).click();
		Alert a1 = driver.switchTo().alert();
		System.out.println(a1.getText());
		// to click on ok we use accept method
		a1.accept();
		driver.close();
	}

}
