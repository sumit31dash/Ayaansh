package screenShot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		//step1 type casting
		TakesScreenshot ts=(TakesScreenshot)driver;
		
		//step2 i can access method and photo will be stored in ram
		File src=ts.getScreenshotAs(OutputType.FILE);
		
		//step 3 specify the required location
		File dest=new File("./photo/amazon.png");
		
		//step4 copy the photo from ram to required location
		FileUtils.copyFile(src, dest);
	}

}
