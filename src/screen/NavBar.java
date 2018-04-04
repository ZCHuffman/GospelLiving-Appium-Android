package screen;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class NavBar extends AbstractScreen {

	public NavBar(AppiumDriver driver) {super(driver);}

	//Elements
	private static final int HOME = 0;
	private static final int GOALS = 1;
	private static final int IMPRESSION = 2;
	private static final int VIDEO = 3;
	private static final int MORE = 4;
	private static final int MUSIC = 5;
	private static final int ARTICLES = 6;
	private static final int IMAGES = 7;
	private static final int SETTINGS = 8;

	//private static List<WebDriver> menuItems = (WebElement driver) -> driver.findElements(By.className("android.widget.ImageView"));

	private static List<WebElement> menuItems (WebDriver driver){
		return driver.findElement(By.id("bottom_navigation_sheet_recycler")).findElements(By.className("android.widget.ImageView"));
	}

	private static WebElement btnHome(WebDriver driver){
		return menuItems(driver).get(HOME);
	}

	private static WebElement btnGoals(WebDriver driver) {
		return menuItems(driver).get(GOALS);
	}

	private static WebElement btnImpressions(WebDriver driver) {
		return menuItems(driver).get(IMPRESSION);
	}

	private static WebElement btnVideo(WebDriver driver) {
		return menuItems(driver).get(VIDEO);
	}

	private static WebElement btnMore(WebDriver driver) {
		return menuItems(driver).get(MORE);
	}

	private static WebElement btnMusic(WebDriver driver) {
		return menuItems(driver).get(MUSIC);
	}

	private static WebElement btnArticles(WebDriver driver) {
		return menuItems(driver).get(ARTICLES);
	}

	private static WebElement btnImages(WebDriver driver) {
		return menuItems(driver).get(IMAGES);
	}

	private static WebElement btnSettings(WebDriver driver) {
		return menuItems(driver).get(SETTINGS);
	}


	//Methods
	public void NavToHome() {
		btnHome(driver).click();
	}

	public void NavToGoals() {
		btnGoals(driver).click();
	}

	public void NavToImpressions() {
		btnImpressions(driver).click();
	}

	public void NavToVideo() {
		btnVideo(driver).click();
	}

	public void NavToMore() {
		btnMore(driver).click();
	}

	public void NavToMusic() {
		btnMusic(driver).click();
	}

	public void NavToArticles() {
		btnArticles(driver).click();
	}

//	public static boolean HomePageIsDisplayed() {
//
//	}
//
//	public boolean GoalsPageIsDisplayed() {
//
//	}
//
//	public boolean ImpressionsPageIsDisplayed() {
//
//	}
//
//	public boolean MorePageIsDisplayed() {
//
//	}

}
