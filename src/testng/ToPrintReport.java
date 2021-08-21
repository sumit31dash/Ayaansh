package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToPrintReport {
  @Test
  public void demo() {
	  
	  // if we write true then it will print in console as well as in report via emailable-report.html
	 Reporter.log("gd mrng",true);
	 
	 // if we write only false the it only show in report but not print in console
	 Reporter.log("gd night",false);

}
}
