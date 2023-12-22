package baseTest;

import org.openqa.selenium.WebDriver;

import pages.Homepage;
import pages.LoginPage;

public class ValidLogin {

	
	public static void validUserLogin(WebDriver driver) throws Exception {
		String username = "eun12_001";
		String password = "eun12_001"; 
		
		Homepage.reloadHomepage(driver);
		Homepage.clickHeaderLogin(driver);
		LoginPage.inputUserName(driver, username);
		LoginPage.inputPassword(driver, password);
		LoginPage.clickLoginBtn(driver);
		LoginPage.verifyIfUsernameDisplayed(driver, username);
	}

}
