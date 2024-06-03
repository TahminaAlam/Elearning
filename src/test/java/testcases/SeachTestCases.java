package testcases;

import org.testng.annotations.Test;

import pages.BasePage;
import pages.SearchPage;
import utilities.BaseDriver;

public class SeachTestCases extends BaseDriver{
				
	          BasePage basePage = new BasePage();
			  SearchPage searchPage = new SearchPage();
			    
				@Test
				public void TestsearchPage() throws InterruptedException {
					getDriver().get(searchPage.SearchUrl);
					try {
						Thread.sleep(10000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
					searchPage.clickOnElement(searchPage.Language, 2000);
					searchPage.writeText(searchPage.SearchButton, 2000, "IELTS");
					searchPage.Enter(searchPage.SearchButton, 2000);
					searchPage.clickOnElement(searchPage.ClickToJob, 2000);
					searchPage.clickOnElement(searchPage.ClickToSpokenEnglish, 2000);
					searchPage.scrollToElement(searchPage.ScrollToCourseInstractor, 2000);		
					searchPage.scrollToElement(searchPage.ScrollToWhatYouWillLearn, 2000);
					searchPage.scrollToElement(searchPage.ScrollToCourseDetails1, 2000);
					
//					searchPage.scrollToElement(searchPage.ShirnkCourseDetails1stItem, 2000);
//					searchPage.clickOnElement(searchPage.ShirnkCourseDetails1stItem, 2000);
					
					searchPage.scrollToElement(searchPage.ScrollToContentPreview, 2000);
					searchPage.scrollToElement(searchPage.ScrollToCourseCertificate, 2000);
					searchPage.scrollToElement(searchPage.ScrollToFrequentlyAskQuestions, 2000);
					searchPage.scrollToElement(searchPage.Title, 2000);
					searchPage.clickOnElement(searchPage.EnrollButton, 2000);
					searchPage.clickOnElement(searchPage.StartNow, 2000);
					searchPage.BackToPreviousPage(searchPage.SearchButton, 2000, 3);
					searchPage.clearText(searchPage.SearchButton);
					Thread.sleep(2000);
					searchPage.writeText(searchPage.SearchButton, 2000, "Free Course");
					searchPage.Enter(searchPage.SearchButton, 2000);
					searchPage.BackToPreviousPage(searchPage.SearchButton, 2000, 1);
			

				}

			}




