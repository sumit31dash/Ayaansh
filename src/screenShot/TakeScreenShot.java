package screenShot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenShot {
public static void main(String[] args) throws IOException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://demo.actitime.com/login.do");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	//step=1
	TakesScreenshot ts=(TakesScreenshot)driver;
	
	//step=2
	File source = ts.getScreenshotAs(OutputType.FILE);
	
	//step=3
	File destination = new File("./photo/actitime.png");
	
	//step=4
	FileUtils.copyFile(source, destination);
}
	
}
