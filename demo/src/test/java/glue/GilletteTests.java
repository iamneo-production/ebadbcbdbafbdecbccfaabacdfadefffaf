
package glue;

import java.net.MalformedURLException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.openqa..selenium.chrome.ChromeDriver;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
// import io.cucumber.java.After;
// import io.cucumber.java.Before;
// import io.cucumber.java.en.Given;
// import io.cucumber.java.en.Then;
// import io.cucumber.java.en.When;
import pages.Homepage;
import runner.Base;
import utils.LoggerHandler;
import utils.Reporter;

public class GilletteTests {
    private WebDriver driver;
    ExtentReports reporter;
    ExtentSparkReporter sparkReporter;
    Homepage homePage = new Homepage();
    Base base = new Base();
    Logger log = LoggerHandler.log;
    Homepage homepage = new Homepage();

    @Before
    public void setUp() throws MalformedURLException {
        // Set up ChromeDriver path
        // System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Create ChromeDriver instance
        // driver = new ChromeDriver();
        // driver = base.openBrowser();
        
        // driver.manage().window().maximize();
        // reporter = Reporter.generateExtentReport();
    }
    
    driver = new ChromeDriver();

    @Given("User navigates to the webpage")
    public void navigateToWebpage() {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://example.com"); // Replace with your webpage URL
    }

    @When("The page title is captured")
    public void capturePageTitle() {
        String pageTitle = driver.getTitle();
        // Store pageTitle or perform any necessary verification
    }

    @Then("The page title should contain {string}")
    public void verifyPageTitle(String expectedTitle) {
        String pageTitle = driver.getTitle();
        assert pageTitle.contains(expectedTitle);
    }


    @After
    public void tearDown() {
        driver.quit();
        reporter.flush();
    }
}
