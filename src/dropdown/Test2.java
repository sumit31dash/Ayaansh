package dropdown;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Test2 {
		public static void main(String[] args) throws InterruptedException {
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.amazon.com/");
			//drop down list used
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			WebElement ele = driver.findElement(By.id("searchDropdownBox"));
			//ele.click();
			Select s=new Select(ele);
			//get options and get text method used
			List<WebElement> options = s.getOptions();
			System.out.println(options.size());
			for(WebElement b:options)
			{
				System.out.println(b.getText());
			}
			     Thread.sleep(3000);
			s.selectByIndex(3);
			     Thread.sleep(3000);
			s.selectByValue("search-alias=beauty-intl-ship");
			     Thread.sleep(3000);
			s.selectByVisibleText("Computers");
			System.out.println(s.isMultiple());//to verify single or multi selected
			if(s.isMultiple())
			{
	          s.deselectAll();
			}
			driver.close();
	}

}
