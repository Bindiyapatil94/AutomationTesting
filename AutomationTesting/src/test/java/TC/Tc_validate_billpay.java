package TC;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base_Test.Browser_Invoke;
import Base_Test.Propertyfile;
import PO.PO_Bill_pay;

public class Tc_validate_billpay extends Browser_Invoke {
	

	@Test
	public void tc_transferfund_validate()
	{
		PO_Bill_pay po_bill_pay = PageFactory.initElements(driver,PO_Bill_pay.class);
		po_bill_pay.username(Propertyfile.getProperty("username"));
		po_bill_pay.password(Propertyfile.getProperty("passward"));
		po_bill_pay.signin();
		po_bill_pay.Bill_pay();
		po_bill_pay.Payee_Name(Propertyfile.getProperty("name"));
		po_bill_pay.Payee_Address(Propertyfile.getProperty("address"));
		po_bill_pay.Payee_City(Propertyfile.getProperty("city"));
		po_bill_pay.Payee_State(Propertyfile.getProperty("state"));
		po_bill_pay.Payee_zipcode(Propertyfile.getProperty("zipcode"));
		po_bill_pay.Payee_PhnNumber(Propertyfile.getProperty("phn"));
		po_bill_pay.Payee_Account_number(Propertyfile.getProperty("account4"));
		po_bill_pay.payee_verify_account(Propertyfile.getProperty("account3"));
		po_bill_pay.Ammount(Propertyfile.getProperty("amt"));
		po_bill_pay.From_Acoount(Propertyfile.getProperty("account5"));
		po_bill_pay.Send_Payment();
	}

}
