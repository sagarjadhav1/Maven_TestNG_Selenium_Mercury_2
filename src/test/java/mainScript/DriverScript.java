package mainScript;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Utilities.ExcelUtility;
import resources.ElementRepository;

public class DriverScript {
	public WebDriver driver; 
	@Test
	public void startTest() throws Exception {
		DesiredCapabilities cap=DesiredCapabilities.chrome();
		cap.setBrowserName("Chrome");
		cap.setPlatform(Platform.WIN10);
		ExcelUtility.excelInit();
		System.out.println("Launch Browser....");
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver\\chromedriver.exe");
		
	//	driver=new RemoteWebDriver(new URL("http://localhost:4321/wd/hub"), cap);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.navigate().to("http://demo.guru99.com/test/newtours/index.php");
		ElementRepository ele=new ElementRepository();
		PageFactory.initElements(driver, ele);
	}
	
}
