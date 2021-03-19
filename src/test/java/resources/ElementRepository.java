package resources;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ElementRepository {
	@FindBy(linkText="REGISTER")
	public
	static WebElement lnkRegister;
	
	@FindBy(name="firstName")
	public static WebElement txtFirstName;
	
	@FindBy(name="lastName")
	public static WebElement txtLastName;
	
	@FindBy(name="phone")
	public static WebElement txtPhone;
	
	@FindBy(name="userName")
	public static WebElement txtEmail;
	
	@FindBy(name="address1")
	public static WebElement txtAddress1;

	@FindBy(name="userName")
	public static WebElement txtUserName1;
	@FindBy(name="email")
	public static WebElement txtUserName;
	

	@FindBy(name="password")
	public static WebElement txtPassword;
	

	@FindBy(name="confirmPassword")
	public static WebElement txtconfirmPassword;
	
	@FindBy(name="submit")
	public static WebElement btnSubmit;
	@FindBy(linkText="Flights")
	public
	static WebElement lnkFlights;
	
	@FindBy(name="passCount")
	public static WebElement passCount;
	@FindBy(name="fromPort")
	public static WebElement fromPort;
	@FindBy(name="fromMonth")
	public static WebElement fromMonth;
	@FindBy(name="findFlights")
	public static WebElement findFlights;

	@FindBy(linkText="SIGN-ON")
	public
	static WebElement lnkSignOn;

	@FindBy(linkText="SIGN-OFF")
	public
	static WebElement lnkSignOff;
	
}
