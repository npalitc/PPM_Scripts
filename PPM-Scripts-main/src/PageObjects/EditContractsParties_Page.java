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
public class EditContractsParties_Page extends PageObjectBase{
@FindBy(how= How.ID, using = "AddContact_button")
	public static WebElement AddContact_button;

public void verify_AddContact_button_Status(String data){
		//Verifies the Status of the AddContact_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(AddContact_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(AddContact_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!AddContact_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!AddContact_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_AddContact_button(){
		AddContact_button.click();
}

@FindBy(how= How.ID, using = "Role_dropdown")
	public static WebElement Role_dropdown;

public void verify_Role_dropdown(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Role_dropdown.getAttribute("value"),data);
	}

}

public void verify_Role_dropdown_Status(String data){
		//Verifies the Status of the Role_dropdown
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Role_dropdown.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Role_dropdown.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Role_dropdown.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Role_dropdown.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_Role_dropdown(String data){
		Select dropdown= new Select(Role_dropdown);
		 dropdown.selectByVisibleText(data);
}

@FindBy(how= How.ID, using = "Name_textbox")
	public static WebElement Name_textbox;

public void verify_Name_textbox(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Name_textbox.getAttribute("value"),data);
	}

}

public void verify_Name_textbox_Status(String data){
		//Verifies the Status of the Name_textbox
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Name_textbox.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Name_textbox.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Name_textbox.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Name_textbox.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_Name_textbox(String data){
		Name_textbox.clear();
		Name_textbox.sendKeys(data);
}

@FindBy(how= How.ID, using = "Email_textbox")
	public static WebElement Email_textbox;

public void verify_Email_textbox(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Email_textbox.getAttribute("value"),data);
	}

}

public void verify_Email_textbox_Status(String data){
		//Verifies the Status of the Email_textbox
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Email_textbox.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Email_textbox.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Email_textbox.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Email_textbox.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_Email_textbox(String data){
		Email_textbox.clear();
		Email_textbox.sendKeys(data);
}

@FindBy(how= How.ID, using = "Owner_checkbox")
	public static WebElement Owner_checkbox;

public void verify_Owner_checkbox(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Owner_checkbox.getAttribute("value"),data);
	}

}

public void verify_Owner_checkbox_Status(String data){
		//Verifies the Status of the Owner_checkbox
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Owner_checkbox.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Owner_checkbox.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Owner_checkbox.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Owner_checkbox.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_Owner_checkbox(String data){
		if(Owner_checkbox.isSelected());
			Owner_checkbox.click();
}

@FindBy(how= How.ID, using = "Access_dropdown")
	public static WebElement Access_dropdown;

public void verify_Access_dropdown(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Access_dropdown.getAttribute("value"),data);
	}

}

public void verify_Access_dropdown_Status(String data){
		//Verifies the Status of the Access_dropdown
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Access_dropdown.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Access_dropdown.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Access_dropdown.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Access_dropdown.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_Access_dropdown(String data){
		Select dropdown= new Select(Access_dropdown);
		 dropdown.selectByVisibleText(data);
}

@FindBy(how= How.ID, using = "BilltoAccountNumber_textbox")
	public static WebElement BilltoAccountNumber_textbox;

public void verify_BilltoAccountNumber_textbox(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(BilltoAccountNumber_textbox.getAttribute("value"),data);
	}

}

public void verify_BilltoAccountNumber_textbox_Status(String data){
		//Verifies the Status of the BilltoAccountNumber_textbox
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(BilltoAccountNumber_textbox.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(BilltoAccountNumber_textbox.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!BilltoAccountNumber_textbox.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!BilltoAccountNumber_textbox.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_BilltoAccountNumber_textbox(String data){
		BilltoAccountNumber_textbox.clear();
		BilltoAccountNumber_textbox.sendKeys(data);
}

@FindBy(how= How.ID, using = "ShiptoAccountNumber_textbox")
	public static WebElement ShiptoAccountNumber_textbox;

public void verify_ShiptoAccountNumber_textbox(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(ShiptoAccountNumber_textbox.getAttribute("value"),data);
	}

}

public void verify_ShiptoAccountNumber_textbox_Status(String data){
		//Verifies the Status of the ShiptoAccountNumber_textbox
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(ShiptoAccountNumber_textbox.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(ShiptoAccountNumber_textbox.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!ShiptoAccountNumber_textbox.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!ShiptoAccountNumber_textbox.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_ShiptoAccountNumber_textbox(String data){
		ShiptoAccountNumber_textbox.clear();
		ShiptoAccountNumber_textbox.sendKeys(data);
}

@FindBy(how= How.ID, using = "ShipToSite_textbox")
	public static WebElement ShipToSite_textbox;

public void verify_ShipToSite_textbox(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(ShipToSite_textbox.getAttribute("value"),data);
	}

}

public void verify_ShipToSite_textbox_Status(String data){
		//Verifies the Status of the ShipToSite_textbox
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(ShipToSite_textbox.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(ShipToSite_textbox.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!ShipToSite_textbox.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!ShipToSite_textbox.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_ShipToSite_textbox(String data){
		ShipToSite_textbox.clear();
		ShipToSite_textbox.sendKeys(data);
}

@FindBy(how= How.ID, using = "Contract_Administrator_textbox")
	public static WebElement Contract_Administrator_textbox;

public void verify_Contract_Administrator_textbox(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Contract_Administrator_textbox.getAttribute("value"),data);
	}

}

public void verify_Contract_Administrator_textbox_Status(String data){
		//Verifies the Status of the Contract_Administrator_textbox
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Contract_Administrator_textbox.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Contract_Administrator_textbox.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Contract_Administrator_textbox.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Contract_Administrator_textbox.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_Contract_Administrator_textbox(String data){
		Contract_Administrator_textbox.clear();
		Contract_Administrator_textbox.sendKeys(data);
}

@FindBy(how= How.ID, using = "Resource_Organisation_textbox")
	public static WebElement Resource_Organisation_textbox;

public void verify_Resource_Organisation_textbox(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Resource_Organisation_textbox.getAttribute("value"),data);
	}

}

public void verify_Resource_Organisation_textbox_Status(String data){
		//Verifies the Status of the Resource_Organisation_textbox
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Resource_Organisation_textbox.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Resource_Organisation_textbox.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Resource_Organisation_textbox.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Resource_Organisation_textbox.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_Resource_Organisation_textbox(String data){
		Resource_Organisation_textbox.clear();
		Resource_Organisation_textbox.sendKeys(data);
}

public static void verify_Text(String data){
	Assert.assertTrue(driver.getPageSource().contains(data));
}
}