package learning;

import org.testng.annotations.Test;

import wrappers.GenericWrappers;

public class LearnTouchActionWithinWebElement extends GenericWrappers {
	@Test
	public void runCode() {
		launchAndroidApp("emulator", "com.android.vending", "com.android.vending.AssetBrowserActivity", "", "");
		swipeLeftinAppWithWebElement(getWebElement(Locators.ID.toString(), "com.android.vending:id/screenshots_carousel"));
		swipeLeftinAppWithWebElement(getWebElement(Locators.ID.toString(), "com.android.vending:id/cluster_content"));
		closeApp();
	}

}