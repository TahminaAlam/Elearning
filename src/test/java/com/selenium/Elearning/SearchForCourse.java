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
		        
		        //Back to previous page
		        driver.navigate().back();
		    	Thread.sleep(2000);

		    	driver.navigate().back();
		    	Thread.sleep(2000);
		        
		        WebElement SearchforIELTS = driver.findElement(By.xpath("//body/main[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/input[1]"));
		        SearchforIELTS.clear();
		        SearchforIELTS.sendKeys("IELTS");
		        SearchforIELTS.sendKeys(Keys.ENTER);
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

//				WebElement ClickToJob = driver.findElement(By.xpath("//input[@id='Filter by-jobs-prep']"));
//				ClickToJob.click();
//				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
//				
//				WebElement ClickToSpokenEnglish = driver.findElement(By.xpath("//h2[contains(text(),'ঘরে বসে Spoken English')]"));
//				ClickToSpokenEnglish.click();
//				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
//				
//				WebElement ScrollToCourseInstractor = driver.findElement(By.xpath("//h2[contains(text(),'Course instructor')]"));
//				action.moveToElement(ScrollToCourseInstractor).perform();
//				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
//				
//				WebElement ScrollToWhatYouWillLearn = driver.findElement(By.xpath("//h2[contains(text(),'What you will learn by doing the course')]"));
//				action.moveToElement(ScrollToWhatYouWillLearn).perform();
//				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
//				
//				WebElement ScrollToCourseDetails1 = driver.findElement(By.xpath("//body/main[1]/div[3]/main[1]/section[1]/div[1]/div[2]/div[6]/div[1]/div[1]/div[1]/h2[1]"));
//				action.moveToElement(ScrollToCourseDetails1).perform();
//				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
//				
//				WebElement Shrink = driver.findElement(By.xpath("//body/main[1]/div[3]/main[1]/section[1]/div[1]/div[2]/div[6]/div[1]/div[1]/div[1]/div[1]/details[1]/summary[1]"));
//				action.moveToElement(Shrink).click();
//				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
//				
//				WebElement ScrollToContentPreview = driver.findElement(By.xpath("//h2[contains(text(),'Content preview')]"));
//				action.moveToElement(ScrollToContentPreview).perform();
//				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
//				
				
			}

		}

