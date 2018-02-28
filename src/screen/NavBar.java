package screen;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class NavBar extends AbstractScreen {

	public NavBar(AppiumDriver driver) {super(driver);}

	//Elements
	private WebElement btnHome = driver.findElement(By.xpath("(//android.widget.ImageView[@content-desc=\"icon\"])[1]"));
	private WebElement btnGoals = driver.findElement(By.xpath("(//android.widget.ImageView[@content-desc=\"icon\"])[2]"));
	private WebElement btnImpressions = driver.findElement(By.xpath("(//android.widget.ImageView[@content-desc=\"icon\"])[3]"));
	private WebElement btnMore = driver.findElement(By.xpath("(//android.widget.ImageView[@content-desc=\"icon\"])[4]"));

	//Methods
	public void NavToHome() {
		btnHome.click();
	}

	public boolean HomePageIsDisplayed() {
		return driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView")).isDisplayed();
	}

	public void NavToGoals() {
		btnGoals.click();
	}

	public boolean GoalsPageIsDisplayed() {
		return driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView")).isDisplayed();
	}

	public void NavToImpressions() {
		btnImpressions.click();
	}

	public boolean ImpressionsPageIsDisplayed() {
		return driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView")).isDisplayed();
	}

	public void NavToMore() {
		btnMore.click();
	}

	public boolean MorePageIsDisplayed() {
		return driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView")).isDisplayed();
	}
}
