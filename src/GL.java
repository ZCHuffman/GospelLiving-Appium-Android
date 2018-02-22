import io.appium.java_client.AppiumDriver;
import io.appium.java_client.Setting;
import io.appium.java_client.TouchAction;
import screen.*;

public class GL {

	private final AppiumDriver driver;

	public GL(AppiumDriver driver) {
		this.driver = driver;
	}

	public NavBar navBar() {
		return new NavBar(driver);
	}

}