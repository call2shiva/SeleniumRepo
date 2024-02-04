package leafTaps;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		// Launching the Chrome Browser
				ChromeDriver driver = new ChromeDriver();
				// Maximizing the Chrome Browser Window
				driver.manage().window().maximize();
				// Loading the URL
				driver.get("http://leaftaps.com/opentaps/control/main");
				// Enter UserName
				driver.findElement(By.id("username")).sendKeys("demosalesmanager");
				// Enter Password
				driver.findElement(By.id("password")).sendKeys("crmsfa");
				// Click Login Button
				driver.findElement(By.className("decorativeSubmit")).click();
				// Click CRM/SFA
				driver.findElement(By.linkText("CRM/SFA")).click();
				// Click on Create Lead. 
				driver.findElement(By.linkText("Create Lead")).click();
				//Enter the CompanyName Field Using Xpath. 
				driver.findElement(By.xpath("(//input[@name='companyName'])[2]")).sendKeys("Prodx");
				//Enter the FirstName Field Using Xpath.
				driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Sivaganesh");
				//Enter the LastName Field Using Xpath.
				driver.findElement(By.xpath("(//input[@name='lastName'])[3]")).sendKeys("Lingadurai");
				//Enter the FirstName (Local) Field Using Xpath.
				driver.findElement(By.xpath("//input[@name='firstNameLocal']")).sendKeys("Siva");
				//Enter the Department Field Using any Locator of Your Choice.
				driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Software Testing");
				//Enter the Description Field Using any Locator of your choice.
				driver.findElement(By.id("createLeadForm_description")).sendKeys("Lead Creation");
				//Enter your email in the E-mail address Field using the locator of your choice.
				driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("test@testleaf.com");
				//Select State/Province as NewYork Using Visible Text.
				WebElement generalState = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
				Select generalStateDropDown = new Select(generalState);
				generalStateDropDown.selectByVisibleText("New York");
				//Click on the Create Button
				driver.findElement(By.id("smallSubmit")).click();
				Thread.sleep(5000);
				//Click on the edit button.
				driver.findElement(By.linkText("Edit")).click();
				//Clear the Description Field. 
				driver.findElement(By.id("updateLeadForm_description")).sendKeys(Keys.CLEAR);
				//Fill the Important Note Field with Any text.
				driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Edited the Lead");
				//Click on the update button.
				driver.findElement(By.xpath("//input[@name='submitButton']")).click();
				//Get the Title of the Resulting Page.
				String pagetitle=driver.getTitle();
				System.out.println(pagetitle);
				//Close the browser window.
				driver.close();
				
		
	}

}
