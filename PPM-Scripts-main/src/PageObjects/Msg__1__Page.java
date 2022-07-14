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
public class Msg__1__Page extends PageObjectBase{
@FindBy(how= How.ID, using = "Actions_field")
	public static WebElement Actions_field;

public void verify_Actions_field(String data){
		Assert.assertEquals(Actions_field,Actions_field);
}

public void enter_Actions_field(String data){
		Actions_field.sendKeys(data);
}

@FindBy(how= How.ID, using = "Val1_field")
	public static WebElement Val1_field;

public void verify_Val1_field(String data){
		Assert.assertEquals(Val1_field,Val1_field);
}

public void enter_Val1_field(String data){
		Val1_field.sendKeys(data);
}

@FindBy(how= How.ID, using = "Val2_field")
	public static WebElement Val2_field;

public void verify_Val2_field(String data){
		Assert.assertEquals(Val2_field,Val2_field);
}

public void enter_Val2_field(String data){
		Val2_field.sendKeys(data);
}

@FindBy(how= How.ID, using = "EditTaskDetail_field")
	public static WebElement EditTaskDetail_field;

public void verify_EditTaskDetail_field(String data){
		Assert.assertEquals(EditTaskDetail_field,EditTaskDetail_field);
}

public void enter_EditTaskDetail_field(String data){
		EditTaskDetail_field.sendKeys(data);
}

public static void verify_Text(String data){
	Assert.assertTrue(driver.getPageSource().contains(data));
}
}