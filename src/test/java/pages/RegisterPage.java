package pages;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Utilities.ExcelUtility;
import resources.ElementRepository;


public class RegisterPage {

	@Test
	public static void registerUser() {
		ExcelUtility.getSheet("RegisterPage");
		
		System.out.println("RegisterUser f...");
		ElementRepository.lnkRegister.click();
		ElementRepository.txtFirstName.sendKeys(ExcelUtility.getCellData(1, "FirstName"));
		ElementRepository.txtLastName.sendKeys(ExcelUtility.getCellData(1, "LastName"));
		ElementRepository.txtPhone.sendKeys(ExcelUtility.getCellData(1, "MobileNumber"));
		ElementRepository.txtEmail.sendKeys(ExcelUtility.getCellData(1, "Email"));
		ElementRepository.txtAddress1.sendKeys(ExcelUtility.getCellData(1, "Address"));
		ElementRepository.txtUserName.sendKeys(ExcelUtility.getCellData(1, "UserName"));
		ElementRepository.txtPassword.sendKeys(ExcelUtility.getCellData(1, "Password"));
		ElementRepository.txtconfirmPassword.sendKeys(ExcelUtility.getCellData(1, "confirmPassword"));

		
		ElementRepository.btnSubmit.click();
		
		System.out.println("Login is done successfully");
	}
}
