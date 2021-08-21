package waittingStatements;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Test2 {
	public static void main(String[] args) {
		
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demo.actitime.com/login.do");
			
			// explicit wait statement
			WebDriverWait w=new WebDriverWait(driver,10);
			
			//expected condition method used
			WebElement ele=driver.findElement(By.id("username"));
			w.until(ExpectedConditions.visibilityOf(ele)).sendKeys("admin");
			driver.findElement(By.name("pwd")).sendKeys("manager");
			
			//expected condition method used
			WebElement btn=driver.findElement(By.xpath("//div[text()='Login ']"));
			w.until(ExpectedConditions.elementToBeClickable(ele)).click();
			
			String title=driver.getTitle();
			System.out.println(title);
			
			if(title.equals("actiTIME - Login"))
			{
				System.out.println("pass:Home page is displayed");
			}
			else
			{
				System.out.println("fail:Home page isn't displayed");
			}
			String url=driver.getCurrentUrl();
			System.out.println(url);
			driver.close();

	}

}
