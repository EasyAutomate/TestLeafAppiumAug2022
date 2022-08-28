package learning;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class FirstCodeInAndroidInSauceLabs {
	public static void main(String[] args) throws MalformedURLException {
		MutableCapabilities caps = new MutableCapabilities();
		caps.setCapability("platformName", "Android");
		caps.setCapability("appium:app", "storage:filename=leaforg.apk"); // The filename of the mobile app
		caps.setCapability("appium:deviceName", "Google Pixel 6 Pro GoogleAPI Emulator");
		caps.setCapability("appium:platformVersion", "12.0");
		MutableCapabilities sauceOptions = new MutableCapabilities();
		sauceOptions.setCapability("appiumVersion", "1.22.1");
		sauceOptions.setCapability("build", "Android Execution");
		sauceOptions.setCapability("name", "Android TC Execution");
		caps.setCapability("sauce:options", sauceOptions);
		URL url = new URL("https://appiumaug2022:7b1a911e-bc62-4347-b7b9-ae466c3fa7f4@ondemand.us-west-1.saucelabs.com:443/wd/hub");
		AndroidDriver driver = new AndroidDriver(url, caps);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(AppiumBy.xpath(
				"(//android.widget.TextView[@text='Login Or Create Your New Account']/following-sibling::android.view.View/android.widget.EditText)[1]"))
				.sendKeys("rajkumar@testleaf.com");
		driver.findElement(AppiumBy.xpath(
				"(//android.widget.TextView[@text='Login Or Create Your New Account']/following-sibling::android.view.View/android.widget.EditText)[2]"))
				.sendKeys("Leaf@123");
		driver.findElement(AppiumBy.xpath("//android.widget.Button")).click();
		driver.quit();

	}
}
