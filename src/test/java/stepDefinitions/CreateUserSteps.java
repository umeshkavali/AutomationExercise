package stepDefinitions;

import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

import factory.BaseClass;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageObjects.CreateAUserPage;

public class CreateUserSteps extends BaseClass
{
	public WebDriver driver;
	public Properties p;
	public CreateAUserPage cnp;
	public BaseClass bs;
	
	@Given("User launch the browser")
	public void user_launch_the_browser() throws IOException
	{
		driver=BaseClass.initilizeBrowser();   	    	
		p=BaseClass.getProperties();
	}

	@Then("User navigates to the URL {string}")
	public void user_navigates_to_the_url(String url) 
	{
		driver.get(url);
//		driver.get(p.getProperty("appURL"));
		driver.manage().window().maximize(); 
	}

	@Then("User verify the home page is visible successfully")
	public void user_verify_the_home_page_is_visible_successfully() 
	{
	    String actual_title = driver.getTitle();
	    String expected_title = "Automation Exercise";
	    
	    if(actual_title.equals(expected_title))
	    {
	    	System.out.println("Verified Successfully");
	    }
	    
	    else
	    {
	    	System.out.println("Couldn't be able to verify the Page Title");
	    }
	}

	@Then("User clicks on SignUp or Login button")
	public void user_clicks_on_sign_up_or_login_button() 
	{
	    cnp.clickSignUpLogin();
	}

	@Then("User Verify New User Signup! is visible")
	public void user_verify_new_user_signup_is_visible() 
	{
	    cnp.verifyingNewUserSignUpText();
	}
	
	@Then("User should enter the name as {string} and password as {string}")
	public void user_should_enter_the_name_as_and_password_as(String name, String email)
	{
		cnp.enterName(name);
		cnp.enterEmailAddress(email);
	}
	
	@Then("User should fill the below details")
	public void user_should_fill_the_below_details(DataTable dataTable) throws InterruptedException 
	{
	    String date = bs.getDate("HHmmSS");
	    List<String> dataList = dataTable.asList();
	    for(String input : dataList)
	    {
	    	switch(input)
	    	{
	    	case "Title": break;
	    	case "Password": break;
	    	case "Date": break;
	    	case "Month": break;
	    	case "Year": break;
	    	
	    	default:
	    	throw new IllegalStateException("Unexpected value: " + input);	
	    		
	    	}
	    	
	    	Thread.sleep(5000);
	    }
	}
	

	@Then("User Enter name and email address")
	public void user_enter_name_and_email_address(String nm, String mil) 
	{
	    cnp.enterName(nm);
	    cnp.enterEmailAddress(mil);
	}

	@Then("User Click on Signup button")
	public void user_click_on_signup_button()
	{
	   cnp.clickOnSignUpButton(); 
	}

	@Then("User Verify that ENTER ACCOUNT INFORMATION is visible")
	public void user_verify_that_enter_account_information_is_visible() 
	{
	    cnp.verifyEnterAccountInformation();
	}

	@Then("User Select Sign up for our newsletter! checkbox")
	public void user_select_sign_up_for_our_newsletter_checkbox() 
	{
	    cnp.clickOnNewsLetterCheckBox();
	}

	@Then("User Select Receive special offers from our partners! checkbox")
	public void user_select_receive_special_offers_from_our_partners_checkbox()
	{
	    cnp.clickOnSpecialOffersFromPartners();
	}

	
	@Then("User Click on Create Account button")
	public void user_click_on_create_account_button() 
	{
	    cnp.clickOnCreateAccountButton();
	}

	@Then("User Verify that ACCOUNT CREATED! is visible")
	public void user_verify_that_account_created_is_visible() 
	{
		cnp.verifyAccountCreated();
	}

	@Then("User Click Continue button")
	public void user_click_continue_button() 
	{
		cnp.clickOnContinueButton();
	}
	
	
	@Then("Verify that ACCOUNT DELETED! is visible and click Continue button")
	public void verify_that_account_deleted_is_visible_and_click_continue_button() 
	{
	    
	}
	
	@Then("User Verify that Logged in as username is visible")
	public void user_verify_that_logged_in_as_username_is_visible() 
	{
		//b[normalize-space()='Umesh']
	}

	@Then("User Click Delete Account button")
	public void user_click_delete_account_button() 
	{
		cnp.deleteAccount();
	}


}
