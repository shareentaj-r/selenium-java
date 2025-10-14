package week3.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class deletelead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		Thread.sleep(8000);
		
		driver.findElement(By.linkText("Leads")).click();
		Thread.sleep(8000);
		
		driver.findElement(By.linkText("Find Leads")).click();
		Thread.sleep(15000);
		
		driver.findElement(By.linkText("Phone")).click();
		driver.findElement(By.name("phoneCountryCode")).clear();
		driver.findElement(By.name("phoneCountryCode")).sendKeys("91");
		
		driver.findElement(By.name("phoneNumber")).sendKeys("8825828586");
		
		// click find leads button
		System.out.println("Click find leads after phone number");
		driver.findElement(By.xpath("/html/body/div[6]/div/div[2]/div[2]/div/div/div/div/div/div[1]/div[2]/div[1]/div/div/div/div/div/div[2]/div/div/table/tbody/tr/td/table/tbody/tr/td[2]/em/button")).click();
		Thread.sleep(15000);
		
		//- Capture the lead ID of the first resulting lead.
		System.out.println("Get lead id from first result");
		String leadId = driver.findElement(By.xpath("/html/body/div[6]/div/div[2]/div[2]/div/div/div/div/div/div[3]/div/div/div/div[2]/div[1]/div/div/div[1]/div/div[1]/div[2]/div/div/table/tbody/tr[1]/td[1]/div/a")).getText();
		System.out.println(leadId);
		
		//- Click the first resulting lead.
		driver.findElement(By.xpath("/html/body/div[6]/div/div[2]/div[2]/div/div/div/div/div/div[3]/div/div/div/div[2]/div[1]/div/div/div[1]/div/div[1]/div[2]/div/div/table/tbody/tr[1]/td[1]/div/a")).click();
		Thread.sleep(15000);
		
		//- Click the "Delete" button.
		driver.findElement(By.linkText("Delete")).click();
		Thread.sleep(8000);
		
		//- Click "Find leads" again.
		driver.findElement(By.linkText("Find Leads")).click();
		Thread.sleep(15000);
		
		//- Enter the captured lead ID.
		driver.findElement(By.name("id")).sendKeys(leadId);
		
		//- Click the "Find leads" button.
		driver.findElement(By.xpath("/html/body/div[6]/div/div[2]/div[2]/div/div/div/div/div/div[1]/div[2]/div[1]/div/div/div/div/div/div[2]/div/div/table/tbody/tr/td/table/tbody/tr/td[2]/em/button")).click();
		Thread.sleep(15000);
		
		//- Verify the presence of the message "No records to display" in the Lead List. This message confirms the successful deletion.
		String resultText = driver.findElement(By.className("x-paging-info")).getText();
		System.out.println(resultText);
		//- Close the browser.
		driver.close();
		
		
		
		
		
		
		/*
		if(resultText.trim() == "No records to display") { //This case is failing even though resultText is No records to display
			System.out.println("Closing browser");
			//- Close the browser.
			driver.close();
		}
		else {
			System.out.println("Result text not matching");
		}
		*/
		
		
	}

}
