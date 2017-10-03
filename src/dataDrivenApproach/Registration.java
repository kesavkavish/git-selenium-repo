package dataDrivenApproach;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import pageobject.PageObjectModel;

public class Registration {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium jars\\gecko\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		//driver.manage().window().maximize();
		
		driver.get(Constant.Url);
		
		ExcelRead.setExcelFile(Constant.excelPath + Constant.excelName, Constant.sheetName);
		
		PageObjectModel.txt_UserName(driver).sendKeys(ExcelRead.getCellData(1, 1));
		
		PageObjectModel.txt_Password(driver).sendKeys(ExcelRead.getCellData(2, 1));
		
		PageObjectModel.txt_ConfirmPassword(driver).sendKeys(ExcelRead.getCellData(3, 1));
		
		Select sel = new Select(PageObjectModel.dd_SecretQuestion(driver));
		
		sel.selectByIndex(7);
		
		PageObjectModel.txt_Answer(driver).sendKeys(ExcelRead.getCellData(4, 1));

	}

}
