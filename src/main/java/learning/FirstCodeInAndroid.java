package learning;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.appium.java_client.AppiumBy;

public class FirstCodeInAndroid {
	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability("platformName", "Android");
		dc.setCapability("deviceName", "dgdfgdfg");
		dc.setCapability("app", System.getProperty("user.dir")+"\\apks\\leaforg.apk");
		RemoteWebDriver driver = new RemoteWebDriver(new URL("http://0.0.0.0:4723/wd/hub"), dc);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(AppiumBy.xpath(
				"(//android.view.View[@text='Login Or Create Your New Account']/following-sibling::android.view.View/android.widget.EditText)[1]"))
				.sendKeys("rajkumar@testleaf.com");
		driver.findElement(AppiumBy.xpath(
				"(//android.view.View[@text='Login Or Create Your New Account']/following-sibling::android.view.View/android.widget.EditText)[2]"))
				.sendKeys("Leaf@123");
		driver.findElement(AppiumBy.xpath("//android.widget.Button")).click();
		driver.quit();
		

	}
}
