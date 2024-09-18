package stepDefinitions;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

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
		cnp = new CreateAUserPage(BaseClass.getDriver());
	    cnp.clickSignUpLogin();
	}

	@Then("User Verify New User Signup! is visible")
	public void user_verify_new_user_signup_is_visible() 
	{
	    cnp.verifyingNewUserSignUpText();
	}
	
	@Then("User should enter the name as {string} and emailId as {string}")
	public void user_should_enter_the_name_as_and_emailid_as(String name, String email)
	{
		cnp.enterName(name);
		cnp.enterEmailAddress(email);
	}
	
	
	
	@Then("User should fill the below account information details")
	public void user_should_fill_the_below_account_information_details(DataTable dataTable) throws InterruptedException 
	{
		
		List<List<String>> userList = dataTable.asLists(String.class);
		
		for(List<String>list:userList)
		{
			System.out.println(list);
		}
		
//		HashMap<String,String> hm=new HashMap<String, String>();
		
		//adding data pairs to hashmap
		
//		hm.get("Title");
//		hm.get("Password");
//		hm.get("Date");
//		hm.get("Month");
//		hm.get("Year");
		
//		Map<String, String> accData = dataTable.asMap(String.class, String.class);
		
		// Radio Button to click on Mr.
		

		
		
//		WebElement btn_Male = cnp.rdo_Mr;
//		WebElement btn_Female = cnp.rdo_Mrs;
//		
//		cnp.gender_Radio(btn_Female);
		
//		if(btn_Male.isDisplayed())
//		{
//			Actions action = new Actions(BaseClass.getDriver());
//			action.click(btn_Male).build().perform();
//		}		
//		
//		else
//		{
//			Actions action = new Actions(BaseClass.getDriver());
//			action.click(btn_Female).build().perform();
//		}		
		
//		Thread.sleep(3000);
//		
//		
////		btn_Radio().click().accData.get("Title"), Keys.TAB));
//        
       
//        Thread.sleep(3000);
		
//        WebElement feMale = cnp.rdo_Mrs;
//        feMale.sendKeys(accData.get(feMale));
        
//        WebElement inputPassword=cnp.txtPassword;
//        inputPassword.sendKeys(accData.get("Password"), Keys.TAB);
        
//        WebElement day = driver.findElement(By.xpath("//select[@id='days']"));
//        
//        Select selectbyDate = new Select(day);
//        selectbyDate.selectByVisibleText();
        
        
        
        
        
        
        
        
		
		/*
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
	    
	    */
	}
	
	@Then("User should fill the below address information details")
	public void user_should_fill_the_below_address_information_details(DataTable dataTable2) 
	{
		
//		Map<String, String> addressData = dataTable2.asMap(String.class, String.class);
//
//		 WebElement inputFirstName=cnp.txtFirstName();
//		 inputFirstName.sendKeys(addressData.get("First name"), Keys.TAB);
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
	    boolean del_Msg = cnp.deleteAccountConfirmationMsg();
	    Assert.assertTrue(del_Msg);
	    cnp.clickOnContinueButton();
	    
	}
	
	@Then("User Verify that Logged in as username is visible")
	public void user_verify_that_logged_in_as_username_is_visible() 
	{
		boolean verifyLoggedInAs = cnp.verifyingLoggedInAs();
		Assert.assertTrue(verifyLoggedInAs);
	}

	@Then("User Click Delete Account button")
	public void user_click_delete_account_button() 
	{
		cnp.deleteAccount();
	}


}
