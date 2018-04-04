import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import screen.NavBar;

public class GoalsTest extends AbstractTest{

	public GoalsTest(){}

	private String spiritual = "spiritual";
	private String social = "social";
	private String physical = "physical";
	private String intellectual = "intellectual";
	private String goalText = "And my father dwelt in a tent";

	private void AddGoalOfGivenType(String goalType, String goalText) {
		app.primaryActionButton().tapPAB();
		app.primaryActionButton().tapGoal();
		app.editGoalScreen().tapGivenGoalType(goalType);
		app.editGoalScreen().enterGoalTitle(goalText);
		app.editGoalScreen().tapSave();
	}

	@Before
	public void Setup() {
		app.navBar().NavToGoals();
	}

	@Test
	public void AddSpiritualGoal() {
		//Add Spiritual Goal
		AddGoalOfGivenType(spiritual, goalText);

		//Verify goal is displayed
		Assert.assertTrue(app.goalsScreen().givenGoalIsDisplayed(goalText));
	}

	@Test
	public void AddSocialGoal() {
		//Add Social Goal
		AddGoalOfGivenType(social, goalText);

		//Verify goal is displayed
		Assert.assertTrue(app.goalsScreen().givenGoalIsDisplayed(goalText));
	}

	@Test
	public void AddPhysicalGoal() {
		//Add Physical Goal
		AddGoalOfGivenType(physical, goalText);

		//Verify goal is displayed
		Assert.assertTrue(app.goalsScreen().givenGoalIsDisplayed(goalText));
	}

	@Test
	public void AddIntellectualGoal() {
		//Add Intellectual Goal
		AddGoalOfGivenType(intellectual, goalText);

		//Verify goal is displayed
		Assert.assertTrue(app.goalsScreen().givenGoalIsDisplayed(goalText));
	}

	@Test
	public void AllGoals() {
		String spiritualGoal = "Test1";
		String socialGoal = "Test2";
		String physicalGoal = "Test3";
		String intellectualGoal = "Test4";

		//Add a goal over every goal type
		AddGoalOfGivenType(spiritual, spiritualGoal);
		AddGoalOfGivenType(social, socialGoal);
		AddGoalOfGivenType(physical, physicalGoal);
		AddGoalOfGivenType(intellectual, intellectualGoal);

		//Assert only the spiritual goal is displayed on Spiritual tab
		app.goalsScreen().tapSpiritualTab();
		Assert.assertTrue(app.goalsScreen().givenGoalIsDisplayed(spiritualGoal));
		Assert.assertFalse(app.goalsScreen().givenGoalIsDisplayed(socialGoal));
		Assert.assertFalse(app.goalsScreen().givenGoalIsDisplayed(physicalGoal));
		Assert.assertFalse(app.goalsScreen().givenGoalIsDisplayed(intellectualGoal));

		//Assert only the social goal is displayed on Spiritual tab
		app.goalsScreen().tapSocialTab();
		Assert.assertFalse(app.goalsScreen().givenGoalIsDisplayed(spiritualGoal));
		Assert.assertTrue(app.goalsScreen().givenGoalIsDisplayed(socialGoal));
		Assert.assertFalse(app.goalsScreen().givenGoalIsDisplayed(physicalGoal));
		Assert.assertFalse(app.goalsScreen().givenGoalIsDisplayed(intellectualGoal));

		//Assert only the spiritual goal is displayed on Spiritual tab
		app.goalsScreen().tapPhysicalTab();
		Assert.assertFalse(app.goalsScreen().givenGoalIsDisplayed(spiritualGoal));
		Assert.assertFalse(app.goalsScreen().givenGoalIsDisplayed(socialGoal));
		Assert.assertTrue(app.goalsScreen().givenGoalIsDisplayed(physicalGoal));
		Assert.assertFalse(app.goalsScreen().givenGoalIsDisplayed(intellectualGoal));

		//Assert only the spiritual goal is displayed on Spiritual tab
		app.goalsScreen().tapIntellectualTab();
		Assert.assertFalse(app.goalsScreen().givenGoalIsDisplayed(spiritualGoal));
		Assert.assertFalse(app.goalsScreen().givenGoalIsDisplayed(socialGoal));
		Assert.assertFalse(app.goalsScreen().givenGoalIsDisplayed(physicalGoal));
		Assert.assertTrue(app.goalsScreen().givenGoalIsDisplayed(intellectualGoal));

		//Assert all goals are displayed on All tab
		app.goalsScreen().tapAllTab();
		Assert.assertTrue(app.goalsScreen().givenGoalIsDisplayed(spiritualGoal));
		Assert.assertTrue(app.goalsScreen().givenGoalIsDisplayed(socialGoal));
		Assert.assertTrue(app.goalsScreen().givenGoalIsDisplayed(physicalGoal));
		Assert.assertTrue(app.goalsScreen().givenGoalIsDisplayed(intellectualGoal));
	}

	@Test
	public void DeleteGoal() {
		//Add Spiritual Goal
		AddGoalOfGivenType(spiritual, goalText);

		//Tap Goal
		app.goalsScreen().tapGivenGoal(goalText);

		//Tap Delete
		app.editGoalScreen().deleteGoal();

		//Verify goal is displayed
		Assert.assertFalse(app.goalsScreen().givenGoalIsDisplayed(goalText));
	}

	@Test
	public void ChangeGoalTitle() {
		String newTitle = "New Title";
		//Add Spiritual Goal
		AddGoalOfGivenType(spiritual, goalText);

		//Tap Goal
		app.goalsScreen().tapGivenGoal(goalText);

		//Enter a new title
		app.editGoalScreen().enterGoalTitle(newTitle);

		//Save goal
		app.editGoalScreen().tapSave();

		//Verify goal with old title isn't displayed
		Assert.assertFalse(app.goalsScreen().givenGoalIsDisplayed(goalText));

		//Verify new goal is displayed
		Assert.assertTrue(app.goalsScreen().givenGoalIsDisplayed(newTitle));
	}

	@Test
	public void NoGoalMessage() {
		//Assert the no goal icons appear on each goal page
		Assert.assertTrue(app.goalsScreen().noGoalsIconIsDisplayed());
		Assert.assertTrue(app.goalsScreen().noSpiritualGoalsIconIsdisplayed());
		Assert.assertTrue(app.goalsScreen().noSocialGoalsIconIsdisplayed());
		Assert.assertTrue(app.goalsScreen().noPhysicalGoalsIconIsdisplayed());
		Assert.assertTrue(app.goalsScreen().noIntellectualGoalsIconIsdisplayed());
	}

	@Test
	public void CompleteGoal() {
		//Add Spiritual Goal
		AddGoalOfGivenType(spiritual, goalText);

		//Tap Goal
		app.goalsScreen().tapGivenGoal(goalText);

		//Tap Complete
		app.editGoalScreen().completeGoal();

		//Verify goal completed text is displayed
		Assert.assertTrue(app.editGoalScreen().goalCompletedText());
	}

}
