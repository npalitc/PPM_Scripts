package PageObjects;
import org.testng.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import utilities.WebController;
import utilities.PageObjectBase;
@SuppressWarnings("deprecation")
public class ManageUnprocessedCosts_Page extends PageObjectBase{
@FindBy(how= How.XPATH, using = "//*[contains(@id,'_ATp:ATt1:0::di')]")
	public static WebElement SelectRow_button;

public void verify_SelectRow_button_Status(String data){
		//Verifies the Status of the SelectRow_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(SelectRow_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(SelectRow_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!SelectRow_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!SelectRow_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_SelectRow_button(){
		SelectRow_button.click();
}

@FindBy(how= How.XPATH, using = "//a[contains(text(),'Actions')]")
	public static WebElement Actions_dropdown;

public void verify_Actions_dropdown(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Actions_dropdown.getAttribute("value"),data);
	}

}

public void verify_Actions_dropdown_Status(String data){
		//Verifies the Status of the Actions_dropdown
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Actions_dropdown.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Actions_dropdown.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Actions_dropdown.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Actions_dropdown.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_Actions_dropdown(String data){
		Select dropdown= new Select(Actions_dropdown);
		 dropdown.selectByVisibleText(data);
}

@FindBy(how= How.XPATH, using = "//*[contains(@id,'_ATp:OnsS')]")
	public static WebElement ImportAndProcess_button;

public void verify_ImportAndProcess_button_Status(String data){
		//Verifies the Status of the ImportAndProcess_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(ImportAndProcess_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(ImportAndProcess_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!ImportAndProcess_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!ImportAndProcess_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_ImportAndProcess_button(){
		ImportAndProcess_button.click();
}

@FindBy(how= How.XPATH, using = "//button[contains(@id,'UpAp1:AT1:UpD6::yes')]")
	public static WebElement Yes_button;

public void verify_Yes_button_Status(String data){
		//Verifies the Status of the Yes_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Yes_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Yes_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Yes_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Yes_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Yes_button(){
		Yes_button.click();
}

@FindBy(how= How.XPATH, using = "//div[contains(@id,'UpAp1:SPb')]")
	public static WebElement Done_button;

public void verify_Done_button_Status(String data){
		//Verifies the Status of the Done_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Done_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Done_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Done_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Done_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Done_button(){
		Done_button.click();
}

public static void verify_Text(String data){
	Assert.assertTrue(driver.getPageSource().contains(data));
}
}