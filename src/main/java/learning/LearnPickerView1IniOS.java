package learning;

import org.testng.annotations.Test;
import wrappers.GenericWrappers;

public class LearnPickerView1IniOS extends GenericWrappers {
	@Test
	public void runCode() {
		launchIosApp("iPhone 13 Pro Max","","","com.example.apple-samplecode.UICatalog","/apks/UICatalog.zip");
		click(getWebElement(Locators.ACCESSIBILITY_ID.toString(), "Date Picker"));
		click(getWebElement(Locators.XPATH.toString(), "(//XCUIElementTypeButton)[last()]"));
		chooseNextOptionInPickerWheel(getWebElement(Locators.XPATH.toString(), "(//XCUIElementTypePickerWheel)[1]"));
		chooseNextOptionInPickerWheel(getWebElement(Locators.XPATH.toString(), "(//XCUIElementTypePickerWheel)[1]"));
		choosePreviousOptionInPickerWheel(getWebElement(Locators.XPATH.toString(), "(//XCUIElementTypePickerWheel)[2]"));
		choosePreviousOptionInPickerWheel(getWebElement(Locators.XPATH.toString(), "(//XCUIElementTypePickerWheel)[2]"));
		//choosePreviousOptionInPickerWheel(getWebElement(Locators.XPATH.toString(), "(//XCUIElementTypePickerWheel)[3]"));

		closeApp();

	}

}
