package learning;

import org.testng.annotations.Test;
import wrappers.GenericWrappers;

public class LearnWebAppsIniOS extends GenericWrappers {
	@Test
	public void runCode() {
		launchSafariBrowser("iPhone 13 Pro Max", "https://www.google.com","");
		enterValue(getWebElement(Locators.NAME.toString(), "q"), "Lokesh");
		clickGivenKeyboardButtonInIosByAccessibilityId("Search");
		closeApp();

	}

}
