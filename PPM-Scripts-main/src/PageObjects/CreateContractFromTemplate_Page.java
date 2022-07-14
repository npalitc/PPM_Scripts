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
public class CreateContractFromTemplate_Page extends PageObjectBase{
@FindBy(how= How.ID, using = "Number_textbox")
	public static WebElement Number_textbox;

public void verify_Number_textbox(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Number_textbox.getAttribute("value"),data);
	}

}

public void verify_Number_textbox_Status(String data){
		//Verifies the Status of the Number_textbox
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Number_textbox.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Number_textbox.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Number_textbox.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Number_textbox.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_Number_textbox(String data){
		Number_textbox.clear();
		Number_textbox.sendKeys(data);
}

@FindBy(how= How.ID, using = "StartDate_textbox")
	public static WebElement StartDate_textbox;

public void verify_StartDate_textbox(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(StartDate_textbox.getAttribute("value"),data);
	}

}

public void verify_StartDate_textbox_Status(String data){
		//Verifies the Status of the StartDate_textbox
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(StartDate_textbox.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(StartDate_textbox.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!StartDate_textbox.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!StartDate_textbox.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_StartDate_textbox(String data){
		StartDate_textbox.clear();
		StartDate_textbox.sendKeys(data);
}

@FindBy(how= How.ID, using = "EndDate_textbox")
	public static WebElement EndDate_textbox;

public void verify_EndDate_textbox(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(EndDate_textbox.getAttribute("value"),data);
	}

}

public void verify_EndDate_textbox_Status(String data){
		//Verifies the Status of the EndDate_textbox
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(EndDate_textbox.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(EndDate_textbox.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!EndDate_textbox.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!EndDate_textbox.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_EndDate_textbox(String data){
		EndDate_textbox.clear();
		EndDate_textbox.sendKeys(data);
}

@FindBy(how= How.ID, using = "OK_button")
	public static WebElement OK_button;

public void verify_OK_button_Status(String data){
		//Verifies the Status of the OK_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(OK_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(OK_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!OK_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!OK_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_OK_button(){
		OK_button.click();
}

@FindBy(how= How.ID, using = "Cancel_button")
	public static WebElement Cancel_button;

public void verify_Cancel_button_Status(String data){
		//Verifies the Status of the Cancel_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Cancel_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Cancel_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Cancel_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Cancel_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Cancel_button(){
		Cancel_button.click();
}

@FindBy(how= How.ID, using = "OtherParties_checkbox")
	public static WebElement OtherParties_checkbox;

public void verify_OtherParties_checkbox(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(OtherParties_checkbox.getAttribute("value"),data);
	}

}

public void verify_OtherParties_checkbox_Status(String data){
		//Verifies the Status of the OtherParties_checkbox
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(OtherParties_checkbox.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(OtherParties_checkbox.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!OtherParties_checkbox.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!OtherParties_checkbox.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_OtherParties_checkbox(String data){
		if(OtherParties_checkbox.isSelected());
			OtherParties_checkbox.click();
}

@FindBy(how= How.ID, using = "Lines_checkbox")
	public static WebElement Lines_checkbox;

public void verify_Lines_checkbox(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Lines_checkbox.getAttribute("value"),data);
	}

}

public void verify_Lines_checkbox_Status(String data){
		//Verifies the Status of the Lines_checkbox
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Lines_checkbox.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Lines_checkbox.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Lines_checkbox.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Lines_checkbox.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_Lines_checkbox(String data){
		if(Lines_checkbox.isSelected());
			Lines_checkbox.click();
}

public static void verify_Text(String data){
	Assert.assertTrue(driver.getPageSource().contains(data));
}
}