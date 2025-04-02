package hooks;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

import factory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class MyHooks {
	
	WebDriver driver;
	
	@Before
	public void setup()
	{
		DriverFactory.initalizeBrowser("chrome");
		driver=DriverFactory.getDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://tutorialsninja.com/demo/");
		
	}
	@After
	public void tearDown()
	{
		driver.quit();
		
		System.out.println("successfully executed the script");
	}
	

}
