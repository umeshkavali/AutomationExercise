package pageObjects;

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
	WebElement lnkSignUpLogin;
	
	public void clickSignUpLogin()
	{
		lnkSignUpLogin.click();
	}
	
	@FindBy(xpath="//a[normalize-space()='Home']")
	@CacheLookup
	WebElement lnkHome;
	
	public void clickOnHomeLink()
	{
		lnkHome.click();
	}
	
	@FindBy(xpath="//h2[normalize-space()='New User Signup!']")
	@CacheLookup
	WebElement txtNewUserSignUp;
	
	public void verifyingNewUserSignUpText()
	{
		boolean verifyNewUserSignUp = txtNewUserSignUp.isDisplayed();
		System.out.println("Verifying the Verify New User Sign Up Text is:"+verifyNewUserSignUp);;
	}
	
	@FindBy(xpath="//input[@placeholder='Name']")
	@CacheLookup
	WebElement txtName;
	
	public void enterName(String nme)
	{
		txtName.clear();
		txtName.sendKeys(nme);
	}
	
	
	@FindBy(xpath="//input[@data-qa='signup-email']")
	@CacheLookup
	WebElement txtEmail;
	
	public void enterEmailAddress(String mail)
	{
		txtEmail.clear();
		txtEmail.sendKeys(mail);
	}
	
	@FindBy(xpath="//button[normalize-space()='Signup']")
	@CacheLookup
	WebElement btnSignUp;
	
	public void clickOnSignUpButton()
	{
		btnSignUp.click();
	}
	
	@FindBy(xpath="//b[normalize-space()='Enter Account Information']")
	@CacheLookup
	WebElement verifyEnterAccountInformation;
	
	public void verifyEnterAccountInformation()
	{
		boolean verifyEnterAccountInfo = verifyEnterAccountInformation.isDisplayed();
		System.out.println("Verifying the Enter Account Information Text is:"+verifyEnterAccountInfo);
	}
	
	@FindBy(xpath="//input[@id='id_gender1']")
	@CacheLookup
	WebElement rdo_Male;
	
	public void clickOnMale()
	{
		rdo_Male.click();
	}
	
	@FindBy(xpath="//input[@id='id_gender2']")
	@CacheLookup
	WebElement rdo_Female;
	
	public void clickOnFemale()
	{
		rdo_Female.click();
	}
	
	@FindBy(xpath="//input[@id='password']")
	@CacheLookup
	WebElement txtPassword;
	
	public void enterPassword(String pwd)
	{
		txtPassword.clear();
		txtPassword.sendKeys(pwd);
	}
	
	@FindBy(xpath="//input[@id='newsletter']")
	@CacheLookup
	WebElement chknewsLetter;
	
	public void clickOnNewsLetterCheckBox()
	{
		chknewsLetter.click();
	}
	
	@FindBy(xpath="//input[@id='optin']")
	@CacheLookup
	WebElement chkpartners;
	
	public void clickOnSpecialOffersFromPartners()
	{
		chkpartners.click();
	}
	
	@FindBy(xpath="//button[normalize-space()='Create Account']")
	@CacheLookup
	WebElement btnCreateAccount;
	
	public void clickOnCreateAccountButton()
	{
		btnCreateAccount.click();
	}
	
	@FindBy(xpath="//b[normalize-space()='Account Created!']")
	@CacheLookup
	WebElement verifyAccountCreated;
	
	public void verifyAccountCreated()
	{
//		if(verifyAccountCreated.getText().equals("Account Created!"))
//		{
//			System.out.println("Congratulations! Your new account has been successfully created!");
//		}
//		
//		else
//		{
//			System.out.println("Account didn't created. Hence check the code one more time");
//			driver.close();
//		}
		
		// OR
		
		boolean accountCreationVerificationMessage = verifyAccountCreated.isDisplayed();
		System.out.println("Checking the Account Creation:"+accountCreationVerificationMessage);
	}
	
	@FindBy(xpath="//a[normalize-space()='Continue']")
	@CacheLookup
	WebElement btnContinue;
	
	public void clickOnContinueButton()
	{
		btnContinue.click();
	}
	
	@FindBy(xpath="//a[normalize-space()='Delete Account']")
	@CacheLookup
	WebElement lnkDeleteAcc;
	
	public void deleteAccount()
	{
		lnkDeleteAcc.click();
	}
	
	@FindBy(xpath="//b[normalize-space()='Account Deleted!']")
	@CacheLookup
	WebElement verifyDeleteAccMsg;
	
	public void deleteAccountConfirmationMsg()
	{
		boolean actual_Msg = verifyDeleteAccMsg.isDisplayed();
		System.out.println("Verifying the Deleted Message as:"+actual_Msg);
		
	}
	
	
	
	
	
	
	
	

	
	
	
	
	
}
