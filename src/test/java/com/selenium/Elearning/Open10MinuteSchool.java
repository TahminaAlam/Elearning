package com.selenium.Elearning;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Open10MinuteSchool extends BaseDriver{
		
	    String URL = "https://10minuteschool.com/"; 
	    
		@Test
		public void RegistrationTest() throws InterruptedException {
			driver.get(URL); //Get the URL
			driver.manage().window().maximize(); //maximize the window
//			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));  //wait for a 5 seconds of time before throwing an exception
			Thread.sleep(5000);
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			//Scroll down till the bottom of the page
			js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
			Thread.sleep(2000);
			
			// Scroll to the top of the page
	        JavascriptExecutor js1 = (JavascriptExecutor) driver;
	        js.executeScript("window.scrollTo(0, 0);");
	        Thread.sleep(2000);
	        
			WebElement Language = driver.findElement(By.xpath("//body/main[1]/div[1]/div[1]/div[4]/div[1]/span[2]"));
			Language.click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
			
			WebElement HelpLine = driver.findElement(By.xpath("//span[contains(text(),'16910')]"));
			HelpLine.click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
			
//			Alert alert = driver.switchTo().alert();
//			String alertText = alert.getText();
//	        System.out.println("Alert text is: " + alertText);
//			alert.dismiss();



		}

	}
