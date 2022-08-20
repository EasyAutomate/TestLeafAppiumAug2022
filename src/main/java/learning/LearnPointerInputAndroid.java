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

public class LearnPointerInputAndroid {
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability("platformName", "Android");
		dc.setCapability("deviceName", "dgdfgdfg");
		dc.setCapability("appPackage", "com.the511plus.MultiTouchTester");
		dc.setCapability("appActivity", "com.the511plus.MultiTouchTester.MultiTouchTester");
		dc.setCapability("noReset", true);

		RemoteWebDriver driver = new RemoteWebDriver(new URL("http://0.0.0.0:4723/wd/hub"), dc);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Dimension size = driver.manage().window().getSize();
		int maxX = size.width;
		int maxY = size.height;
		// Swipe up
		PointerInput finger = new PointerInput(Kind.TOUCH, "index finger");
		Sequence seq = new Sequence(finger, 1);
		seq.addAction(
				finger.createPointerMove(Duration.ZERO, Origin.viewport(), (int) (maxX * 0.5), (int) (maxY * 0.8)));
		seq.addAction(finger.createPointerDown(MouseButton.LEFT.asArg()));
		seq.addAction(finger.createPointerMove(Duration.ofMillis(2000), Origin.viewport(), (int) (maxX * 0.5),
				(int) (maxY * 0.2)));
		seq.addAction(finger.createPointerUp(MouseButton.LEFT.asArg()));
		driver.perform(Arrays.asList(seq));
		Thread.sleep(2000);
		// Swipe down
		PointerInput finger1 = new PointerInput(Kind.TOUCH, "index finger1");
		Sequence seq1 = new Sequence(finger1, 1);
		seq1.addAction(
				finger1.createPointerMove(Duration.ZERO, Origin.viewport(), (int) (maxX * 0.5), (int) (maxY * 0.2)));
		seq1.addAction(finger1.createPointerDown(MouseButton.LEFT.asArg()));
		seq1.addAction(finger1.createPointerMove(Duration.ofMillis(2000), Origin.viewport(), (int) (maxX * 0.5),
				(int) (maxY * 0.8)));
		seq1.addAction(finger1.createPointerUp(MouseButton.LEFT.asArg()));
		driver.perform(Arrays.asList(seq1));
		Thread.sleep(2000);
		// Swipe left
		PointerInput finger2 = new PointerInput(Kind.TOUCH, "index finger2");
		Sequence seq2 = new Sequence(finger2, 1);
		seq2.addAction(
				finger2.createPointerMove(Duration.ZERO, Origin.viewport(), (int) (maxX * 0.8), (int) (maxY * 0.5)));
		seq2.addAction(finger2.createPointerDown(MouseButton.LEFT.asArg()));
		seq2.addAction(finger2.createPointerMove(Duration.ofMillis(2000), Origin.viewport(), (int) (maxX * 0.2),
				(int) (maxY * 0.5)));
		seq2.addAction(finger2.createPointerUp(MouseButton.LEFT.asArg()));
		driver.perform(Arrays.asList(seq2));
		Thread.sleep(2000);
		// Swipe right
		PointerInput finger3 = new PointerInput(Kind.TOUCH, "index finger3");
		Sequence seq3 = new Sequence(finger3, 1);
		seq3.addAction(
				finger3.createPointerMove(Duration.ZERO, Origin.viewport(), (int) (maxX * 0.2), (int) (maxY * 0.5)));
		seq3.addAction(finger3.createPointerDown(MouseButton.LEFT.asArg()));
		seq3.addAction(finger3.createPointerMove(Duration.ofMillis(2000), Origin.viewport(), (int) (maxX * 0.8),
				(int) (maxY * 0.5)));
		seq3.addAction(finger3.createPointerUp(MouseButton.LEFT.asArg()));
		driver.perform(Arrays.asList(seq3));
		Thread.sleep(2000);
		// Pinch
		PointerInput finger4 = new PointerInput(Kind.TOUCH, "index finger4");
		Sequence seq4 = new Sequence(finger4, 1);
		seq4.addAction(
				finger4.createPointerMove(Duration.ZERO, Origin.viewport(), (int) (maxX * 0.75), (int) (maxY * 0.25)));
		seq4.addAction(finger4.createPointerDown(MouseButton.LEFT.asArg()));
		seq4.addAction(finger4.createPointerMove(Duration.ofMillis(2000), Origin.viewport(), (int) (maxX * 0.5),
				(int) (maxY * 0.5)));
		seq4.addAction(finger4.createPointerUp(MouseButton.LEFT.asArg()));
		PointerInput finger5 = new PointerInput(Kind.TOUCH, "index finger3");
		Sequence seq5 = new Sequence(finger5, 1);
		seq5.addAction(
				finger5.createPointerMove(Duration.ZERO, Origin.viewport(), (int) (maxX * 0.25), (int) (maxY * 0.75)));
		seq5.addAction(finger5.createPointerDown(MouseButton.LEFT.asArg()));
		seq5.addAction(finger5.createPointerMove(Duration.ofMillis(2000), Origin.viewport(), (int) (maxX * 0.5),
				(int) (maxY * 0.5)));
		seq5.addAction(finger5.createPointerUp(MouseButton.LEFT.asArg()));
		driver.perform(Arrays.asList(seq4, seq5));
		// driver.quit();
	}
}
