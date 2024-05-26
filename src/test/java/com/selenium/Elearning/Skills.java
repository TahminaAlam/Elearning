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

public class Skills extends BaseDriver{
					
				    String URL = "https://10minuteschool.com/"; 
				    
					@Test
					public void Test() throws InterruptedException {
						driver.get(URL); //Get the URL
						driver.manage().window().maximize(); //maximize the window
						Thread.sleep(5000);
				        
						//Open skills
						WebElement skills = driver.findElement(By.xpath("//body/main[1]/div[1]/div[1]/nav[1]/ul[1]/li[2]/div[1]/div[1]/a[1]"));
						skills.click();
						driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
						
						//Randomly selete a item
						List<WebElement> options = driver.findElements(By.xpath("//body/main[1]/div[1]/div[1]/nav[1]/ul[1]/li[2]/div[1]/div[1]/a[1]"));
						driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
						Random rand = new Random();
						int list= rand.nextInt(options.size());
						options.get(list).click();
						Thread.sleep(3000);
					    
						//Click on bundle
						WebElement ClickOnBundle = driver.findElement(By.xpath("//body/main[1]/div[4]/div[1]/div[1]/div[1]/a[3]"));
						ClickOnBundle.click();
//						ClickOnBundle.click();
					    Thread.sleep(2000);
						
						JavascriptExecutor js = (JavascriptExecutor) driver;
//						//Scroll down till the bottom of the page
//						js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
//						Thread.sleep(2000);
//						
//						// Scroll to the top of the page
//				        js.executeScript("window.scrollTo(0, 0);");
//				        Thread.sleep(2000);
				        
//				        //Scroll to a course
//						WebElement ScrollToCourse = driver.findElement(By.xpath("//body/main[1]/div[4]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/a[1]/div[1]/div[2]"));
//						Actions action = new Actions(driver);
//						action.moveToElement(ScrollToCourse).perform();
//						ScrollToCourse.click();
//						Thread.sleep(3000);
						
				        //Click On Course
				        WebElement ClickOnCourse = driver.findElement(By.xpath("//body/main[1]/div[4]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/a[1]/div[1]"));
				        ClickOnCourse.click();
				        Thread.sleep(2000);

						//Scroll down till the bottom of the page
						js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
						Thread.sleep(2000);
						
						// Scroll to the top of the page
				        js.executeScript("window.scrollTo(0, 0);");
				        Thread.sleep(2000);
				        
				       //Click on enroll button
						WebElement EnrollButton = driver.findElement(By.xpath("//body/main[1]/div[3]/div[1]/div[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[1]/button[1]"));
						EnrollButton.click();
						driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
						
						
						//Start Now
						WebElement StartNow = driver.findElement(By.xpath("//body/app-root[1]/div[1]/div[1]/app-home[1]/div[1]/main[1]/app-checkout[1]/div[1]/div[1]/div[2]/div[2]/app-cart[1]/div[1]/div[2]/div[2]/button[1]"));
						StartNow.click();
						driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
						
						//Back to previous page
				    	driver.navigate().back();
				    	Thread.sleep(2000);
				        
						// Go Home	
				        WebElement GoToHome = driver.findElement(By.xpath(" //body/main[1]/div[1]/div[1]/div[2]/a[1]/div[1]/img[1]"));
				        GoToHome.click();
						driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
				     
					}

				}


