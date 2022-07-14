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
public class CaptureCosts_Page extends PageObjectBase{
@FindBy(how= How.ID, using = "_hyperlink")
	public static WebElement _hyperlink;

public void verify__hyperlink_Status(String data){
		//Verifies the Status of the _hyperlink
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(_hyperlink.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(_hyperlink.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!_hyperlink.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!_hyperlink.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click__hyperlink(){
		_hyperlink.click();
}

@FindBy(how= How.ID, using = "CreateNonLaborCosts_hyperlink")
	public static WebElement CreateNonLaborCosts_hyperlink;

public void verify_CreateNonLaborCosts_hyperlink_Status(String data){
		//Verifies the Status of the CreateNonLaborCosts_hyperlink
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(CreateNonLaborCosts_hyperlink.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(CreateNonLaborCosts_hyperlink.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!CreateNonLaborCosts_hyperlink.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!CreateNonLaborCosts_hyperlink.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_CreateNonLaborCosts_hyperlink(){
		CreateNonLaborCosts_hyperlink.click();
}

@FindBy(how= How.ID, using = "CreateLaborCosts_hyperlink")
	public static WebElement CreateLaborCosts_hyperlink;

public void verify_CreateLaborCosts_hyperlink_Status(String data){
		//Verifies the Status of the CreateLaborCosts_hyperlink
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(CreateLaborCosts_hyperlink.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(CreateLaborCosts_hyperlink.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!CreateLaborCosts_hyperlink.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!CreateLaborCosts_hyperlink.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_CreateLaborCosts_hyperlink(){
		CreateLaborCosts_hyperlink.click();
}

public static void verify_Text(String data){
	Assert.assertTrue(driver.getPageSource().contains(data));
}
}