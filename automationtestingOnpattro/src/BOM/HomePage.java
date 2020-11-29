package BOM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HomePage {
	
	public void GetSupport(WebElement webelement) {
		
		Actions action = new Actions(BaseClass.getWebdriver());
		action.moveToElement(webelement).perform();
				
	}
	
}

