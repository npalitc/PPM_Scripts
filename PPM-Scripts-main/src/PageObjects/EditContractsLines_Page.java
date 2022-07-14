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
public class EditContractsLines_Page extends PageObjectBase{
@FindBy(how= How.ID, using = "TableRowSelect_button")
	public static WebElement TableRowSelect_button;

public void verify_TableRowSelect_button_Status(String data){
		//Verifies the Status of the TableRowSelect_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(TableRowSelect_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(TableRowSelect_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!TableRowSelect_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!TableRowSelect_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_TableRowSelect_button(){
		TableRowSelect_button.click();
}

@FindBy(how= How.ID, using = "Dummy_textbox")
	public static WebElement Dummy_textbox;

public void verify_Dummy_textbox(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Dummy_textbox.getAttribute("value"),data);
	}

}

public void verify_Dummy_textbox_Status(String data){
		//Verifies the Status of the Dummy_textbox
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Dummy_textbox.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Dummy_textbox.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Dummy_textbox.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Dummy_textbox.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_Dummy_textbox(String data){
		Dummy_textbox.clear();
		Dummy_textbox.sendKeys(data);
}

@FindBy(how= How.XPATH, using = "//*[@id=\"_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:2:pt1:pt_r1:0:HomeApplicationPanel:pt_r8:0:pldFlow:0:sdi1::disAcr\"]")
	public static WebElement editcontractslinesdetailsOverview_hyperlink;

public void verify_editcontractslinesdetailsOverview_hyperlink_Status(String data){
		//Verifies the Status of the editcontractslinesdetailsOverview_hyperlink
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(editcontractslinesdetailsOverview_hyperlink.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(editcontractslinesdetailsOverview_hyperlink.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!editcontractslinesdetailsOverview_hyperlink.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!editcontractslinesdetailsOverview_hyperlink.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_editcontractslinesdetailsOverview_hyperlink(){
		editcontractslinesdetailsOverview_hyperlink.click();
}

@FindBy(how= How.XPATH, using = "//*[@id=\"_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:2:pt1:pt_r1:0:HomeApplicationPanel:pt_r8:0:pldFlow:0:sdi3::disAcr\"]")
	public static WebElement editcontractslinesdetailsBilling_hyperlink;

public void verify_editcontractslinesdetailsBilling_hyperlink_Status(String data){
		//Verifies the Status of the editcontractslinesdetailsBilling_hyperlink
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(editcontractslinesdetailsBilling_hyperlink.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(editcontractslinesdetailsBilling_hyperlink.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!editcontractslinesdetailsBilling_hyperlink.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!editcontractslinesdetailsBilling_hyperlink.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_editcontractslinesdetailsBilling_hyperlink(){
		editcontractslinesdetailsBilling_hyperlink.click();
}

@FindBy(how= How.XPATH, using = "//*[@id=\"_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:2:pt1:pt_r1:0:HomeApplicationPanel:pt_r8:0:pldFlow:0:sdi2::disAcr\"]")
	public static WebElement editcontractslinesdetailsAssociatedProjects_hyperlink;

public void verify_editcontractslinesdetailsAssociatedProjects_hyperlink_Status(String data){
		//Verifies the Status of the editcontractslinesdetailsAssociatedProjects_hyperlink
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(editcontractslinesdetailsAssociatedProjects_hyperlink.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(editcontractslinesdetailsAssociatedProjects_hyperlink.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!editcontractslinesdetailsAssociatedProjects_hyperlink.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!editcontractslinesdetailsAssociatedProjects_hyperlink.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_editcontractslinesdetailsAssociatedProjects_hyperlink(){
		editcontractslinesdetailsAssociatedProjects_hyperlink.click();
}

public static void verify_Text(String data){
	Assert.assertTrue(driver.getPageSource().contains(data));
}
}