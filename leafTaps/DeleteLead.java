package leafTaps;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) {
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
		//Click the "Leads" link.
		driver.findElement(By.xpath("//a[@href='/crmsfa/control/leadsMain']")).click();
		//Click "Find leads." 
		driver.findElement(By.xpath("//a[@href='/crmsfa/control/findLeads']")).click();
		//Click on the "Phone" tab.
		driver.findElement(By.xpath("(//em[@class='x-tab-left'])[2]")).click();
		//Enter the phone number.
		driver.findElement(By.name("1234567890")).sendKeys("1234567890");
		//Click the "Find leads" button.
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		//Capture the lead ID of the first resulting lead.
		String leadid = driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).getText();
		System.out.println(leadid);
		//Click the first resulting lead.
		driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).click();
		//Click the "Delete" button.
		driver.findElement(By.xpath("subMenuButtonDangerous")).click();
		//Click "Find leads" again.
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		//Enter the captured lead ID.
		driver.findElement(By.name("id")).sendKeys(leadid);
		//Click the "Find leads" button.
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		//Verify the presence of the message "No records to display" in the Lead List. This message confirms the successful deletion.
		String noRecordstext=driver.findElement(By.xpath("//div[text()='No records to display']")).getText();
		if(noRecordstext.contains("No records to display")) {
			System.out.println("Record Successfully Deleted");
		}else {System.out.println("Record Not Deleted");
			
				}
	}

}
