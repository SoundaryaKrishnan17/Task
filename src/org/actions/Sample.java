package org.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sample {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Soundharya\\eclipse-workspace\\welcome\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.gettyimages.in/");
		
		WebElement image = driver.findElement(By.xpath("(//a[text()='EDITORIAL'])[1]"));
		image.click();
		
		WebElement ele = driver.findElement(By.xpath("(//a[text()='CREATIVE'])[1]"));
		
		Actions acc = new Actions(driver);
		acc.moveToElement(ele).perform();
		
		

}
}
