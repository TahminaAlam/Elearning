package pages;

import org.openqa.selenium.By;
import pages.BasePage;

public class SearchPage extends BasePage{
					
				    public String SearchUrl = "https://10minuteschool.com/"; 
				    public By SearchButton = By.xpath("//body/main[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/input[1]");
				    public By SelectCourse = By.xpath("//h2[contains(text(),'English for Everyday')]");
				    public By Language = By.xpath("//body/main[1]/div[1]/div[1]/div[4]/div[1]/span[2]");
				    public By SearchforIELTS = By.xpath("//body/main[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/input[1]");
				    public By ClickToJob = By.xpath("//input[@id='Filter by-jobs-prep']");
				    public By ClickToSpokenEnglish = By.xpath("//h2[contains(text(),'ঘরে বসে Spoken English')]");		
				    public By ScrollToCourseInstractor = By.xpath("//h2[contains(text(),'Course instructor')]");
				    public By ScrollToWhatYouWillLearn = By.xpath("//h2[contains(text(),'What you will learn by doing the course')]");
				    public By ScrollToCourseDetails1 = By.xpath("//body/main[1]/div[3]/main[1]/section[1]/div[1]/div[2]/div[6]/div[1]/div[1]/div[1]/h2[1]");
				    public By ScrollToContentPreview = By.xpath("//h2[contains(text(),'Content preview')]");
				    public By ScrollToCourseCertificate = By.xpath("//h2[contains(text(),'Course certificate')]");
				    public By ScrollToFrequentlyAskQuestions = By.xpath("//h2[contains(text(),'Frequently Ask Questions')]");
				    public By EnrollButton = By.xpath("//body/main[1]/div[3]/div[1]/div[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[1]/button[1]");
				    public By StartNow = By.xpath("//body/app-root[1]/div[1]/div[1]/app-home[1]/div[1]/main[1]/app-checkout[1]/div[1]/div[1]/div[2]/div[2]/app-cart[1]/div[1]/div[2]/div[2]/button[1]");
				    public By GoToHome = By.xpath("//body/app-root[1]/div[1]/div[1]/app-home[1]/div[1]/app-navbar[1]/div[1]/nav[1]/div[1]/div[2]/a[1]/img[1]");
                    public By Title = By.xpath("//body/main[1]/div[3]/div[1]/div[1]/div[1]/h1[1]");
                    public By ShirnkCourseDetails1stItem = By.xpath("//body/main[1]/div[3]/main[1]/section[1]/div[1]/div[2]/div[6]/div[1]/div[1]/div[1]/div[1]/details[1]/summary[1]");
                    public By GoToHome1 = By.xpath("//body/main[1]/div[1]/div[1]/div[1]/div[1]/a[1]/div[1]/img[1]");
                    public By CourseDetails2ndItem = By.xpath("//body[1]/main[1]/div[3]/main[1]/section[1]/div[1]/div[2]/div[6]/div[1]/div[1]/div[1]/div[1]/details[2]/summary[1]/div[1]/h2[1]");
				}

