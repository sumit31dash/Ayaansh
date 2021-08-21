package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class PrioritiesTheTestCases {
	
	      // to skip the test case enable=false 
	      @Test(priority=1,enabled=false)
	      public void calls() 
	      {
		  Reporter.log("calls",true);
          }
	      
	      
	      
	      
	      
		  // priority not mentioned so default priority 0
	      
	      // invocation  used to run(execute) same script for multiple times
	      
		  @Test(invocationCount=2)
		  
		  public void settings() 
		  {
			  Reporter.log("settings",true);
		  }
		  
		  //  priority -2
			  @Test(priority=-2)
			  public void chats() 
		  {
				  Reporter.log("chats",true);
		  }
		  

}
