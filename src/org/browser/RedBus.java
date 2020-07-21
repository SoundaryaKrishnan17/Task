package org.browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBus {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Soundharya\\eclipse-workspace\\Task\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		
		WebElement sourceCity = driver.findElement(By.xpath("//input[@data-message='please enter a source city']//"));
		sourceCity.sendKeys("Banglore");
		String attText = sourceCity.getAttribute("value");
		System.out.println(attText);
		
		WebElement destCity = driver.findElement(By.xpath("//input[@data-message='please enter a destination']//"));
		destCity.sendKeys("Chennai");
				
		WebElement searchButtn = driver.findElement(By.id("searchbuttn"));
		searchButtn.click();
		WebElement busTicket = driver.findElement(By.xpath("//0[@ref='https://www.redbus.in/bus-tickets']//"));
        String text = busTicket.getText();
        System.out.println(text);
	}
	

}
