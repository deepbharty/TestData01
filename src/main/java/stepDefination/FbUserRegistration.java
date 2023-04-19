package stepDefination;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.base.Base;
import com.qa.pages.FbSignup;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FbUserRegistration extends Base {

	FbSignup signup;
	
	@Given("launch the browser and enter application URL")
	public void launch_the_browser_and_enter_application_url() {
		initialization();
	}

	@When("User navigated to facebook registration page")
	public void user_navigated_to_facebook_registration_page() throws InterruptedException {
		signup=new FbSignup(driver);
		Thread.sleep(2000);
		signup.createAccountButton().click();
		
		
		//driver.findElement(By.cssSelector("a[data-testid='open-registration-form-button']")).click();
	}


	@Then("enter all the required details")
	public void enter_all_the_required_details() throws InterruptedException {
			
		Thread.sleep(1000);
          signup.firstName().sendKeys("Deepak");
          signup.lastName().sendKeys("Bharty");
          signup.Email_Phone().sendKeys("deep@yopmail.com");
          signup.ConfEmail_Phone().sendKeys("deep@yopmail.com");
          signup.password().sendKeys("test12324");
          
          
          //date of Birth Selection
          
          Thread.sleep(2000);
          //Day
          Select day= new Select(signup.day());         
          day.selectByValue("1");
      
          //Month
          
           Select month= new Select(signup.month());      
           month.selectByVisibleText("Jun");
           
         //Year  
           
		   Select year= new Select(signup.year());		             
		   year.selectByVisibleText("2000");
		   
//Gender Selection
		   
		   Thread.sleep(2000);
		  for(int i=0;i< signup.gender().size();i++) {
			  String sex=signup.gender().get(i).getText();
			  
			    System.out.println(sex);
			    
			    if (sex.equals("Male")){
			    	
			    	signup.gender().get(i).click();	
			    }}
	}

	@And("click on the signup button")
	public void click_on_the_signup_button() {
	 
		signup.submit().click();
		 
		
	}

	@Then("Validate the registration")
	public void validate_the_registration() throws InterruptedException {
		
		WebDriverWait wait= new WebDriverWait(driver,20);
		
		wait.until(ExpectedConditions.visibilityOfAllElements(signup.registrationErrorValidation()));
		
		String text =signup.registrationErrorValidation().getText();
		
		System.out.println(text);
		
		if (text.equals("You have entered an invalid email address. Please check your email address and try again.")) {
			
			System.out.println("Please Enter Valid Email ID");
		}
		
		else {
			 System.out.println(" Registration Successful");
		}
		
		Thread.sleep(2000);
		
		driver.close();
	
	}
}
