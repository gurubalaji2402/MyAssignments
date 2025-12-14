package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LeaftapLogin {

	public static void main(String[] args) {
		
		//Guest Mode starts Chrome with:
//		No saved login sessions
//		No cookies
//		No cache
//		No extensions
//		No browser history
//		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--guest");
		
		//Initialize the; WebDriver (ChromeDriver).
		ChromeDriver driver=new ChromeDriver(option);
		
		//Load the URL 
		driver.get("http://leaftaps.com/opentaps/control/main");
		//Maximize the browser window
		driver.manage().window().maximize();
		//Enter a username and password
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		
		//create account
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.className("inputBox")).sendKeys("guru");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		driver.findElement(By.name("numberEmployees")).sendKeys("10");
		driver.findElement(By.className("smallSubmit")).click();
		System.out.println(driver.getTitle());
		driver.quit();		
		
		
		
}

}
