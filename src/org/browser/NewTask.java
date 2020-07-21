package org.browser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTask {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Soundharya\\eclipse-workspace\\Task\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/web-table-element.php");
		
		
		WebElement table = driver.findElement(By.tagName("table"));
		List<WebElement> tRows = table.findElements(By.tagName("tr"));
	    for (WebElement x : tRows) {

	   List<WebElement> tData = tRows.get(24).findElements(By.tagName("td"));
	         for (int i=0; i<tData.size(); i++) {
	        	 String text = tData.get(i).getText();
	        	 System.out.println(text);
	         }
	    	 for (WebElement v : tData) {
	    		  String text = v.getText();
	    		 System.out.println(text);
	    		 if(text.equals("Corporation Bank")) {
	    			 v.click();
	    			 break;
	    			 
	    		 }
	    	 }
}
	    
	}
}


	    
	   
	    


