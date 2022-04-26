package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NTCreateAccount {

	public static void main(String[] args) {
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
		driver.findElement(By.id("currencyUomId")).sendKeys("INR");
		driver.findElement(By.name("description")).sendKeys("NRI Account");
		driver.findElement(By.xpath("//input[@id='groupNameLocal']")).sendKeys("pra");
		driver.findElement(By.xpath("//input[@id='officeSiteName']")).sendKeys("viji");
		driver.findElement(By.xpath("//td[@class='titleCell']/span[contains(text(),'Annual Revenue')]/following::input[@class='inputBox'][1]")).sendKeys("10000");
		driver.findElement(By.xpath("//input[@value='Create Account']")).click();
		System.out.println(driver.findElement(By.xpath("//div[@class='centerarea']/div[@class='messages']")).getText());
		driver.close();
		
		
	}

}
