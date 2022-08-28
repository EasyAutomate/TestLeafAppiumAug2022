package learning;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class FirstCodeIniOSInSauceLabs {
	public static void main(String[] args) throws MalformedURLException {

		MutableCapabilities caps = new MutableCapabilities();
		caps.setCapability("platformName", "iOS");
		caps.setCapability("appium:app", "storage:filename=UICatalog.zip"); // The filename of the mobile app
		caps.setCapability("appium:deviceName", "iPhone 13 Pro Max Simulator");
		caps.setCapability("appium:platformVersion", "15.4");
		MutableCapabilities sauceOptions = new MutableCapabilities();
		sauceOptions.setCapability("appiumVersion", "1.22.3");
		sauceOptions.setCapability("build", "Test 1");
		sauceOptions.setCapability("name", "First script");
		caps.setCapability("sauce:options", sauceOptions);
		URL url = new URL("https://appiumaug2022:7b1a911e-bc62-4347-b7b9-ae466c3fa7f4@ondemand.us-west-1.saucelabs.com:443/wd/hub");
		IOSDriver driver = new IOSDriver(url, caps);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(AppiumBy.accessibilityId("Action Sheets")).click();
		driver.findElement(AppiumBy.accessibilityId("Okay / Cancel")).click();
		driver.findElement(AppiumBy.accessibilityId("OK")).click();
		driver.quit();

	}
}
