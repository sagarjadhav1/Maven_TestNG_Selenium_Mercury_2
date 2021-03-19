package pages;

import org.testng.annotations.Test;

import Utilities.ExcelUtility;
import resources.ElementRepository;

public class LoginPage {

	@Test
	public static void login() {
		System.out.println("Login...e");
		ExcelUtility.getSheet("LoginPage");
		ElementRepository.lnkSignOn.click();
		
		ElementRepository.txtUserName.sendKeys(ExcelUtility.getCellData(1, "UserName"));
		ElementRepository.txtPassword.sendKeys(ExcelUtility.getCellData(1, "Password"));
	
		ElementRepository.btnSubmit.click();
		System.out.println("Login is done successfully");
	}
	@Test
	public static void login_DD() {
		System.out.println("Login...DD");
		ExcelUtility.getSheet("LoginPage");
		for (int i = 1; i <=ExcelUtility.getRowCount(); i++) {
			
		ElementRepository.lnkSignOn.click();
		
		ElementRepository.txtUserName1.sendKeys(ExcelUtility.getCellData(i, "UserName"));
		ElementRepository.txtPassword.sendKeys(ExcelUtility.getCellData(i, "Password"));
	
		ElementRepository.btnSubmit.click();
		System.out.println("Login is done successfully");
		ElementRepository.lnkSignOff.click();
		//lnkSignOff
	}

	}
}
