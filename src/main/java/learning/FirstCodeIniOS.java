package learning;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class FirstCodeIniOS {
	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability("platformName", "iOS");
		dc.setCapability("deviceName", "iPhone 13 Pro Max");
		//dc.setCapability("app", System.getProperty("user.dir") + "/apks/UICatalog.zip");
		dc.setCapability("automationName", "XCUITest");
		dc.setCapability("bundleId","com.example.apple-samplecode.UICatalog");
		//dc.setCapability("udid","<udid>");
		RemoteWebDriver driver = new RemoteWebDriver(new URL("http://0.0.0.0:4723/wd/hub"), dc);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(AppiumBy.accessibilityId("Action Sheets")).click();
		driver.findElement(AppiumBy.accessibilityId("Okay / Cancel")).click();
		driver.findElement(AppiumBy.accessibilityId("OK")).click();
		driver.quit();

	}
}
