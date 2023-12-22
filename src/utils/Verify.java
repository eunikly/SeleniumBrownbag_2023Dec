package utils;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class Verify {

	private static List<WebElement> elemList;
	private static WebElement element;
	private static WebDriverWait wait;
	private static int waitDuration = 10;

	public static Boolean ifDisplayed(WebElement element) {
		if (element.isDisplayed()) {
			return true;
		} else {
			return false;
		}

	}

	public static Boolean ifEnabledBoolean(WebElement element) {
		if (element.isEnabled()) {
			return true;
		} else {
			return false;
		}

	}

	public static void printErrorElemNotFound(String locator) {
		System.out.println("Element not found. Used locator: " + locator);
	}

}
