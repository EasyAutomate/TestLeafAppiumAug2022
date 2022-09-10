package learning;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;
import wrappers.GenericWrappers;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class LearnHybridAppInIos extends GenericWrappers {

	@Test
	public void runScript(){
		//For Simulator
		launchIosApp("iPhone 13 Pro Max","","","com.example.apple-samplecode.UICatalog","/apks/UICatalog.zip");
		//For Real Device
		//launchIosApp("iPhone","<udid>","","com.example.apple-samplecode.UICatalog","");
		swipeUpinAppUntilElementIsVisible(Locators.ACCESSIBILITY_ID.toString(),"Web View");
		click(getWebElement(Locators.ACCESSIBILITY_ID.toString(),"Web View"));
		sleep(5000);
		printContext();
		switchWebview();
		System.out.println(driver.getPageSource());
		click(getWebElement(Locators.XPATH.toString(),"//span[text()='Global Nav Open Menu']/.." ));
		click(getWebElement(Locators.XPATH.toString(), "//span[text()='Mac']/.."));
		closeApp();
	}
}
