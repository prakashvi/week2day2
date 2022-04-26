package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindAccount {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
//		 Launch URL "http://leaftaps.com/opentaps/control/login"
		driver.get("http://leaftaps.com/opentaps/control/login");
//		 Enter UserName and Password Using Id Locator
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
//		Click on Login Button using Class Locator
		driver.findElement(By.className("decorativeSubmit")).click();
//		Click on CRM/SFA Link
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.xpath("//ul[@class='shortcuts']/li[2]/a")).click();
		driver.findElement(By.xpath("//div[@class='frameSectionBody']/ul[1]/li[3]/a")).click();
		driver.findElement(By.xpath("//input[@id='ext-gen27']")).sendKeys("credit limited account");
		driver.findElement(By.xpath("//td[@class='x-btn-center']//button[contains(text(),'Find Account')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-groupName']/a")).click();
		driver.findElement(By.xpath("//div[@class='frameSectionExtra']/a[contains(text(),'Edit')]")).click();
		String text = driver.findElement(By.xpath("//table[@class='fourColumnForm']/tbody/tr[1]/td[2]/input"))
				.getAttribute("value");
		System.out.println(text.equalsIgnoreCase("Credit Limited Account"));
		String text2 = driver.findElement(By.xpath("//textarea[@name='description']")).getText();
		System.out.println(text2.equalsIgnoreCase("Sales account with a credit limit of $100 USD"));
		
		
	}

}
