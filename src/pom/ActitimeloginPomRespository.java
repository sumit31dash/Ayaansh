package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * Decription: pom repository created here
 * @author sumit
 *
 */

public class ActitimeloginPomRespository {
	
	
	// declaration
	@FindBy(id="username")
	private WebElement usernametb;
	
	@FindBy(name="pwd")
	private WebElement passwordtb;
	
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement loginbtn;
	
	// intitialization
	public ActitimeloginPomRespository(WebDriver driver) {
	 PageFactory.initElements(driver,this);
	}
	//utilization
	public void username(String username) {
	usernametb.sendKeys(username);
	}
	public void password(String password) {
		passwordtb.sendKeys(password);
	}
	public void login() {
		loginbtn.click();
	}
	
	
	
	
	
	
	

}
