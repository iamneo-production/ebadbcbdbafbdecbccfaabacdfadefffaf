package com.examly.springapp;

import org.junit.Test; 
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
// @SpringBootTest(classes = SpringappApplication.class)
// @AutoConfigureMockMvc
// @RunWith(SpringRunner.class)
public class SpringApplicationTests {

	//@Autowired
    // private MockMvc mockMvc;	

	// //Add A New Task
	// @Test
    // public void test_case1() throws Exception {
		
	// 	String dataOne = "{\"taskId\":\"12211\",\"taskHolderName\":\"Gowthaman M\",\"taskDate\":\"4/15/2021\",\"taskName\":\"Spring Projects\",\"taskStatus\":\"In Progress\"}";
	//  	mockMvc.perform(MockMvcRequestBuilders.post("/saveTask")
	//  			.contentType(MediaType.APPLICATION_JSON)
	//  			.content(dataOne)
	//  			.accept(MediaType.APPLICATION_JSON))
	//         	.andExpect(status().isOk())
	//         	.andReturn();
	 	
    // }
	
	
	// //Get All Task
	// @Test
    // public void test_case2() throws Exception {
		
	//  	mockMvc.perform(MockMvcRequestBuilders.get("/alltasks")
	//  			.contentType(MediaType.APPLICATION_JSON)
	//  			.accept(MediaType.APPLICATION_JSON))
	//         	.andExpect(status().isOk())
	// 	        .andExpect(MockMvcResultMatchers.jsonPath("$[*].houseNo").exists())
	// 	        .andExpect(MockMvcResultMatchers.jsonPath("$").isNotEmpty())
	//         	.andReturn();
	 	
    // }
	
	// //Get A Task By ID
	// @Test
	// public void test_case3() throws Exception {
		
	// 	mockMvc.perform(MockMvcRequestBuilders.get("/getTask")
	// 			.param("taskId","12211")
	// 			.contentType(MediaType.APPLICATION_JSON)
	// 	 		.accept(MediaType.APPLICATION_JSON))
	// 	        .andExpect(status().isOk())
	// 	        .andExpect(jsonPath("$.taskHolderName").value("Gowthaman M"))
	// 	        .andExpect(jsonPath("$.taskDate").value("4/15/2021"))
	// 	        .andExpect(jsonPath("$.taskName").value("Spring Projects"))
	// 			.andExpect(jsonPath("$.taskStatus").value("In Progress"))
	// 	        .andReturn();
			
	// }
	
	// //Delete A Task
	// @Test
	// public void test_case4() throws Exception {
		
	// 	mockMvc.perform(MockMvcRequestBuilders.get("/deleteTask")
	// 			.param("taskId","12211")
	// 			.contentType(MediaType.APPLICATION_JSON)
	// 	 		.accept(MediaType.APPLICATION_JSON))
	// 	        .andExpect(status().isOk())
	// 	        .andReturn();
			
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
