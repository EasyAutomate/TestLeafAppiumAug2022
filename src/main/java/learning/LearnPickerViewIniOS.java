package learning;

import org.testng.annotations.Test;
import wrappers.GenericWrappers;

public class LearnPickerViewIniOS extends GenericWrappers {
	@Test
	public void runCode() {
		launchIosApp("iPhone 13 Pro Max","","","com.example.apple-samplecode.UICatalog","/apks/UICatalog.zip");
		click(getWebElement(Locators.ACCESSIBILITY_ID.toString(), "Picker View"));
		enterValue(getWebElement(Locators.ACCESSIBILITY_ID.toString(), "Red color component value"),"80");
		enterValue(getWebElement(Locators.ACCESSIBILITY_ID.toString(), "Green color component value"),"215");
		enterValue(getWebElement(Locators.ACCESSIBILITY_ID.toString(), "Blue color component value"),"130");
		closeApp();

	}

}
