package testcases;

import org.testng.annotations.Test;

import pages.BasePage;
import pages.HomePage;
import pages.SearchPage;
import utilities.BaseDriver;

         public class HomeTeseCases extends BaseDriver{
	
	
	     BasePage basePage = new BasePage();
	     HomePage homePage = new HomePage();
	    
		@Test
		public void TestsearchPage() throws InterruptedException {
			getDriver().get(homePage.HomeUrl);
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			homePage.clickOnElement(homePage.Language, 2000);
			homePage.writeText(homePage.SearchButton, 2000, "free courses");
			homePage.clickOnElement(homePage.ClassSixToTwelve, 2000);
			homePage.clickOnElement(homePage.Skills, 2000);
			homePage.clickOnElement(homePage.Admission, 2000);
			homePage.BackToPreviousPage(null, 2000, 1);
			homePage.clickOnElement(homePage.OnlineBatch, 2000);
			homePage.BackToPreviousPage(null, 2000, 1);
			homePage.clickOnElement(homePage.EnglishCenter, 2000);
			homePage.clickOnElement(homePage.More, 2000);
			homePage.clickOnElement(homePage.Language, 2000);
//			homePage.clickOnElement(homePage.HelpCenter, 2000);
			homePage.clickOnElement(homePage.Login, 2000);
			homePage.BackToPreviousPage(null, 2000, 1);
			homePage.clickOnElement(homePage.HomepageHSC, 2000);
			homePage.clickOnElement(homePage.CloseHSC, 2000);
     }
}
