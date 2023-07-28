package driverFactory;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import config.AppUtil;
import flipcartPage.FrontPage;

public class DriveTest extends AppUtil {
	
	
	@Test
	public void startTest() {
		FrontPage front=PageFactory.initElements(driver, FrontPage.class);
		front.search("sport shoe for men");
	}
	

}
