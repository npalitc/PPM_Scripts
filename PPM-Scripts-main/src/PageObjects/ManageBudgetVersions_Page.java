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
public class ManageBudgetVersions_Page extends PageObjectBase{
@FindBy(how= How.XPATH, using = "//a[contains(@id,'commandLink1')]")
	public static WebElement VersionName_hyperlink;

public void verify_VersionName_hyperlink_Status(String data){
		//Verifies the Status of the VersionName_hyperlink
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(VersionName_hyperlink.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(VersionName_hyperlink.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!VersionName_hyperlink.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!VersionName_hyperlink.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_VersionName_hyperlink(){
		VersionName_hyperlink.click();
}

public static void verify_Text(String data){
	Assert.assertTrue(driver.getPageSource().contains(data));
}
}