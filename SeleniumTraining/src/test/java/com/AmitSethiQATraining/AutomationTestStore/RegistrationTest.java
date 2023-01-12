package com.AmitSethiQATraining.AutomationTestStore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RegistrationTest {

	
	static WebDriver  driver;
	
	public static void enterTextIntoTextBox(String Xpath,String Input_Text)
	{
		String TextBoxXpath =Xpath;
		WebElement TextBox = driver.findElement(By.xpath(TextBoxXpath));
		//entering text into text box 
		//String ExistingText = FirstNameTextBoxInCreateAccountPage.getText();
		String ExistingText = TextBox.getAttribute("value");
		if(ExistingText.equals(""))
		{
			TextBox.sendKeys(Input_Text);
		}
		else
		{
			System.out.println("there is some exisitng text here :: "+ExistingText);
			TextBox.clear();
			TextBox.sendKeys(Input_Text);
		}
	}
	
	
	public static void selectOptionFromDropDownByVisibleText(String Xpath,String Visible_Text)
	{
		String DropDownXapth = Xpath;
		WebElement DropDownWebElement = driver.findElement(By.xpath(DropDownXapth));
		
		Select DropDown = new Select(DropDownWebElement);
		DropDown.selectByVisibleText(Visible_Text);
		//RegionOrStateDropDownInCreateAccountPage.selectByIndex(4);
	}
	
	public static void selectOptionFromDropDownByIndex(String Xpath,int index)
	{
		String DropDownXapth = Xpath;
		WebElement DropDownWebElement = driver.findElement(By.xpath(DropDownXapth));
		
		Select DropDown = new Select(DropDownWebElement);
		DropDown.selectByIndex(index);
	}
	
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		

System.setProperty("webdriver.chrome.driver", "D:\\Trainings\\QA-Training-for-Amit-Sethi\\SeleniumTraining\\Browser Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
		String WebsiteURL = "https://automationteststore.com/";
		
		driver.get(WebsiteURL);
		
		driver.manage().window().maximize();
		
		//creating web element for LoginOrRegister
		String LoginOrRegisterXpath = "//*[@id='customer_menu_top']/li/a";
		WebElement LoginOrRegisterLink = driver.findElement(By.xpath(LoginOrRegisterXpath));
		//click on LoginOrRegister
		LoginOrRegisterLink.click();
		//creating web element for ContinueButtonInAccountLoginPage
		String ContinueButtonInAccountLoginPageXpath = "//*[@id='accountFrm']/fieldset/button";
		WebElement ContinueButtonInAccountLoginPage = driver.findElement(By.xpath(ContinueButtonInAccountLoginPageXpath));
		//clicking on ContinueButtonInAccountLoginPage
		ContinueButtonInAccountLoginPage.click();
		
		
		
		//creating webelemnt for FirstNameTextBoxInCreateAccountPage
		String FirstNameTextBoxInCreateAccountPageXpath = "//*[@id='AccountFrm_firstname']";
		WebElement FirstNameTextBoxInCreateAccountPage = driver.findElement(By.xpath(FirstNameTextBoxInCreateAccountPageXpath));
		//entering text into FirstNameTextBoxInCreateAccountPage
		//String ExistingText = FirstNameTextBoxInCreateAccountPage.getText();
		String ExistingText = FirstNameTextBoxInCreateAccountPage.getAttribute("value");
		if(ExistingText.equals(""))
		{
			FirstNameTextBoxInCreateAccountPage.sendKeys("Amit");
		}
		else
		{
			System.out.println("there is some exisitng text here :: "+ExistingText);
			FirstNameTextBoxInCreateAccountPage.clear();
			FirstNameTextBoxInCreateAccountPage.sendKeys("Amit");
		}
		ExistingText = FirstNameTextBoxInCreateAccountPage.getAttribute("value");
		System.out.println("there is some exisitng text here :: "+ExistingText);
		
		
		
		// entering last name 
		
		String LastNameTextBoxInCreateAccountPageXapth = "//*[@id='AccountFrm_lastname']";
		enterTextIntoTextBox(LastNameTextBoxInCreateAccountPageXapth, "Sethi");
		
		
		// entering email
		
		
		String EmailTextBoxInCreateAccountPageXapth = "//*[@id='AccountFrm_email']";
		enterTextIntoTextBox(EmailTextBoxInCreateAccountPageXapth, "amitsethi@ymail.com");
		
		
		// entering address1
		
		String Address1TextBoxInCreateAccountPageXapth = "//*[@id='AccountFrm_address_1']";
		enterTextIntoTextBox(Address1TextBoxInCreateAccountPageXapth, "908,2,3,street23");
		
		// entering city
		
		String CityTextBoxInCreateAccountPageXapth = "//*[@id='AccountFrm_city']";
		enterTextIntoTextBox(CityTextBoxInCreateAccountPageXapth, "delta");
		
		
		// entering zipcode
		
		String ZipCodeTextBoxInCreateAccountPage = "//*[@id='AccountFrm_postcode']";
		enterTextIntoTextBox(ZipCodeTextBoxInCreateAccountPage, "500471");
		
		
		// selecting country
		
		String CountryDropDownInCreateAccountPageXpath = "//*[@id='AccountFrm_country_id']";
		selectOptionFromDropDownByVisibleText(CountryDropDownInCreateAccountPageXpath, "Algeria");
		
		Thread.sleep(4000);
		
		//selecting region / state
		
				String RegionOrStateDropDownInCreateAccountPageXapth = "//*[@id='AccountFrm_zone_id']";
				WebElement RegionOrStateDropDownInCreateAccountPageWebElement = driver.findElement(By.xpath(RegionOrStateDropDownInCreateAccountPageXapth));
				
				Select RegionOrStateDropDownInCreateAccountPage = new Select(RegionOrStateDropDownInCreateAccountPageWebElement);
				RegionOrStateDropDownInCreateAccountPage.selectByVisibleText("Adrar");
				//RegionOrStateDropDownInCreateAccountPage.selectByIndex(4);
				
			
				
	// entering login name
				
				String LoginNameTextBoxInCreateAccountPageXpath = "//*[@id='AccountFrm_loginname']";
				enterTextIntoTextBox(LoginNameTextBoxInCreateAccountPageXpath, "AmitSethi");
				
//entering password
				
				String PasswordTextBoxInCreateAccountPageXpath = "//*[@id='AccountFrm_password']";
				enterTextIntoTextBox(PasswordTextBoxInCreateAccountPageXpath, "AmitSethi");
				
//confirming password
				
				
				String PasswordConfirmTextBoxInCreateAccountPageXpath = "//*[@id='AccountFrm_confirm']";
				enterTextIntoTextBox(PasswordConfirmTextBoxInCreateAccountPageXpath, "AmitSethi");
				
				
// Agreeing to private policy
				
				
				String PrivatePolicyCheckBoxInCreateAccountPageXpath = "//*[@id='AccountFrm_agree']";
				WebElement PrivatePolicyCheckBoxInCreateAccountPage = driver.findElement(By.xpath(PrivatePolicyCheckBoxInCreateAccountPageXpath));
				PrivatePolicyCheckBoxInCreateAccountPage.click();
				
				
				
// clicking on continue button
				
				
				String ContinueButtonInCreateAccountPageXpath = "//*[@id='AccountFrm']/div[5]/div/div/button";
				WebElement ContinueButtonInCreateAccountPage = driver.findElement(By.xpath(ContinueButtonInCreateAccountPageXpath));
				ContinueButtonInCreateAccountPage.click();
				

				
				
				
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
