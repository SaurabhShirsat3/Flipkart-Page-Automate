package com.config;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Config2 {

	
WebDriver driver;  //instance member
	
	public void browserSetting(String url) {    //browserSetting method
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
	 driver = new ChromeDriver();  // we made "Webdriver" instance memeber alredy in the above so we write sipmply 'driver'
	 driver.get(url);
	 
	 assert driver.getTitle().contains("Flipkart") : "Homepage failed to load";

     System.out.println("Homepage loaded successfully");
	 
	
	
	}
	public void FlipkartAutomate() {
		
	driver.findElement(By.name("q")).sendKeys("Laptop");
	driver.findElement(By.name("q")).submit();
		}
	
	public void addToCart() {
		
		
				driver.findElement(By.xpath("//*[@id=\"container\"]")).click();
	
				Set<String> handles = driver.getWindowHandles();
				Iterator it = handles.iterator();
				
				String parentid = (String) it.next();
				String childid = (String) it.next();
				
				driver.switchTo().window(childid);
				driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[1]/button")).click();
				
			}
	
	 // Click on "Proceed to Place order" button
	public void PlaceOrder() {
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div[1]/div/div[3]/div/form/button/span")).click();
		
	}
	public void Login() {
		
		 // Enter valid credentials and log in
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")).sendKeys("your_username");
        driver.findElement(By.name("Request OTP")).click();

        // Verify that the user is successfully logged in
        WebElement loggedInUser = driver.findElement(By.cssSelector("span[data-tracking-id='USER']"));
        String loggedInUserName = loggedInUser.getText();

        if (!loggedInUserName.isEmpty()) {
            System.out.println("User successfully logged in: " + loggedInUserName);
        } else {
            System.out.println("Login failed.");
        }

        // Close the browser
        driver.quit();)
	}
	
	

}
