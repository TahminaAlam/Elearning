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
		        
				//Write on the search box
				WebElement Search = driver.findElement(By.xpath("//body/main[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/input[1]"));
				Search.sendKeys("Free Courses");
				Search.sendKeys(Keys.ENTER);
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
				
				//Select a course
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
		        js.executeScript("window.scrollTo(0, 0);");
		        Thread.sleep(2000);
		        
		        //Back to previous page
		        driver.navigate().back();
		    	Thread.sleep(2000);

		    	//Back to previous page
		    	driver.navigate().back();
		    	Thread.sleep(2000);
				
				WebElement Language = driver.findElement(By.xpath("//body/main[1]/div[1]/div[1]/div[4]/div[1]/span[2]"));
				Language.click();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		        
		    	//Clear previously written text and write new text
		        WebElement SearchforIELTS = driver.findElement(By.xpath("//body/main[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/input[1]"));
		        SearchforIELTS.click();
		        SearchforIELTS.clear();
		        SearchforIELTS.sendKeys("IELTS");
		        SearchforIELTS.sendKeys(Keys.ENTER);
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

				//Select a option
				WebElement ClickToJob = driver.findElement(By.xpath("//input[@id='Filter by-jobs-prep']"));
				ClickToJob.click();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
				
				//Click on spoken english
				WebElement ClickToSpokenEnglish = driver.findElement(By.xpath("//h2[contains(text(),'ঘরে বসে Spoken English')]"));
				ClickToSpokenEnglish.click();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
				
				//Scroll to element
				WebElement ScrollToCourseInstractor = driver.findElement(By.xpath("//h2[contains(text(),'Course instructor')]"));
				action.moveToElement(ScrollToCourseInstractor).perform();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
				
				//Scroll to element
				WebElement ScrollToWhatYouWillLearn = driver.findElement(By.xpath("//h2[contains(text(),'What you will learn by doing the course')]"));
				action.moveToElement(ScrollToWhatYouWillLearn).perform();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
				
				//Scroll to element
				WebElement ScrollToCourseDetails1 = driver.findElement(By.xpath("//body/main[1]/div[3]/main[1]/section[1]/div[1]/div[2]/div[6]/div[1]/div[1]/div[1]/h2[1]"));
				action.moveToElement(ScrollToCourseDetails1).perform();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
				
//				//Shirk the expended item
//				WebElement Shrink = driver.findElement(By.xpath("//b[contains(text(),\"About the 'Ghore Boshe Spoken English' course:\")]"));
//				Shrink.click();
//				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
				
				//Scroll to element
				WebElement ScrollToContentPreview = driver.findElement(By.xpath("//h2[contains(text(),'Content preview')]"));
				action.moveToElement(ScrollToContentPreview).perform();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
				
//				//Shirk the expended item
//				WebElement ShirnkContentPreview = driver.findElement(By.xpath("//h3[contains(text(),'ইংরেজি বলা শুরু করুন')]"));
//				ShirnkContentPreview.click();
//				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
				
				//Scroll to element
				WebElement ScrollToCourseCertificate = driver.findElement(By.xpath("//h2[contains(text(),'Course certificate')]"));
				action.moveToElement(ScrollToCourseCertificate).perform();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
				
				//Scroll to element
				WebElement ScrollToFrequentlyAskQuestions = driver.findElement(By.xpath("//h2[contains(text(),'Frequently Ask Questions')]"));
				action.moveToElement(ScrollToFrequentlyAskQuestions).perform();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
				
				//Scroll to top of the page
				js.executeScript("window.scrollTo(0, 0);");
			    Thread.sleep(4000);
			        
			    //Click on enroll button
				WebElement EnrollButton = driver.findElement(By.xpath("//body/main[1]/div[3]/div[1]/div[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[1]/button[1]"));
				EnrollButton.click();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
				
				//Start the procedure
				WebElement StartNow = driver.findElement(By.xpath("//body/app-root[1]/div[1]/div[1]/app-home[1]/div[1]/main[1]/app-checkout[1]/div[1]/div[1]/div[2]/div[2]/app-cart[1]/div[1]/div[2]/div[2]/button[1]"));
				StartNow.click();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
				
				//Go to home
		        WebElement GoToHome = driver.findElement(By.xpath("//body/app-root[1]/div[1]/div[1]/app-home[1]/div[1]/app-navbar[1]/div[1]/nav[1]/div[1]/div[2]/a[1]/img[1]"));
		        GoToHome.click();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));


			}

		}

