package firstProject;

import java.lang.classfile.instruction.NewMultiArrayInstruction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class mytestcases {
	
	WebDriver driver = new ChromeDriver();
	
	
@BeforeTest
	public void Setup ()  {
	
	driver.get("https://www.google.com");
}

 //ahmed

	@Test
	
	public void SerchAboutMySelf ()  {}
	
	
	
	
	
	@AfterTest  
	public void AfterMyTest ()  {}
	
	

	
	
	
	

}
