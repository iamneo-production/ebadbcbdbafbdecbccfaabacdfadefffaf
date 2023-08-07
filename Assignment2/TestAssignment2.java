import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestAssignment2{

    @Given("I am on the Google homepage")
    public void i_am_on_the_google_homepage() {
        // Code to navigate to Google homepage
    }

    @When("I enter {string} in the search box")
    public void i_enter_in_the_search_box(String searchQuery) {
        // Code to enter searchQuery in the search box
    }

    @When("I click the \"Google Search\" button")
    public void i_click_the_google_search_button() {
        // Code to click on the "Google Search" button
    }

    @Then("I should see image results for {string}")
    public void i_should_see_image_results_for(String searchQuery) {
        // Code to verify that image results for searchQuery are displayed
        // You can use appropriate assertions here
    }
}
