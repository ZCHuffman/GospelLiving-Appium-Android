package screen;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomeScreen extends AbstractScreen{

	public HomeScreen(AppiumDriver driver) {super(driver);}

	//Elements
	private WebElement spiritualGoalsCard = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.GridView/android.widget.FrameLayout[1]/android.widget.LinearLayout[3]"));
	private WebElement socialGoalsCard = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.GridView/android.widget.FrameLayout[2]/android.widget.LinearLayout[3]"));
	private WebElement physicalGoalsCard = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.GridView/android.widget.FrameLayout[3]/android.widget.LinearLayout[3]"));
	private WebElement intellectualGoalsCard = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.GridView/android.widget.FrameLayout[4]/android.widget.LinearLayout[3]"));


	//Methods
	public boolean spiritualGoalCardIsDisplayed() {
		return spiritualGoalsCard.isDisplayed();
	}

	public boolean socialGoalCardIsDisplayed() {
		return socialGoalsCard.isDisplayed();
	}

	public boolean physicalGoalCardIsDisplayed() {
		return physicalGoalsCard.isDisplayed();
	}

	public boolean intellectualGoalCardIsDisplayed() {
		return intellectualGoalsCard.isDisplayed();
	}


}