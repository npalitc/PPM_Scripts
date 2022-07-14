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
public class CostsOverview_Page extends PageObjectBase{
@FindBy(how= How.XPATH, using = "//*[contains(@id,'sdh4::_afrDscl')]")
	public static WebElement ProcessMonitor_button;

public void verify_ProcessMonitor_button_Status(String data){
		//Verifies the Status of the ProcessMonitor_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(ProcessMonitor_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(ProcessMonitor_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!ProcessMonitor_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!ProcessMonitor_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_ProcessMonitor_button(){
		ProcessMonitor_button.click();
}

@FindBy(how= How.XPATH, using = "//*[contains(@id,'processRefreshId::icon')]")
	public static WebElement Refresh_button;

public void verify_Refresh_button_Status(String data){
		//Verifies the Status of the Refresh_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Refresh_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Refresh_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Refresh_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Refresh_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Refresh_button(){
		Refresh_button.click();
}

@FindBy(how= How.XPATH, using = "//img[contains(@id,'imglinkid::icon')]")
	public static WebElement Output_button;

public void verify_Output_button_Status(String data){
		//Verifies the Status of the Output_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Output_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Output_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Output_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Output_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Output_button(){
		Output_button.click();
}

@FindBy(how= How.XPATH, using = "//*[contains(@id,'unpExcp')]")
	public static WebElement Exceptions_hyperlink;

public void verify_Exceptions_hyperlink_Status(String data){
		//Verifies the Status of the Exceptions_hyperlink
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Exceptions_hyperlink.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Exceptions_hyperlink.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Exceptions_hyperlink.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Exceptions_hyperlink.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Exceptions_hyperlink(){
		Exceptions_hyperlink.click();
}

@FindBy(how= How.XPATH, using = "//*[contains(@id,'FndTasksList::icon')]")
	public static WebElement Tasks_button;

public void verify_Tasks_button_Status(String data){
		//Verifies the Status of the Tasks_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Tasks_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Tasks_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Tasks_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Tasks_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Tasks_button(){
		Tasks_button.click();
}

@FindBy(how= How.XPATH, using = "//*[contains(@id,'1:cdLink3')]")
	public static WebElement ExceptionNum_hyperlink;

public void verify_ExceptionNum_hyperlink_Status(String data){
		//Verifies the Status of the ExceptionNum_hyperlink
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(ExceptionNum_hyperlink.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(ExceptionNum_hyperlink.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!ExceptionNum_hyperlink.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!ExceptionNum_hyperlink.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_ExceptionNum_hyperlink(){
		ExceptionNum_hyperlink.click();
}

@FindBy(how= How.XPATH, using = "//*[contains(@id,'unpPend')]")
	public static WebElement Pending_hyperlink;

public void verify_Pending_hyperlink_Status(String data){
		//Verifies the Status of the Pending_hyperlink
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Pending_hyperlink.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Pending_hyperlink.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Pending_hyperlink.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Pending_hyperlink.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Pending_hyperlink(){
		Pending_hyperlink.click();
}

@FindBy(how= How.XPATH, using = "//*[contains(@id,'ATt2:0:cdLink3')]")
	public static WebElement UnprocessedTransactions_hyperlink;

public void verify_UnprocessedTransactions_hyperlink_Status(String data){
		//Verifies the Status of the UnprocessedTransactions_hyperlink
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(UnprocessedTransactions_hyperlink.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(UnprocessedTransactions_hyperlink.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!UnprocessedTransactions_hyperlink.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!UnprocessedTransactions_hyperlink.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_UnprocessedTransactions_hyperlink(){
		UnprocessedTransactions_hyperlink.click();
}

public static void verify_Text(String data){
	Assert.assertTrue(driver.getPageSource().contains(data));
}
}