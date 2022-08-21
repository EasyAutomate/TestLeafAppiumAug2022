package learning;

import org.testng.annotations.Test;

import wrappers.GenericWrappers;
import wrappers.CommonNativeWrappers.Locators;

public class LearnHybridAppWithDualWebViewInAndroid extends GenericWrappers {

	@Test
	public void runCode() {
		launchAndroidApp("emulator", "", "", "", "\\apks\\TheApp-v1.10.0.apk");
		sleep(5000);
		click(getWebElement(Locators.XPATH.toString(), "//*[contains(@text,'Dual Webview Demo')]"));
		printContext();
		switchContext("WEBVIEW_io.cloudgrey.the_app");
		switchToFirstWindow();
		System.out.println(getText(getWebElement(Locators.TAG_NAME.toString(), "h2")));
		switchToLastWindow();
		System.out.println(getText(getWebElement(Locators.TAG_NAME.toString(), "h2")));

	}

}
