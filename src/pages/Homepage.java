package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import scripts.Globals;
import utils.FindElement;

public class Homepage {
	private static String xpathString;
	private static WebElement elem;
	private static WebDriverWait wait;
	
	public static void clickHeaderHome(WebDriver driver) {
		FindElement.byText(driver, "Home").click();		
	}
	
	public static void clickHeaderContact(WebDriver driver) {
		FindElement.byText(driver, "Contact").click();		
	}
	
	public static void clickHeaderAboutUs(WebDriver driver) {
		xpathString = "//a[contains(text(), 'About us')]";
		FindElement.btn_byXpath(driver, xpathString).click();		
	}
	
	public static void clickHeaderCart(WebDriver driver) {
		xpathString = "//a[@id='cartur']";
		FindElement.btn_byXpath(driver, xpathString).click();		
	}
	
	public static void clickHeaderLogin(WebDriver driver) {
		xpathString = "//a[@id='login2']";
		FindElement.btn_byXpath(driver, xpathString).click();
	}	
	
	public static void clickHeaderSignUp(WebDriver driver) {
		xpathString = "//a[@id='signin2']";
		FindElement.btn_byXpath(driver, xpathString).click();
	}
	
	
	// methods for user sign up
	
	public static void inputUserName_onSignUp(WebDriver driver, String username) throws Exception {
		Thread.sleep(Globals.thinkTime_2s);
		//code here
	}
	
	public static void inputPassword_onSignUp(WebDriver driver, String password) throws Exception {
		
	}
	
	public static void clickSignUpBtn_onSignUp(WebDriver driver) throws Exception {
		
	}
	
	public static void clickOkPopUp_onSignUp(WebDriver driver) throws Exception { 
		Thread.sleep(Globals.thinkTime_10s);
		
	}
	
	
	// other methods for homepage
	
	public static void reloadHomepage(WebDriver driver) throws Exception {
		driver.get(Globals.homepageUrl);
		Thread.sleep(Globals.thinkTime_5s);
	}
	
	

}
