package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 
{
public static void main(String[] args) 
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize(); // to maximize the window
	driver.get("https://www.facebook.com/"); //enter URL and page load
	System.out.println(driver.getTitle());  //to get the title
	System.out.println(driver.getCurrentUrl());// go and get the current URL of APP
	driver.close(); // to close the browser
}
}
