package org.data;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redbus {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Soundharya\\eclipse-workspace\\Task\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		
		WebElement date = driver.findElement(By.id("onward_cal"));
		date.click();
		
		WebElement table = driver.findElement(By.tagName("table"));
		
	    List<WebElement> tRows = table.findElements(By.tagName("tr"));
	    for (int i = 0; i < tRows.size(); i++) {
	    	 List<WebElement> tData = tRows.get(i).findElements(By.tagName("td"));
	    	 for (int j = 0; j < tData.size(); j++) {
	    		 String text = tData.get(j).getText();
	    		 System.out.println(text);
	    	 }
	    	
	    }

}
}
