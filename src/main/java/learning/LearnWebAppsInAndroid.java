package learning;

import org.testng.annotations.Test;

import wrappers.GenericWrappers;

public class LearnWebAppsInAndroid extends GenericWrappers {
	@Test
	public void runCode() {
		launchChromeBrowser("dsfdsf", "https://www.google.com");
		enterValue(getWebElement(Locators.NAME.toString(), "q"), "Lokesh");
		printContext();
		// pressEnter();
		switchToAnotherApp("com.testleaf.leaforg");
		sleep(5000);
		switchNativeview();
		printContext();
		// switchContext("WEBVIEW_com.testleaf.leaforg");
		enterValue(getWebElement(Locators.XPATH.toString(),
				"(//android.view.View[@text='Login Or Create Your New Account']/following-sibling::android.view.View/android.widget.EditText)[1]"),
				"rajkumar@testleaf.com");
		enterValue(getWebElement(Locators.XPATH.toString(),
				"(//android.view.View[@text='Login Or Create Your New Account']/following-sibling::android.view.View/android.widget.EditText)[2]"),
				"Leaf@123");
		click(getWebElement(Locators.XPATH.toString(), "//android.widget.Button"));
		closeApp();

	}

}
