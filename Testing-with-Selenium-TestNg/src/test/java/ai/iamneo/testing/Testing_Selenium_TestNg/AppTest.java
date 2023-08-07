package ai.iamneo.testing.Testing_Selenium_TestNg;

import org.testng.annotations.Test;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AppTest {

	// ChromeOptions chromeOptions = new ChromeOptions();
	// WebDriver driver = null;

	// @BeforeTest
	// public void beforeTest() throws Exception {
	// //	System.setProperty("webdriver.chrome.driver", "/home/coder/project/workspace/Testing-with-Selenium-TestNg/chromedriver");
	// 	driver = new RemoteWebDriver(new URL("http://localhost:4444"), chromeOptions);
	// }

	// @Test
	// public void TestCase_1() throws InterruptedException {
	// 	driver.get("https://admin.pscollege841.exam.ly/");
	// 	Thread.sleep(5000);  
	// 	String title = driver.getTitle();
	// 	Assert.assertEquals(title, "PS College");
	// }
	// @Test
	// public void TestCase_2() throws InterruptedException {
	// 	driver.get("https://admin.pscollege841.exam.ly/");
	// 	Thread.sleep(5000);  
	// 	String title = driver.getTitle();
	// 	Assert.assertEquals(title, "PS College");
	// }

	// @AfterTest
	// public void afterTest() {
	// 	driver.quit();
	// }

	private WebDriver driver;

    @Given("I open the Chrome browser")
    public void openChromeBrowser() {
        // Set ChromeDriver executable path
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Disable Chrome browser notifications
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");

        // Initialize ChromeDriver
        driver = new ChromeDriver(options);
    }

    @When("I navigate to Google")
    public void navigateToGoogle() {
        driver.get("https://www.google.com/");
    }

    @When("I enter {string} in the search box")
    public void enterSearchQuery(String query) {
        driver.findElement(By.name("q")).sendKeys(query);
    }

    @When("I click the Google Images button")
    public void clickGoogleImagesButton() {
        driver.findElement(By.linkText("Images")).click();
    }

    @Then("I should see image results for {string}")
    public void verifyImageResults(String query) {
        String pageTitle = driver.getTitle();
        assert pageTitle.contains(query + " - Google Search");
    }

    @Then("I close the browser")
    public void closeBrowser() {
        driver.quit();
    }
}
