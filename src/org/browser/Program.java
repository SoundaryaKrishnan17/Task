package org.browser;
import java.io.File;
import java.util.List;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Program {
	
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Soundharya\\eclipse-workspace\\welcome\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://m.snapdeal.com/");
        driver.manage().window().maximize();
        
        driver.findElement(By.name("keyword")).sendKeys("redmi phone");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[@class='searchTextSpan']")).click();
        File f = new File("C:\\Users\\Soundharya\\Documents\\Excel files.Excelphone.xlsx");
        Workbook w = new XSSF
        List<WebElement> ele = driver.findElements(By.xpath("//p[@class='product-title ']"));
          for (WebElement x : ele) {
        	  String text = x.getText();
        	  System.out.println(text);
          }
        
        
        
        
	}

}
