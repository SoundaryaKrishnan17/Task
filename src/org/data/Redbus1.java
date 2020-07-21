package org.data;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redbus1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Soundharya\\eclipse-workspace\\Task\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		
		WebElement date = driver.findElement(By.id("onward_cal"));
		date.click();
		
		WebElement table = driver.findElement(By.tagName("table"));
		
		List<WebElement> tRows = table.findElements(By.tagName("tr"));
	    for (WebElement x : tRows) {

	   List<WebElement> tData = table.findElements(By.tagName("td"));
	    	 for (WebElement v : tData) {
	    		  String text = v.getText();
	    		 System.out.println(text);
	    		 if(text.equals("30")) {
	    			 v.click();
	    			 break;
	    		 }
	    	 }
}
	    
	}
}

