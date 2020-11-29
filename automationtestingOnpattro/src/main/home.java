package main;




import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BOM.BaseClass;
import BOM.GetSupport;
import BOM.HomePage;

public class home {

	static WebDriver drive;

	@BeforeTest
	public void setUp() {

		BaseClass bc = new BaseClass();
		bc.setUp();
		drive = BaseClass.getWebdriver();
	}

	@Test
	public void main() {
		HomePage Hp = new HomePage();
		WebElement menu = BaseClass.getWebdriver()
				.findElement(By.xpath("//*[@id=\"block-oppatient-main-menu\"]/ul/li[8]"));
		Hp.GetSupport(menu);
		WebElement support = BaseClass.getWebdriver()
				.findElement(By.xpath("//*[@id=\"block-oppatient-main-menu\"]/ul/li[8]/ul/li[2]/a"));
		Hp.GetSupport(support);
		support.click();
		JavascriptExecutor js = (JavascriptExecutor) BaseClass.getWebdriver();
		js.executeScript("window.scrollBy(0,250)", "");
		GetSupport Gs = new GetSupport();
		Gs.FillFirstName("Louay");
		Gs.FillLasttName("Ahmed");
		Gs.SelectGender();
		Gs.Fillstreetaddress("abbasya");
		Gs.FillCity("Cairo");
		Gs.FillState();
		Gs.Fillzipcode("90201");
		Gs.Fillemailaddress("eng_louayahmed@hotmail.com");
		Gs.Fillphone("01111500118");
		Gs.CheckBoxage();
		Gs.CheckBoxThree();
		Gs.CheckBoxTwo();
		Gs.CheckBoxVoicemail();
		Gs.Submit();
		String Successpasserror = Gs.getsuccessmessage();
		assertEquals(Successpasserror, "Thank you");

	}

	@AfterTest
	public void tearDown() {
		drive.close();
	}
}