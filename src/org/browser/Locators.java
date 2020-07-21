package org.browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Soundharya\\eclipse-workspace\\Task\\driver\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://www.facebook.com/");
	    
	    WebElement userName = driver.findElement(By.id("email"));
	    userName.sendKeys("soundarya1496@gmailcom");
	    
	    WebElement passTxt = driver.findElement(By.name("pass"));
	    passTxt.sendKeys("9677901327");
	    
	    WebElement loginBtn = driver.findElement(By.id("loginbutton"));
        loginBtn.click();
        

}
}
