package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnSeleniumBasics1 {
	public static void main (String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		WebElement elementUsername = driver.findElement(By.id("username"));
		elementUsername.sendKeys("Demosalesmanager");
		
	    WebElement elementPassword = driver.findElement(By.id("password"));
		elementPassword.sendKeys("crmsfa");
		
			
		WebElement elementLogin = driver.findElement(By.className("decorativeSubmit"));
		elementLogin.click();
		
		WebElement elementWelcomeMessage = driver.findElement(By.tagName("h2"));
		String text = elementWelcomeMessage.getText();
		System.out.println(text);
		
		WebElement elementCRMSFA = driver.findElement(By.linkText("CRM/SFA"));
		elementCRMSFA.click();
		
		WebElement elementLeads = driver.findElement(By.linkText("Leads"));
		elementLeads.click();
		
		WebElement elementCreateLead = driver.findElement(By.linkText("Create Lead"));
		elementCreateLead.click();
		
		WebElement elementCompanyName = driver.findElement(By.id("createLeadForm_companyName"));
		elementCompanyName.sendKeys("Leaftest");
		
		WebElement elementFirstName = driver.findElement(By.id("createLeadForm_firstName"));
		elementFirstName.sendKeys("Princy");
		
		WebElement elementLastName = driver.findElement(By.id("createLeadForm_lastName"));
		elementLastName.sendKeys("Theresal");
		
		WebElement elementSourceDD = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select dd = new Select(elementSourceDD);
		dd.selectByIndex(4);
		
		WebElement elementCampaignId = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select dd1 = new Select(elementCampaignId);
		dd1.selectByIndex(2);
		
		WebElement elementEnumId = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select dd2 = new Select(elementEnumId);
		dd2.selectByVisibleText("Finance");
		
		//WebElement elementEnumID = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		//Select dd3 = new Select(elementEnumID);
		//dd3.selectByValue("OWN_PARTNERSHIP");
		
	    WebElement elementEnumID = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select dd3 = new Select(elementEnumID);
		dd3.selectByVisibleText("Partnership");
		
		
		WebElement elementfirstNameLocal = driver.findElement(By.id("createLeadForm_firstNameLocal"));
		elementfirstNameLocal.sendKeys("Princy");
		
		WebElement elementdepartmentName = driver.findElement(By.id("createLeadForm_departmentName"));
		elementdepartmentName.sendKeys("Finance");
		
		
		WebElement elementDescription = driver.findElement(By.id("createLeadForm_description"));
		elementDescription.sendKeys("Loveyourself");
		
		WebElement elementPrimaryEmail = driver.findElement(By.id("createLeadForm_primaryEmail"));
		elementPrimaryEmail.sendKeys("princy11@gmail.com");
		
		WebElement elementgeneralState = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select dd4 = new Select(elementgeneralState);
		dd4.selectByVisibleText("New York");
		
		
		WebElement elementcreatebutton = driver.findElement(By.className("smallSubmit"));
		elementcreatebutton.click();
		
		//WebElement elementsubmitButton = driver.findElement(By.name("submitButton"));
		//elementsubmitButton.click();
		
		System.out.println("The title is:"+ driver.getTitle());
		
		if(driver.getTitle().contains("Testlleaf")) {
			System.out.println("I confirm the tittle has testleaf");
		} else
		 System.out.println("The tittle does not have the word testleaf");
			
		}
		
					
	
			
		
		
		
		
		
	}


