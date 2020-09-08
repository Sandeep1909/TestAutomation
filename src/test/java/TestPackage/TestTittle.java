package TestPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestTittle {
	
	
	@Test
	public  void TittleTest()  {
	       System.setProperty("webdriver.chrome.driver","C:\\Users\\Sandeep\\Chrome85\\chromedriver_win32\\chromedriver.exe");	
	       
	       WebDriver driver = new ChromeDriver();
	       
	     //  driver.manage().window().maximize();
	                                                                                                                                                                                                                                                                                           
	       String baseUrl = "https://www.facebook.com/";                            
	       String expectedTitle = "Facebook – log in or sign up";
	       String actualTitle = "";
	       driver.get(baseUrl);
	       actualTitle = driver.getTitle();
	       System.out.println(actualTitle);
	       if (actualTitle.equalsIgnoreCase("Facebook – log in or sign up")){
	           System.out.println("TEST PASSED!");
	       } else {
	           System.out.println("TEST FAILED");
	           
	       }                             
	    
	       
	       driver.close();                                      
	   }
	
	


}
