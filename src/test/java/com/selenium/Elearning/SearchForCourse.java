package com.selenium.Elearning;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class SearchForCourse extends BaseDriver{
			
		    String URL = "https://10minuteschool.com/"; 
		    
			@Test
			public void Test() throws InterruptedException {
				driver.get(URL); //Get the URL
				driver.manage().window().maximize(); //maximize the window
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));  //wait for a 5 seconds of time before throwing an exception
		        
				WebElement Search = driver.findElement(By.xpath("//body/main[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/input[1]"));
				Search.sendKeys("Free Courses");
				Search.sendKeys(Keys.ENTER);
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
				
				
				WebElement SelectCourse = driver.findElement(By.xpath("//h2[contains(text(),'English for Everyday')]"));
				Actions action = new Actions(driver);
				action.moveToElement(SelectCourse).perform();
				SelectCourse.click();
				Thread.sleep(3000);
				
				JavascriptExecutor js = (JavascriptExecutor) driver;
				//Scroll down till the bottom of the page
				js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
				Thread.sleep(2000);
				
				// Scroll to the top of the page
		        JavascriptExecutor js1 = (JavascriptExecutor) driver;
		        js.executeScript("window.scrollTo(0, 0);");
		        Thread.sleep(2000);

		        WebElement GoToHome = driver.findElement(By.xpath(" //body/main[1]/div[1]/div[1]/div[2]/a[1]/div[1]/img[1]"));
		        GoToHome.click();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		     
			}

		}

