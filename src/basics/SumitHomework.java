package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SumitHomework {
	public static void main(String[] args) {
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://www.flipkart.com/");
	 System.out.println(driver.getTitle());
	 System.out.println(driver.getCurrentUrl());
	 driver.close();
	}

}
