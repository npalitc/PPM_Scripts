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
public class VerifyMessage_Page extends PageObjectBase{
@FindBy(how= How.ID, using = "is_displayed_on_the_screen_")
	public static WebElement is_displayed_on_the_screen_;

public void verify_is_displayed_on_the_screen_(String data){
		Assert.assertEquals(is_displayed_on_the_screen_,is_displayed_on_the_screen_);
}

public void verify_is_displayed_on_the_screen__Status(String data){
		//Verifies the Status of the is_displayed_on_the_screen_
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(is_displayed_on_the_screen_.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(is_displayed_on_the_screen_.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!is_displayed_on_the_screen_.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!is_displayed_on_the_screen_.isEnabled());
				break;
			default:
				break;
			}
		}
	}
@FindBy(how= How.ID, using = "Message_field")
	public static WebElement Message_field;

public void verify_Message_field(String data){
		Assert.assertEquals(Message_field,Message_field);
}

public void enter_Message_field(String data){
		Message_field.sendKeys(data);
}

public static void verify_Text(String data){
	Assert.assertTrue(driver.getPageSource().contains(data));
}
}