package SeleniumDemoScript1;

import org.testng.annotations.*;


public class TestNgPassParameter {
	
@Test
	
    @Parameters("myName")
	
	   public void parameterTesttest(@Optional("xyz")String myName) {
	      System.out.println("Parameterized value is : " + myName);
	   }

}
