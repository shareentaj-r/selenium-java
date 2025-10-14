package week3.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import java.lang.Thread; // Import statement for Thread class

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException  {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@id=\"createLeadForm_companyName\"]")).sendKeys("Shareen Co");
		driver.findElement(By.xpath("//input[@id=\"createLeadForm_firstName\"]")).sendKeys("Shareentaj");
		driver.findElement(By.xpath("//input[@id=\"createLeadForm_lastName\"]")).sendKeys("R");
		driver.findElement(By.xpath("//input[@id=\"createLeadForm_firstNameLocal\"]")).sendKeys("ST");
		
		driver.findElement(By.xpath("//input[@id=\"createLeadForm_departmentName\"]")).sendKeys("QA");
		driver.findElement(By.xpath("//textarea[@id=\"createLeadForm_description\"]")).sendKeys("Automation Test Engineer");
		
		driver.findElement(By.xpath("//input[@id=\"createLeadForm_primaryEmail\"]")).sendKeys("st_test@gmail.com");
		driver.findElement(By.xpath("//select[@id=\"createLeadForm_generalStateProvinceGeoId\"]")).sendKeys("New York");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(10000);
		
		driver.findElement(By.linkText("Edit")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//textarea[@id=\"updateLeadForm_description\"]")).clear();
		driver.findElement(By.xpath("//textarea[@id=\"updateLeadForm_importantNote\"]")).sendKeys("Some notes");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(10000);
		
		
		
		String CompanyName="Testleaf";
	}

}
