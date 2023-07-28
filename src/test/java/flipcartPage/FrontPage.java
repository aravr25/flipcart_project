package flipcartPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FrontPage {
	

	@FindBy(xpath = "//input[@id='inputValEnter']")
	WebElement srawani;
	@FindBy(xpath = "//span[@class='searchTextSpan']")
	WebElement clickSearchBtn;
	
	public void search(String keys) {
		
		srawani.sendKeys(keys);
		clickSearchBtn.click();
		
		
	}

}
