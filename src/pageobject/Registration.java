package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

//import utility.CaptureScreenshots;

public class Registration {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium jars\\gecko\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.tnstc.in/TNSTCOnline/preUserRegistration.do");
		
		PageObjectModel.txt_UserName(driver).sendKeys("kesav");
		
		PageObjectModel.txt_Password(driver).sendKeys("123123");
		
		//CaptureScreenshots.snapshots(driver, "test1");
		
		PageObjectModel.txt_ConfirmPassword(driver).sendKeys("123123");
		
		Select sel = new Select(PageObjectModel.dd_SecretQuestion(driver));
		
		sel.selectByIndex(7);
	
		PageObjectModel.txt_Answer(driver).sendKeys("Football");
		
		//CaptureScreenshots.snapshots(driver, "test2");
		
	}

}
