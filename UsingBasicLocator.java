package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UsingBasicLocator {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		System.out.println(driver.findElement(By.tagName("h2")).getText());
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("SZ Technolgy");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Prakash");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Viji");
		driver.findElement(By.className("smallSubmit")).click();
		System.out.println(driver.findElement(By.id("viewLead_companyName_sp")).getText());
		driver.close();
		}

}
