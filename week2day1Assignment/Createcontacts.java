package week2day1Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Createcontacts {
public static void main(String[] args) throws InterruptedException {
	//Launch the browser
	
	ChromeDriver driver=new ChromeDriver(); 
	
	 //Load the url http://leaftaps.com/opentaps/control/login
	driver.get("http://leaftaps.com/opentaps/control/login");

	//Maximize the browser
	driver.manage().window().maximize();
	
	//Enter Username

	driver.findElement(By.id("username")).sendKeys("demosalesmanager");
	 //Find the element password Enter the password
	
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	Thread.sleep(1000);
	 //Click Login button
	driver.findElement(By.className("decorativeSubmit")).click();
	
	 //Click on CRM/SFA
	driver.findElement(By.linkText("CRM/SFA")).click();
	
	//Click on contacts
	driver.findElement(By.linkText("Contacts")).click();
	
	//Click on create contact
	driver.findElement(By.linkText("Create Contact")).click();
	
	//Create First name
	driver.findElement(By.id("firstNameField")).sendKeys("Samuel");
	//create last name
	driver.findElement(By.id("lastNameField")).sendKeys("lawrence");
	//click create contact button
	driver.findElement(By.className("smallSubmit")).click();
	
	//Print the first name and browser title
	
	System.out.println("Firstname:samuel");
	String title= driver.getTitle();
	System.out.println(title);
	
	
}
}
