package com.selenium.Elearning;

import java.time.Duration;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TenMinuteSchool extends BaseDriver{
		
	    String URL = "https://10minuteschool.com/"; 
	    
		@Test
		public void Test() throws InterruptedException {
			driver.get(URL); //Get the URL
			driver.manage().window().maximize(); //maximize the window
//			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));  //wait for a 5 seconds of time before throwing an exception
			Thread.sleep(5000);
			
			//Scroll down till the bottom of the page
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
			Thread.sleep(2000);
			
			// Scroll to the top of the page
	        js.executeScript("window.scrollTo(0, 0);");
	        Thread.sleep(2000);
	        
	        //Search for free course
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
			
			//Scroll down till the bottom of the page
			js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
			Thread.sleep(2000);
			
			// Scroll to the top of the page
	        js.executeScript("window.scrollTo(0, 0);");
	        Thread.sleep(2000);

	        //Go to home
	        WebElement GoToHome = driver.findElement(By.xpath(" //body/main[1]/div[1]/div[1]/div[2]/a[1]/div[1]/img[1]"));
	        GoToHome.click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
			
			//Course Six to twelve
			WebElement SixToTwelve = driver.findElement(By.xpath("//body/main[1]/div[1]/div[1]/nav[1]/ul[1]/li[1]"));
			SixToTwelve.click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
			
			//Randomly selete a item
			List<WebElement> options = driver.findElements(By.xpath("//body/main[1]/div[1]/div[1]/nav[1]/ul[1]/li[1]"));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
			Random rand = new Random();
			int list= rand.nextInt(options.size());
			options.get(list).click();
			Thread.sleep(3000);

			//Scroll down till the bottom of the page
			js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
			Thread.sleep(2000);
			
			// Scroll to the top of the page
	        js.executeScript("window.scrollTo(0, 0);");
	        Thread.sleep(2000);
            
	        //Go to home
	        GoToHome.click();
	        Thread.sleep(3000);
			
			//Open skills
			WebElement skills = driver.findElement(By.xpath("//body/main[1]/div[1]/div[1]/nav[1]/ul[1]/li[2]/div[1]/div[1]/a[1]"));
			skills.click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
			
			//Randomly selete a item
			List<WebElement> options1 = driver.findElements(By.xpath("//body/main[1]/div[1]/div[1]/nav[1]/ul[1]/li[2]/div[1]/div[1]/a[1]"));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
			Random rand1 = new Random();
			int list1= rand1.nextInt(options1.size());
			options1.get(list1).click();
			Thread.sleep(3000);
			
			//Scroll down till the bottom of the page
			js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
			Thread.sleep(2000);
			
			// Scroll to the top of the page
	        js.executeScript("window.scrollTo(0, 0);");
	        Thread.sleep(2000);

	        //Go to home
	        GoToHome.click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
			
			//change language
			WebElement Language = driver.findElement(By.xpath("//body/main[1]/div[1]/div[1]/div[4]/div[1]/span[2]"));
			Language.click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
			
//			WebElement HelpLine = driver.findElement(By.xpath("//span[contains(text(),'16910')]"));
//			HelpLine.click();
//			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
			
//			Alert alert = driver.switchTo().alert();
//			String alertText = alert.getText();
//	        System.out.println("Alert text is: " + alertText);
//			alert.dismiss();



		}

	}
