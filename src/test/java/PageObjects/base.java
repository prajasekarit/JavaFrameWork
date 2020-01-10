package PageObjects;

import java.io.File;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

@SuppressWarnings("unused")
public class base {

	public WebDriver driver;

	public WebDriver initializeDriver(String browser) throws IOException {
		//TO Run with Parameters from Jenkins
		//String browserName = System.getProperty("browser");	
		String browserName = browser;
		System.out.println(browserName);
		
		
		if (browserName.contains("chrome"))
		{
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "/src/test/resources/TestDataResources//chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			if (browserName.contains("headless")) 
			{
				options.addArguments("--headless");
			}

			driver = new ChromeDriver(options);

		} 
		else if (browserName.equals("firefox")) 
		{
			System.setProperty("webdriver.gecko.driver",
					System.getProperty("user.dir") + "/src/test/resources/TestDataResources//geckodriver.exe");
			driver = new FirefoxDriver();

		} else if (browserName.equals("IE"))
		{

			//System.setProperty("webdriver.ie.driver", "C://chromedriver.exe");
		}

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;

	}

	public void getScreenshot(String result) throws IOException {
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File(System.getProperty("user.dir") + "/src/test/resources/TestDataResources" + result + "screenshot.png"));

	}

}
