package screen;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.yaml.snakeyaml.events.Event;

public class EditGoalScreen extends AbstractScreen{

	public EditGoalScreen(AppiumDriver driver) {super(driver);}

	//Elements
	private static WebElement btnCancel(WebDriver driver) {
		return driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.ImageButton"));
	}

	private static WebElement btnSave(WebDriver driver) {
		return driver.findElement(By.id("org.lds.gliv.dev:id/action_done"));
	}

	private static WebElement inputGoalTitle(WebDriver driver) {
		return driver.findElement(By.id("whatEdit"));
	}

	private static WebElement inputWhy(WebDriver driver) {
		return driver.findElement(By.id("whyEdit"));
	}

	private static  WebElement inputHow(WebDriver driver){
		return driver.findElement(By.id("howEdit"));
	}

	private static WebElement btnAddStep(WebDriver driver){
		return driver.findElement(By.id("org.lds.gliv.dev:id/addStepIcon"));
	}

	private static WebElement btnSpiritual(WebDriver driver){
		return driver.findElement(By.id("spiritual_emphasis"));
	}

	private static WebElement btnSocial(WebDriver driver){
		return driver.findElement(By.id("social_emphasis"));
	}

	private static WebElement btnPhysical(WebDriver driver){
		return driver.findElement(By.id("physical_emphasis"));
	}

	private static WebElement btnIntellectual(WebDriver driver){
		return driver.findElement(By.id("intellectual_emphasis"));
	}

	private WebElement btnComplete = new WebDriverWait(driver, 5).until((WebDriver d) -> d.findElement(By.id("completeGoal")));

//	private static WebElement btnComplete(WebDriver driver){
//		return driver.findElement(By.id("completeGoal"));
//	}

	private static WebElement btnConfirmComplete(WebDriver driver){
		return driver.findElement(By.id("md_buttonDefaultPositive"));
	}

	private static WebElement txtGoalCompleted(WebDriver driver){
		return driver.findElement(By.id("keepWorkingText"));
	}

	private static WebElement btnDelete(WebDriver driver){
		return driver.findElement(By.id("deleteGoal"));
	}

	private static WebElement btnConfirmDelete(WebDriver driver){
		return driver.findElement(By.id("md_buttonDefaultPositive"));
	}

//	private WebElement btnAddDate = driver.findElementByAccessibilityId("org.lds.gliv.dev:id/addCheckIn");

	//Methods
	public void tapCancel() {
		btnCancel(driver).click();
	}

	public void tapSave() {
		btnSave(driver).click();
	}

	public void tapSpiritual() {
		btnSpiritual(driver).click();
	}

	public void tapSocial() {
		btnSocial(driver).click();
	}

	public void tapPhysical() {
		btnPhysical(driver).click();
	}

	public void tapIntellectual() {
		btnIntellectual(driver).click();
	}

	public void tapGivenGoalType(String type) {
		type.toLowerCase();
		if (type == "spiritual"){
			tapSpiritual();
		}
		else if (type == "social"){
			tapSocial();
		}
		else if (type == "physical"){
			tapPhysical();
		}
		else{
			tapIntellectual();
		}
	}

	public void enterGoalTitle(String text) {
		inputGoalTitle(driver).clear();
		inputGoalTitle(driver).sendKeys(text);
	}

	public void enterWhy(String text) {
		inputWhy(driver).sendKeys(text);
	}

	public void enterHow(String text) {
		inputHow(driver).sendKeys(text);
	}

	public void tapAddStep() {
		btnAddStep(driver).click();
	}

//	public void tapAddCheckInDate() {
//		btnAddDate.click();
//	}

	public void completeGoal() {
		btnComplete.click();
		btnConfirmComplete(driver).click();
	}

	public Boolean goalCompletedText() {
		return txtGoalCompleted(driver).isDisplayed();
	}

	public void deleteGoal() {
		btnDelete(driver).click();
		btnConfirmDelete(driver).click();
	}

}
