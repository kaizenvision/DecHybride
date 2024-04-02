package com.pomclasses;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hybrid.BaseClass;
import com.util.Utility;

public class AddUserPom extends BaseClass {
	
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")
	private WebElement addButton;
	@FindBy(xpath="(//div[@class='oxd-select-wrapper'])[1]")
	private WebElement userArrowRole;
	//Select UserRoll
	@FindBy(xpath="(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[1]")
	private WebElement userRole;
	@FindBy(xpath="//div/span[text()='Admin']")
	private WebElement AdminRole;
	@FindBy(xpath="//div/span[text()='ESS']")
	private WebElement ESSRole;
	
	@FindBy(xpath="//input[@placeholder='Type for hints...']")
	private WebElement EmpName;
	
	//select Status
	@FindBy(xpath="// status (//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[2]")
	private WebElement statusSelect;
	@FindBy(xpath="//div[text()='Enabled']")
	private WebElement EnabledStatus;
	@FindBy(xpath="//div[text()='Disabled']")
	private WebElement DisabledStatus;
	
	@FindBy(xpath="(//input[@class='oxd-input oxd-input--active'])[2]")
	private WebElement Adminusername2;
     
	@FindBy(xpath="// password (//input[@type='password'])[1]")
	private WebElement AdminPassword;

	@FindBy(xpath="//input[@type='password'])[2]")
	private WebElement Adminconfirmpassword;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement savebutton;
    
	@FindBy(xpath="//button[text()=' Cancel ']")
	private WebElement canclebutton;
	
	@FindBy(xpath="//a[text()='OrangeHRM, Inc']")
	private WebElement adminLink;
	
	
	public void adminAddButton( ) 
	{   
		Utility.elementClick(addButton);
	}

	public void AdminAdduserRole( String user_role) 
	{   
		Utility.getActionsclassObj().click(userArrowRole).build().perform();
		if(user_role.equalsIgnoreCase("Admin"))
			Utility.getActionsclassObj().moveToElement(AdminRole).click(AdminRole).build().perform();
		else
			Utility.getActionsclassObj().moveToElement(ESSRole).click(ESSRole).build().perform();
	}
	public void AdminAdduserEmpName( String username) 
	{   
		Utility.setText(username, EmpName);
	}
	public void AdminAddUserStatus() 
	{
		//act.click(statusSelect).moveToElement(EnabledStatus).click(EnabledStatus).build().perform();
		Utility.elementClick(DisabledStatus);
	}
	public void AdminPass( String password) 
	{   
		Utility.setText(password,AdminPassword);
	}
	public void AdminConfirmPass(String confirmpassword ) 
	{   
        Utility.setText(confirmpassword, Adminconfirmpassword);
	}
	public void AdminSaveButton( ) 
	{   
		 Utility.elementClick(savebutton);
	}
	public void AdminCancleButton( ) 
	{   
		 Utility.elementClick(canclebutton);
	}
	public void AdminLink( ) 
	{   
		 Utility.elementClick(adminLink);
	}
	


}
