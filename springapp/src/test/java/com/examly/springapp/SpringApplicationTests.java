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


@SpringBootTest(classes = SpringappApplication.class)
@AutoConfigureMockMvc
@RunWith(SpringRunner.class)
public class SpringApplicationTests {

	@Autowired
    private MockMvc mockMvc;	
	WebDriver driver;
	//Add A New Task
	@Test
    public void test_case1() throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Disable Chrome browser notifications
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");

        // Initialize ChromeDriver
        driver = new ChromeDriver(options);
	 	
    }
	
	
	//Get All Task
	@Test
    public void test_case2() throws Exception {
		
		driver.get("https://www.google.com/");
	 	
    }
	
	//Get A Task By ID
	@Test
	public void test_case3() throws Exception {
		
		driver.findElement(By.name("q")).sendKeys(query);
	}
	
	//Delete A Task
	@Test
	public void test_case4() throws Exception {
		
		driver.findElement(By.linkText("Images")).click();
	}

	@Test 
	public void test_case5() throws Exception{
		String pageTitle = driver.getTitle();
        assert pageTitle.contains(query + " - Google Search");
	}
}
