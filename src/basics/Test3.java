package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {

	public static void main(String[] args)
	{
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.navigate().to("https://www.facebook.com/");
	 driver.navigate().back();//to back
	 driver.navigate().forward();//to forward
	 driver.navigate().refresh();//to refresh
	 driver.close();// to close
	 
	}

}
