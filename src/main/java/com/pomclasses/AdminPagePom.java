package com.pomclasses;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hybrid.BaseClass;
import com.util.Utility;

public class AdminPagePom extends BaseClass{

	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//button[@role='none']") 
	private WebElement Arrow;

	@FindBy(xpath="//span[text()='Job ']") 
	private WebElement job;

	@FindBy(xpath="(//a[@class='oxd-topbar-body-nav-tab-link'])[1]") 
	private WebElement jobTitles;

	@FindBy(xpath="//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")
	private WebElement Add;

	@FindBy(xpath="(//input[@class='oxd-input oxd-input--active'])[2]") 
	private WebElement AddJobTitle;

	@FindBy(xpath="//textarea[@placeholder='Type description here']") 
	private WebElement JobDescription;

	@FindBy(xpath="//textarea[@placeholder='Add note']") 
	private WebElement AddNote;

	@FindBy(xpath="//button[@type='submit']") 
	private WebElement Submit;

	@FindBy(xpath = "//span[text()='Admin']")
	private WebElement adminlink;

	
	public void openAdminPage() {
		adminlink.click();
	}
	
	public void Arrow()
	{
		//Utility.elementClick(Arrow);
		Arrow.click();
	}


	public void job()
	{
		//Utility.elementClick(job);
		job.click();
	}

	public void jobTitles()
	{
		//Utility.elementClick(jobTitles);
		jobTitles.click();
	}

	public void Add()
	{
		//Utility.elementClick(Add);
		Add.click();
	}

	public void AddJobTitle()
	{
		//Utility.setText(value, AddJobTitle);
		AddJobTitle.sendKeys("DataAnalyst");
	}

	public void JobDescription()
	{
		//Utility.setText(value, JobDescription);
		JobDescription.sendKeys("Data Analyst");
	}

	public void AddNote()
	{
		AddNote.sendKeys("Data_Analyst");
	}

	public void submit()
	{
		//Utility.elementClick(Submit);
		Submit.click();
	}

}