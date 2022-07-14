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
public class SignInPage_Page extends PageObjectBase{
@FindBy(how= How.ID, using = "userid")
	public static WebElement UserId_textbox;

public void verify_UserId_textbox(String data){
		if(!data.contentEquals("Dont care")){
			
		Assert.assertEquals(UserId_textbox.getAttribute("value"),data);
	}

}

public void verify_UserId_textbox_Status(String data){
		//Verifies the Status of the UserId_textbox
		if(!data.contentEquals("Dont care")){
			
			switch(data){
			case "ENABLED":
				Assert.assertTrue(UserId_textbox.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(UserId_textbox.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!UserId_textbox.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!UserId_textbox.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_UserId_textbox(String data){
		UserId_textbox.clear();
		UserId_textbox.sendKeys(data);
}

@FindBy(how= How.NAME, using = "password")
	public static WebElement Password_textbox;

public void verify_Password_textbox(String data){
		if(!data.contentEquals("Dont care")){
			
		Assert.assertEquals(Password_textbox.getAttribute("value"),data);
	}

}

public void verify_Password_textbox_Status(String data){
		//Verifies the Status of the Password_textbox
		if(!data.contentEquals("Dont care")){
			
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Password_textbox.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Password_textbox.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Password_textbox.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Password_textbox.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_Password_textbox(String data){
		Password_textbox.clear();
		Password_textbox.sendKeys(data);
}

@FindBy(how= How.XPATH, using = "//button[@id='btnActive']")
	public static WebElement SignIn_button;

public void verify_SignIn_button_Status(String data){
		//Verifies the Status of the SignIn_button
		if(!data.contentEquals("Dont care")){
			
			switch(data){
			case "ENABLED":
				Assert.assertTrue(SignIn_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(SignIn_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!SignIn_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!SignIn_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_SignIn_button(){
		SignIn_button.click();
}

public static void verify_Text(String data){
	Assert.assertTrue(driver.getPageSource().contains(data));
}
}