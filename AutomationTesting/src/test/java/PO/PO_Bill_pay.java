package PO;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import Base_Test.Browser_Invoke;

public class PO_Bill_pay extends Browser_Invoke{
	
	  
		@FindBy(how=How.XPATH,using="//input[@name='username']")
		WebElement user_name;
		
		@FindBy(how=How.XPATH,using="//input[@name='password']")
		WebElement pass_word;

		@FindBy(how=How.XPATH,using="//input[@class='button']")
		WebElement sign_in;
		
		@FindBy(how=How.XPATH,using="//a[text()='Bill Pay']")
		WebElement Bill_pay;
		
		@FindBy(how=How.XPATH,using="//input[@name='payee.name'and @class='input' and @type='text']")
		WebElement Payee_Name;
		
		@FindBy(how=How.XPATH,using="//input[@name='payee.address.street' and @class='input'and @type='text']")
		WebElement Payee_Address;
		
		@FindBy(how=How.XPATH,using="//input[@name='payee.address.city' and @class= 'input'and @type='text']")
		WebElement Payee_City;
		
		@FindBy(how=How.XPATH,using="//input[@name='payee.address.state' and @class='input'and @type='text']")
		WebElement Payee_State;
		
		@FindBy(how=How.XPATH,using="//input[@id='payee.address.zipCode']")
		WebElement Payee_zipcode;
		
		@FindBy(how=How.XPATH,using="//input[@name='payee.phoneNumber']")
		WebElement Payee_PhnNumber;
		@FindBy(how=How.XPATH,using="//input[@id='payee.accountNumber']")
		WebElement Payee_Account_number;
		@FindBy(how=How.XPATH,using="//input[@name='verifyAccount']")
		WebElement payee_verify_account;
		@FindBy(how=How.XPATH,using="//input[@name='amount']")
		WebElement Ammount;
		@FindBy(how=How.XPATH,using="//select[@name='fromAccountid'and @class='input']")
		WebElement From_Acoount;
		@FindBy(how=How.XPATH,using="//input[@type='submit']")
		WebElement Send_Payment;
		
 
		public void username( String username)
		{
			 user_name.sendKeys(username);
		}
		public void password(String passward)
		{
			pass_word.sendKeys(passward);
		}
		public void signin()
		{
			sign_in.submit();
		}
		public void Bill_pay()
		{
			Bill_pay.click();
		}
		public void Payee_Name(String name)
		{
			Payee_Name.sendKeys(name);
		}
		public void Payee_Address(String address)
		{
			Payee_Address.sendKeys(address);
		}
		public void Payee_City(String city)
		{
			Payee_City.sendKeys(city);
		}
		public void Payee_State(String state)
		{
			Payee_State.sendKeys(state);
			
		}
		public void Payee_zipcode(String zipcode)
		{
			 Payee_zipcode.sendKeys(zipcode);
		}
		public void Payee_PhnNumber(String phn)
		{
			Payee_PhnNumber.sendKeys(phn);		
		}
		public void Payee_Account_number(String account4)
		{
			Payee_Account_number.sendKeys(account4);
		}
		public void payee_verify_account(String account3)
		{
			payee_verify_account.sendKeys(account3);		
		}
		public void Ammount(String amt)
		{
			Ammount.sendKeys(amt);
		}
		public void From_Acoount(String account5)
		{
			Select sel=new Select(From_Acoount);
			sel.deselectByValue(account5);		}
		public void Send_Payment()
		{
			Send_Payment.submit();
		}

}
