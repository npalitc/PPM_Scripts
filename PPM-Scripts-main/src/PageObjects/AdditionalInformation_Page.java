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
public class AdditionalInformation_Page extends PageObjectBase{
@FindBy(how= How.XPATH, using = "//span[contains(text(),'K')]")
	public static WebElement Ok_button;

public void verify_Ok_button_Status(String data){
		//Verifies the Status of the Ok_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Ok_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Ok_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Ok_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Ok_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Ok_button(){
		Ok_button.click();
}

@FindBy(how= How.ID, using = "Client___Billable_button")
	public static WebElement Client___Billable_button;

public void verify_Client___Billable_button_Status(String data){
		//Verifies the Status of the Client___Billable_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Client___Billable_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Client___Billable_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Client___Billable_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Client___Billable_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Client___Billable_button(){
		Client___Billable_button.click();
}

@FindBy(how= How.ID, using = "Client___Non_Billable_button")
	public static WebElement Client___Non_Billable_button;

public void verify_Client___Non_Billable_button_Status(String data){
		//Verifies the Status of the Client___Non_Billable_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Client___Non_Billable_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Client___Non_Billable_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Client___Non_Billable_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Client___Non_Billable_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Client___Non_Billable_button(){
		Client___Non_Billable_button.click();
}

@FindBy(how= How.ID, using = "Client___Training_Day_button")
	public static WebElement Client___Training_Day_button;

public void verify_Client___Training_Day_button_Status(String data){
		//Verifies the Status of the Client___Training_Day_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Client___Training_Day_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Client___Training_Day_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Client___Training_Day_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Client___Training_Day_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Client___Training_Day_button(){
		Client___Training_Day_button.click();
}

public static void verify_Text(String data){
	Assert.assertTrue(driver.getPageSource().contains(data));
}
}