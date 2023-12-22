package scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import pages.Homepage;
import pages.LoginPage;

public class TC001_UserSignUp {
	public static WebDriver driver;
	
	public static void main(String[] args) throws Exception {		
		
		String driverPath = "C:\\Users\\eunice.d.enaje\\Desktop\\EclipseWorkspace2023\\SeleniumRefresher\\driver"
		System.setProperty("webdriver.chrome.driver", driverPath);
		EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("-inprivate");
		driver = new EdgeDriver(edgeOptions);
		
		driver.get("https://www.demoblaze.com/");
		driver.manage().window().maximize();
		
		//code here		
	}
	

}
