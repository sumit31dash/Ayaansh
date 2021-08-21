package dataDriven;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		// data driven
				// reading the data from excel sheet with apache POI adding
		FileInputStream fis=new FileInputStream ("./data.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		
		String url = wb.getSheet("sheet1").getRow(1).getCell(0).getStringCellValue();
		driver.get(url);
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		 String us = wb.getSheet("sheet1").getRow(1).getCell(1).getStringCellValue();
		 driver.findElement(By.id("username")).sendKeys(us);
		 String pwd = wb.getSheet("sheet1").getRow(1).getCell(2).getStringCellValue();
		 driver.findElement(By.name("pwd")).sendKeys(pwd);
		 
	}

}
