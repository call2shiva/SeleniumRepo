package leafTaps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

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
		// Click Create Lead
		driver.findElement(By.linkText("Create Lead")).click();
		// Enter Company Name
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Prodx");
		// Enter First Name
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sivaganesh");
		// Enter Last Name
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Lingadurai");
		// Select Employee in the source dropdown (using index)
		WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select sourceDropDown = new Select(source);
		sourceDropDown.selectByIndex(4);
		// Select Automobile in the Marketing Campaign (using visibleText)
		WebElement marketingCampaign = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select marketingCampaignDropDown = new Select(marketingCampaign);
		marketingCampaignDropDown.selectByVisibleText("Automobile");
		// Select Corporation in Ownership (using value)
		WebElement ownership = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select ownershipDropDown = new Select(ownership);
		ownershipDropDown.selectByValue("OWN_CCORP");
		// Click CreateLead
		driver.findElement(By.name("submitButton")).click();
		// Verify the title of the current web page.
		String title = driver.getTitle();
		System.out.println(title);
		if (title.contains("View Lead")) {
			System.out.println("Webpage Verifed");
		} else {
			System.out.println("Webpage Verification Failed");
		}
		// Close Browser
		//driver.close();

	}

}
