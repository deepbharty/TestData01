package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearchSteps {
	
	WebDriver driver=null;
	
	@Given("Browser is Open")
	public void browser_is_open() {
	    
		System.out.println("Inside Step- Browser Open");
		
		String projectPath=System.getProperty("user.dir");
		System.out.println(projectPath);
		
		System.setProperty("webdriver.chrome.driver",projectPath+"\\drivers\\chromedriver110.exe");
		
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\Deepak Bharty\\eclipse-workspace\\CucumberBDDTest\\drivers\\chromedriver91.exe");
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}

	@And("User is on Google Search Page")
	public void user_is_on_google_search_page() {
		
		driver.get("https://www.google.co.in");
	    
		System.out.println("Inside Step- Google Search Page");
	}

	@When("User entres a text in Google Search Box")
	public void user_entres_a_text_in_google_search_box() {
		
		driver.findElement(By.cssSelector("input[title='Search']")).sendKeys("Live Cricket Score");
	
		System.out.println("entres a text ");
	}

	@And("Hit the Enter Button")
	public void hit_the_enter_button() {
	  
		System.out.println("Enter Button ");
	}

	@Then("Navivgated to Search result Page")
	public void navivgated_to_search_result_page() {
		System.out.println("Search result Page");
		
		driver.close();
	    
	}


}
