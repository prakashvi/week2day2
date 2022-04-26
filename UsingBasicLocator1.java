package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UsingBasicLocator1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		System.out.println(driver.findElement(By.tagName("h2")).getText());
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("SZ Technolgy");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Prakash");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Viji");
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		System.out.println(driver.findElement(By.xpath("//span[@id='viewLead_companyName_sp']")).getText());
		System.out.println(driver.getTitle());
		driver.close();
	}

}
