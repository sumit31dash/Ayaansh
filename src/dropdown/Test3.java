package dropdown;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Test3 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/index.php");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement ele = driver.findElement(By.id("cars"));
		Select s=new Select(ele);
		s.selectByIndex(3);
		s.selectByValue("500");
		s.selectByVisibleText("INR 300 - INR 399 ( 1 )");
		
		/*s.deselectByIndex(3);
		s.deselectByValue("500");
		s.deselectByVisibleText("INR 300 - INR 399 ( 1 )" );*/
		
		System.out.println(s.isMultiple());//to verify single or multi selected
		if(s.isMultiple())
		{
          s.deselectAll();
		}
		driver.close();
	}

}
