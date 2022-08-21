package learning;

import org.testng.annotations.Test;

import wrappers.GenericWrappers;

public class LearnHybridAppInAndroid extends GenericWrappers {
	@Test
	public void runCode() {
		launchAndroidApp("emulator", "com.testleaf.leaforg", "com.testleaf.leaforg.MainActivity", "", "");
		printContext();
		switchContext("WEBVIEW_com.testleaf.leaforg");
		enterValue(getWebElement(Locators.XPATH.toString(), "//input[@placeholder='Email']"), "rajkumar@testleaf.com");
		enterValue(getWebElement(Locators.XPATH.toString(), "//input[@placeholder='Password']"), "Leaf@123");
		click(getWebElement(Locators.XPATH.toString(), "//span[text()='Login']"));
		closeApp();
	}
}
