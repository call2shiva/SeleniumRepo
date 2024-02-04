package leafTaps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {
	public static void main(String[] args) {

		// * Initialize the WebDriver (ChromeDriver). Load the URL
		ChromeDriver driver = new ChromeDriver();

		// Maximize the browser window.
		driver.manage().window().maximize();

		// Load the URL http://leaftaps.com/opentaps/
		driver.get("http://leaftaps.com/opentaps");

		// Enter a username and password.
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");

		// Click the "Login" button.
		driver.findElement(By.className("decorativeSubmit")).click();

		// Click on the "CRM/SFA" link.
		driver.findElement(By.linkText("CRM/SFA")).click();

		// Click on the "Accounts" tab.
		driver.findElement(By.linkText("Accounts")).click();

		// Click on the "Create Account" button.
		driver.findElement(By.linkText("Create Account")).click();

		// Enter an account name.
		driver.findElement(By.id("accountName")).sendKeys("SivaganeshL");
		WebElement accountName = driver.findElement(By.id("accountName"));
		String actName = accountName.getAttribute("value");
		System.out.println(actName);

		// Enter a description as "Selenium Automation Tester."
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester.");

		// Select "ComputerSoftware" as the industry.
		WebElement industry = driver.findElement(By.name("industryEnumId"));
		Select industryDropDown = new Select(industry);
		industryDropDown.selectByVisibleText("Computer Software");

		// Select "S Corporation" as ownership using SelectByVisibleText.
		WebElement ownership = driver.findElement(By.name("ownershipEnumId"));
		Select ownershipDropDown = new Select(ownership);
		ownershipDropDown.selectByVisibleText("S-Corporation");

		// Select "Employee" as the source using SelectByValue.
		WebElement source = driver.findElement(By.id("dataSourceId"));
		Select sourceDropDown = new Select(source);
		sourceDropDown.selectByValue("LEAD_EMPLOYEE");

		// Select "eCommerce Site Internal Campaign" as the marketing campaign using
		// SelectByIndex.
		WebElement marketingCampaign = driver.findElement(By.id("marketingCampaignId"));
		Select marketingCampaignDropDown = new Select(marketingCampaign);
		marketingCampaignDropDown.selectByIndex(6);

		// Select "Texas" as the state/province using SelectByValue.
		WebElement generalState = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select generalStateDropDown = new Select(generalState);
		generalStateDropDown.selectByValue("TX");

		// Click the "Create Account" button.
		driver.findElement(By.className("smallSubmit")).click();

		// Verify that the account name is displayed correctly.
		String actName1 = driver.findElement(By.xpath("(//span[@class='tabletext'])[3]")).getText();
		System.out.println(actName1);
		if (actName1.contains(actName)) {

			System.out.println("Account Name Displayed is Valid Name");
		} else {
			System.out.println("Account Name Displayed is Not Valid Name");
		}

		// Close the browser window.
		driver.close();
	}
}
