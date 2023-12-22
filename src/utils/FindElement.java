package utils;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import scripts.Globals;

public abstract class FindElement {
	private static List<WebElement> elemList;
	private static WebElement element;
	private static int waitDuration = 10;
	private static WebDriverWait wait;
	
	public static WebElement btn_byXpath(WebDriver webDrvr, String xpathStr) {
		wait = new WebDriverWait(webDrvr, Duration.ofSeconds(Globals.timeout_10s));
		element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpathStr)));
		
		//checkIfDisplayed
		if (Verify.ifDisplayed(element)) {
			return element;
		} else {
			Verify.printErrorElemNotFound(xpathStr);
			return null;
		}
	}
	
	public static WebElement btn_byText (WebDriver webDrvr, String expectedString) {
		wait = new WebDriverWait(webDrvr, Duration.ofSeconds(Globals.timeout_10s));
		element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[contains(text(), '" + expectedString + "')]")));
		
		//checkIfDisplayed
		if (Verify.ifDisplayed(element)) {
			return element;
		} else {
			Verify.printErrorElemNotFound(expectedString);
			return null;
		}
	}
	
	public static WebElement btn_byID(WebDriver webDrvr, String expectedString) {
		wait = new WebDriverWait(webDrvr, Duration.ofSeconds(Globals.timeout_10s));
		element = wait.until(ExpectedConditions.elementToBeClickable(By.id('"' + expectedString + '"')));
				
		//checkIfDisplayed
		if (Verify.ifDisplayed(element)) {
			return element;
		} else {
			Verify.printErrorElemNotFound(expectedString);
			return null;
		}
	}
	
	public static WebElement btn_byClassName(WebDriver webDrvr, String expectedString) {
		wait = new WebDriverWait(webDrvr, Duration.ofSeconds(Globals.timeout_10s));
		element = wait.until(ExpectedConditions.elementToBeClickable(By.className(expectedString)));
		
		//checkIfDisplayed
		if (Verify.ifDisplayed(element)) {
			return element;
		} else {
			Verify.printErrorElemNotFound(expectedString);
			return null;
		}
	}
	
	public static WebElement btn_byCssSelector(WebDriver webDrvr, String expectedString) {
		wait = new WebDriverWait(webDrvr, Duration.ofSeconds(Globals.timeout_10s));
		element = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(expectedString)));
		
		//checkIfDisplayed
		if (Verify.ifDisplayed(element)) {
			return element;
		} else {
			Verify.printErrorElemNotFound(expectedString);
			return null;
		}
	}
	
	
	///////////////////////////
	
	public static WebElement byXpath(WebDriver webDrvr, String xpathStr) {
		wait = new WebDriverWait(webDrvr, Duration.ofSeconds(Globals.timeout_10s));
		element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpathStr)));
		
		//checkIfDisplayed
		if (Verify.ifDisplayed(element)) {
			return element;
		} else {
			Verify.printErrorElemNotFound(xpathStr);
			return null;
		}
	}
	
	public static WebElement byText (WebDriver webDrvr, String expectedString) {
		wait = new WebDriverWait(webDrvr, Duration.ofSeconds(Globals.timeout_10s));
		element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[contains(text(), '" + expectedString + "')]")));
		
		//checkIfDisplayed
		if (Verify.ifDisplayed(element)) {
			return element;
		} else {
			Verify.printErrorElemNotFound(expectedString);
			return null;
		}
	}
	
	public static WebElement byID(WebDriver webDrvr, String expectedString) {
		wait = new WebDriverWait(webDrvr, Duration.ofSeconds(Globals.timeout_10s));
		element = wait.until(ExpectedConditions.presenceOfElementLocated(By.id('"' + expectedString + '"')));
				
		//checkIfDisplayed
		if (Verify.ifDisplayed(element)) {
			return element;
		} else {
			Verify.printErrorElemNotFound(expectedString);
			return null;
		}
	}
	
	public static WebElement byClassName(WebDriver webDrvr, String expectedString) {
		wait = new WebDriverWait(webDrvr, Duration.ofSeconds(Globals.timeout_10s));
		element = wait.until(ExpectedConditions.presenceOfElementLocated(By.className(expectedString)));
		
		//checkIfDisplayed
		if (Verify.ifDisplayed(element)) {
			return element;
		} else {
			Verify.printErrorElemNotFound(expectedString);
			return null;
		}
	}
	
	public static WebElement byCssSelector(WebDriver webDrvr, String expectedString) {
		wait = new WebDriverWait(webDrvr, Duration.ofSeconds(Globals.timeout_10s));
		element = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(expectedString)));
		
		//checkIfDisplayed
		if (Verify.ifDisplayed(element)) {
			return element;
		} else {
			Verify.printErrorElemNotFound(expectedString);
			return null;
		}
	}



}
