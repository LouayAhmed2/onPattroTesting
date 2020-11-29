package BOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	static WebDriver drive;

	public void setUp() {
		drive = new ChromeDriver();
		drive.get("https://www.onpattro.com");
		drive.findElement(By.className("call-to-action")).click();
		drive.manage().window().maximize();
		
	}
	
	public static WebDriver getWebdriver() {
		return drive;
	}

}
