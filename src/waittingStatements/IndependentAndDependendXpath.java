package waittingStatements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IndependentAndDependendXpath {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/downloads/");
		//independent and dependent X path
		driver.findElement(By.xpath("//td[text()='Ruby']/../td[4]")).click();

	}

}
