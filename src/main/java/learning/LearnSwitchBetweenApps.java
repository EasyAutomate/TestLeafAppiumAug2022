package learning;

import org.testng.annotations.Test;

import wrappers.GenericWrappers;

public class LearnSwitchBetweenApps extends GenericWrappers{
	@Test
	public void runCode() {
		launchAndroidApp("emulator", "com.android.vending", "com.android.vending.AssetBrowserActivity", "", "");
		swipeLeftinAppWithWebElement(getWebElement(Locators.ID.toString(), "com.android.vending:id/screenshots_carousel"));
		//switchToAnotherApp("com.testleaf.leaforg");
		startAnAppUsingActivity("com.testleaf.leaforg", "com.testleaf.leaforg.MainActivity");
		click(getWebElement(Locators.XPATH.toString(), "//android.widget.Button"));
		//stopRunningApp("com.testleaf.leaforg");
		switchToAnotherApp("com.android.vending");
		closeApp();
	}
}
