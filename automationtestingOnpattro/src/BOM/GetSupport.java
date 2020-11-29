package BOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class GetSupport {

	public void FillFirstName(String firstname) {
		BaseClass.getWebdriver().findElement(By.id("edit-firstname")).sendKeys(firstname);
	}

	public void FillLasttName(String lastname) {
		BaseClass.getWebdriver().findElement(By.name("lastname")).sendKeys(lastname);
	}

	public void SelectGender() {
		BaseClass.getWebdriver().findElement(By.className("checker-radio")).click();
	}

	public void Fillstreetaddress(String streetaddress) {
		BaseClass.getWebdriver().findElement(By.id("edit-streetaddress")).sendKeys(streetaddress);
	}

	public void FillCity(String city) {
		BaseClass.getWebdriver().findElement(By.id("edit-city")).sendKeys(city);
	}

	public void FillState() {
		new Select(BaseClass.getWebdriver().findElement(By.name("state"))).selectByVisibleText("California");

	}

	public void Fillzipcode(String zipcode) {
		BaseClass.getWebdriver().findElement(By.id("edit-zipcode")).sendKeys(zipcode);
	}

	public void Fillemailaddress(String emailaddress) {
		BaseClass.getWebdriver().findElement(By.id("edit-email")).sendKeys(emailaddress);
	}

	public void Fillphone(String phone) {
		BaseClass.getWebdriver().findElement(By.id("edit-phone")).sendKeys(phone);
	}

	public void CheckBoxVoicemail() {
		WebElement checkVoicemail = BaseClass.getWebdriver()
				.findElement(By.className("//*[@id=\"webform-submission-contact-pel-node-3768-add-form\"]/div[8]/label"));
		Actions act = new Actions(BaseClass.getWebdriver());
		act.moveToElement(checkVoicemail).click().build().perform();
	}

	public void CheckBoxTwo() {
		WebElement checkTwo = BaseClass.getWebdriver().findElement(
				By.xpath("//*[@id=\"webform-submission-contact-pel-node-3768-add-form\"]/div[9]/label/span[1]"));

		Actions act = new Actions(BaseClass.getWebdriver());
		act.moveToElement(checkTwo).click().build().perform();

	}

	public void CheckBoxThree() {
		WebElement CheckBoxThree = BaseClass.getWebdriver().findElement(
				By.xpath("//*[@id=\"webform-submission-contact-pel-node-3768-add-form\"]/div[10]/label/span[1]"));

		Actions act = new Actions(BaseClass.getWebdriver());
		act.moveToElement(CheckBoxThree).click().build().perform();

	}

	public void CheckBoxage() {
		WebElement CheckBoxage = BaseClass.getWebdriver().findElement(
				By.xpath("//*[@id=\"webform-submission-contact-pel-node-3768-add-form\"]/div[11]/label/span[1]"));

		Actions act = new Actions(BaseClass.getWebdriver());
		act.moveToElement(CheckBoxage).click().build().perform();

	}

	public void Submit() {
		BaseClass.getWebdriver().findElement(By.id("edit-actions-submit")).click();
	}

	public String getsuccessmessage() {
		return BaseClass.getWebdriver()
				.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/section/div/article/div/div[3]/h1")).getText();
	}

}
