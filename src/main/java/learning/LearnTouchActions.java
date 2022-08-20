package learning;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.PointerInput.Kind;
import org.openqa.selenium.interactions.PointerInput.MouseButton;
import org.openqa.selenium.interactions.PointerInput.Origin;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.appium.java_client.MultiTouchAction;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class LearnTouchActions {
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		DesiredCapabilities dc = new DesiredCapabilities();
		//dc.setCapability("platformName", "Android");
		dc.setCapability("deviceName", "dgdfgdfg");
		dc.setCapability("appPackage", "com.the511plus.MultiTouchTester");
		dc.setCapability("appActivity", "com.the511plus.MultiTouchTester.MultiTouchTester");
		dc.setCapability("noReset", true);

		AndroidDriver driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), dc);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Dimension size = driver.manage().window().getSize();
		int maxX = size.width;
		int maxY = size.height;
		// Swipe up
		new TouchAction(driver).press(PointOption.point((int) (maxX * 0.5), (int) (maxY * 0.8)))
				.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
				.moveTo(PointOption.point((int) (maxX * 0.5), (int) (maxY * 0.2))).release().perform();
		// Swipe down
		new TouchAction(driver).press(PointOption.point((int) (maxX * 0.5), (int) (maxY * 0.2)))
				.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
				.moveTo(PointOption.point((int) (maxX * 0.5), (int) (maxY * 0.8))).release().perform();
		// Swipe left
		new TouchAction(driver).press(PointOption.point((int) (maxX * 0.8), (int) (maxY * 0.5)))
				.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
				.moveTo(PointOption.point((int) (maxX * 0.2), (int) (maxY * 0.5))).release().perform();
		// Swipe right
		new TouchAction(driver).press(PointOption.point((int) (maxX * 0.2), (int) (maxY * 0.5)))
				.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
				.moveTo(PointOption.point((int) (maxX * 0.8), (int) (maxY * 0.5))).release().perform();

		// Perform Touch action with multiple fingers
		new MultiTouchAction(driver)
				.add(new TouchAction(driver).press(PointOption.point((int) (maxX * 0.5), (int) (maxY * 0.8)))
						.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
						.moveTo(PointOption.point((int) (maxX * 0.5), (int) (maxY * 0.2))).release())
				.add(new TouchAction(driver).press(PointOption.point((int) (maxX * 0.5), (int) (maxY * 0.2)))
						.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
						.moveTo(PointOption.point((int) (maxX * 0.5), (int) (maxY * 0.8))).release())
				.perform();
		// driver.quit();
	}
}
