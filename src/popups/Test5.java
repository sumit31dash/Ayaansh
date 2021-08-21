package popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test5 {

	public static void main(String[] args) {
		// assignment on file upload pop up done
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://my.naukri.com/account/createaccount?othersrcp=23531&wExp=N&utm_source=google&utm_medium=cpc&utm_campaign=Brand&gclid=EAIaIQobChMIrZ3Dm76u8QIVySFgCh1QcgBiEAAYASAAEgJ2pPD_BwE&gclsrc=aw.ds");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[text()='I am a Fresher']")).click();
		driver.findElement(By.name("uploadCV")).sendKeys("C:\\Users\\sumit\\OneDrive\\Desktop\\cv\\it resume\\SUMIT KUMAR DASH_RESUME.docx");
	}

}
