import io.appium.java_client.AppiumDriver;
import org.junit.*;
import utility.*;

import java.net.MalformedURLException;

public abstract class AbstractTest {


	private AppiumDriver driver;
	protected GL app;

	@Before
	public void connect() throws MalformedURLException {
		this.driver = AppiumDriverBuilder.forAndroid().build();

		app = new GL(driver);

	}

	@After
	public void tearDown() throws Exception{
		driver.quit();
	}
}