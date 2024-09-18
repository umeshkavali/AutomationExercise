package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class CreateAUserPage extends BasePage
{
	public WebDriver driver;

	public CreateAUserPage(WebDriver driver) 
	{
		super(driver);
	}
	
	@FindBy(xpath="//a[normalize-space()='Signup / Login']")
	@CacheLookup
	public WebElement lnkSignUpLogin;
	
	public void clickSignUpLogin()
	{
		lnkSignUpLogin.click();
	}
	
	@FindBy(xpath="//a[normalize-space()='Home']")
	@CacheLookup
	public WebElement lnkHome;
	
	public void clickOnHomeLink()
	{
		lnkHome.click();
	}
	
	@FindBy(xpath="//h2[normalize-space()='New User Signup!']")
	@CacheLookup
	public WebElement txtNewUserSignUp;
	
	public void verifyingNewUserSignUpText()
	{
		boolean verifyNewUserSignUp = txtNewUserSignUp.isDisplayed();
		System.out.println("Verifying the Verify New User Sign Up Text is:"+verifyNewUserSignUp);;
	}
	
	@FindBy(xpath="//input[@placeholder='Name']")
	@CacheLookup
	public WebElement txtName;
	
	public void enterName(String nme)
	{
//		txtName.clear();
//		txtName.sendKeys(nme);
		
		
		
	}
	
	
	@FindBy(xpath="//input[@data-qa='signup-email']")
	@CacheLookup
	public WebElement txtEmail;
	
	public void enterEmailAddress(String mail)
	{
		txtEmail.clear();
		txtEmail.sendKeys(mail);
	}
	
	@FindBy(xpath="//button[normalize-space()='Signup']")
	@CacheLookup
	public WebElement btnSignUp;
	
	public void clickOnSignUpButton()
	{
		btnSignUp.click();
	}
	
	@FindBy(xpath="//b[normalize-space()='Enter Account Information']")
	@CacheLookup
	public WebElement verifyEnterAccountInformation;
	
	public void verifyEnterAccountInformation()
	{
		boolean verifyEnterAccountInfo = verifyEnterAccountInformation.isDisplayed();
		System.out.println("Verifying the Enter Account Information Text is:"+verifyEnterAccountInfo);
	}
	
	@FindBy(xpath="//input[@id='id_gender1']")
	@CacheLookup
	public WebElement rdo_Mr;
	
	public void clickOnMale()
	{
		rdo_Mr.click();
	}
	
	@FindBy(xpath="//input[@id='id_gender2']")
	@CacheLookup
	public WebElement rdo_Mrs;
	
	public void clickOnFemale()
	{
		rdo_Mrs.click();
	}
	
	@FindBy(xpath="//input[@id='password']")
	@CacheLookup
	public WebElement txtPassword;
	
	public void enterPassword(String pwd)
	{
		txtPassword.clear();
		txtPassword.sendKeys(pwd);
	}
	
	@FindBy(xpath="//input[@id='newsletter']")
	@CacheLookup
	public WebElement chknewsLetter;
	
	public void clickOnNewsLetterCheckBox()
	{
		chknewsLetter.click();
	}
	
	@FindBy(xpath="//input[@id='optin']")
	@CacheLookup
	public WebElement chkpartners;
	
	public void clickOnSpecialOffersFromPartners()
	{
		chkpartners.click();
	}
	
	@FindBy(xpath="//button[normalize-space()='Create Account']")
	@CacheLookup
	public WebElement btnCreateAccount;
	
	public void clickOnCreateAccountButton()
	{
		btnCreateAccount.click();
	}
	
	@FindBy(xpath="//b[normalize-space()='Account Created!']")
	@CacheLookup
	public WebElement verifyAccountCreated;
	
	public void verifyAccountCreated()
	{		
		boolean accountCreationVerificationMessage = verifyAccountCreated.isDisplayed();
		Assert.assertTrue(accountCreationVerificationMessage);
	}
	
	@FindBy(xpath="//a[normalize-space()='Continue']")
	@CacheLookup
	public WebElement btnContinue;
	
	public void clickOnContinueButton()
	{
		btnContinue.click();
	}
	
	@FindBy(xpath="//a[normalize-space()='Delete Account']")
	@CacheLookup
	public WebElement lnkDeleteAcc;
	
	public void deleteAccount()
	{
		lnkDeleteAcc.click();
	}
	
	@FindBy(xpath="//b[normalize-space()='Account Deleted!']")
	@CacheLookup
	public WebElement verifyDeleteAccMsg;
	
	public boolean deleteAccountConfirmationMsg()
	{
		boolean deleted_Msg = verifyDeleteAccMsg.isDisplayed();
//		System.out.println("Verifying the Deleted Message as:"+deleted_Msg);
		return deleted_Msg;		
	}
	
	@FindBy(xpath="//li[10]//a[1]")
	@CacheLookup
	public WebElement lnkLoggedInAs;
	
	public boolean verifyingLoggedInAs()
	{
		boolean logged_In = lnkLoggedInAs.isDisplayed();
		return logged_In;
	}
	
	@FindBy(xpath="//input[@id='first_name']")
	@CacheLookup
	public WebElement txtFirstName;
	
	public void enterFirstName(String fName)
	{
		txtFirstName.clear();
		txtFirstName.sendKeys(fName);
	}
	
	@FindBy(xpath="//input[@id='last_name']")
	@CacheLookup
	public WebElement enterLastName;
	
	public void enterLastName(String lName)
	{
		enterLastName.clear();
		enterLastName.sendKeys(lName);
	}
	
//	public void gender_Radio(WebElement element)
//	{
//		if(element.getText().equals("Mr"))
//		{
//			element.click();
//		}
//		else if(element.getText().equals("MrS"))
//		{
//			element.click();
//		}
//		
//		else
//		{
//			System.out.println("Not found any radio button data");
//		}
//	
//	}
}
