package com.examly.springapp;

import org.testng.annotations.Test;
import java.net.URL;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import static org.junit.Assert.assertEquals;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class SpringApplicationTests {

    ChromeOptions options = new ChromeOptions();
    WebDriver driver = null;
    private String pageTitle;
    options.setBrowserVersion(115.0);
    @BeforeTest
    public void beforeTest() throws Exception
     {
   // replace seleniumhost and port with correct values
        driver = new RemoteWebDriver(new URL("http://34.85.242.216:4444"), options);
        driver.manage().window().maximize();
    }

    public void openChromeBrowser() {
        // Set ChromeDriver executable path
       // System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Disable Chrome browser notifications
       // ChromeOptions options = new ChromeOptions();
       // options.addArguments("--disable-notifications");
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
        //assert pageTitle.contains(query + " - Google Search");
    }

    @AfterTest
    public void afterTest() 
    {
        driver.quit();
    }
    
}