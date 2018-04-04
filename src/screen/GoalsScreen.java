package screen;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class GoalsScreen extends AbstractScreen{

	public GoalsScreen(AppiumDriver driver) {super(driver);}

	//Elements
	private static final int ALL = 0;
	private static final int SPIRITUAL = 1;
	private static final int SOCIAL = 2;
	private static final int PHYSICAL = 3;
	private static final int INTELLECTUAL = 4;
	private List<WebElement> goalEmphasises = driver.findElements(By.className("android.support.v7.app.ActionBar$Tab"));
	private WebElement allTab = goalEmphasises.get(ALL);
	private WebElement spiritualTab = goalEmphasises.get(SPIRITUAL);
	private WebElement socialTab = goalEmphasises.get(SOCIAL);
	private WebElement physicalTab = goalEmphasises.get(PHYSICAL);
	private WebElement intellectualTab = goalEmphasises.get(INTELLECTUAL);

	//Methods
	private WebElement getGivenGoal(String goalText) {
		return driver.findElement(By.xpath("//android.widget.TextView[@text=\"" + goalText + "\"]"));
	}

	public boolean givenGoalIsDisplayed(String goalText) {
		try {
			return getGivenGoal(goalText).isDisplayed();
		}
		catch (Exception e){
			return false;
		}
	}

	public void tapGivenGoal(String goalText) {
		getGivenGoal(goalText).click();
	}

	public void tapAllTab() {
		allTab.click();
	}

	public void tapSpiritualTab() {
		spiritualTab.click();
	}

	public void tapSocialTab() {
		socialTab.click();
	}

	public void tapPhysicalTab() {
		physicalTab.click();
	}

	public void tapIntellectualTab() {
		intellectualTab.click();
	}

	public WebElement getNoGoalsIcon() {
		return driver.findElement(By.id("emptyStateImageView"));
	}

	public Boolean noGoalsIconIsDisplayed() {
		tapAllTab();
		return getNoGoalsIcon().isDisplayed();
	}

	public Boolean noSpiritualGoalsIconIsdisplayed() {
		tapSpiritualTab();
		return getNoGoalsIcon().isDisplayed();
	}

	public Boolean noSocialGoalsIconIsdisplayed() {
		tapSocialTab();
		return getNoGoalsIcon().isDisplayed();
	}

	public Boolean noPhysicalGoalsIconIsdisplayed() {
		tapPhysicalTab();
		return getNoGoalsIcon().isDisplayed();
	}

	public Boolean noIntellectualGoalsIconIsdisplayed() {
		tapIntellectualTab();
		return getNoGoalsIcon().isDisplayed();
	}



}
