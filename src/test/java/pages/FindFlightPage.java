package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import resources.ElementRepository;

public class FindFlightPage {

	
	
	@Test
	public static void findFlight() {
		System.out.println("Find Flight...e");
		ElementRepository.lnkFlights.click();
		selectItemFromList(ElementRepository.passCount,"2");
		selectItemFromList(ElementRepository.fromPort,"London");
		selectItemFromList(ElementRepository.fromMonth,"December");
		ElementRepository.findFlights.click();

	
	}public static  void selectItemFromList(WebElement ele,String item){
		//WebElement ele=driver.findElement(By.name(""));
		Select drp=new Select(ele);
		drp.selectByVisibleText(item);
	}
}
