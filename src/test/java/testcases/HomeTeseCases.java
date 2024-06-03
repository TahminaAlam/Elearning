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
			homePage.clickOnElement(homePage.HomeCloseDialogueBox, 2000);
			homePage.clickOnElement(homePage.Homepage10thClass, 2000);
			homePage.clickOnElement(homePage.HomeCloseDialogueBox, 2000);
			homePage.clickOnElement(homePage.Homepage9thClass, 2000);
			homePage.BackToPreviousPage(null, 2000, 1);
			homePage.clickOnElement(homePage.Homepage8thClass, 2000);
			homePage.BackToPreviousPage(null, 2000, 1);
			homePage.clickOnElement(homePage.Homepage7thClass, 2000);
			homePage.BackToPreviousPage(null, 2000, 1);
			homePage.clickOnElement(homePage.Homepage6thClass, 2000);
			homePage.BackToPreviousPage(null, 2000, 1);
			homePage.clickOnElement(homePage.HSCBactchDemo, 2000);
			homePage.BackToPreviousPage(null, 2000, 1);
			homePage.clickOnElement(homePage.SixToNineClassDemo, 2000);
			homePage.BackToPreviousPage(null, 2000, 1);
			homePage.scrollToElement(homePage.AllSkillDevelopmentCourses, 2000);
			homePage.clickOnElement(homePage.AllSkillDevelopmentCourses, 2000);
			homePage.BackToPreviousPage(null, 2000, 1);
			homePage.scrollToElement(homePage.HomepageClass5To12, 2000);
			homePage.clickOnElement(homePage.HomepageClass5To12, 2000);
			homePage.BackToPreviousPage(null, 2000, 1);
			homePage.clickOnElement(homePage.HomeSkill, 2000);
			homePage.BackToPreviousPage(null, 2000, 1);
			homePage.clickOnElement(homePage.HomeAdmissionTest, 2000);
			homePage.BackToPreviousPage(null, 2000, 1);
			homePage.clickOnElement(homePage.HomeJobPreparation, 2000);
			homePage.BackToPreviousPage(null, 2000, 1);
			homePage.scrollToElement(homePage.ClickOnVideo, 2000);
			homePage.clickOnElement(homePage.ClickOnVideo, 2000);
			homePage.clickOnElement(homePage.ClickOnVideo, 2000);
			homePage.clickOnElement(homePage.SelectYourCourse, 2000);
			homePage.BackToPreviousPage(null, 2000, 1);
			homePage.scrollToElement(homePage.ForSscHscStudents, 2000);
			homePage.scrollToElement(homePage.HomeSkillsAllCourse, 2000);
			homePage.clickOnElement(homePage.HomeSkillsAllCourse, 2000);
			homePage.BackToPreviousPage(null, 2000, 1);
			homePage.scrollToElement(homePage.DreamVersityAllCourses, 2000);
			homePage.clickOnElement(homePage.DreamVersityAllCourses, 2000);
			homePage.BackToPreviousPage(null, 2000, 1);
			homePage.scrollToElement(homePage.GovJobAllCourse, 2000);
			homePage.clickOnElement(homePage.GovJobAllCourse, 2000);
			homePage.BackToPreviousPage(null, 2000, 1);
			homePage.scrollToElement(homePage.TeacherBanner, 2000);
			homePage.BackToPreviousPage(null, 2000, 1);
			homePage.scrollToElement(homePage.DownloadAppBanner, 2000);
			homePage.BackToPreviousPage(null, 2000, 1);
			homePage.scrollToElement(homePage.ContactDirectly, 2000);
			homePage.scrollToElement(homePage.CloseContact, 2000);
			homePage.clickOnElement(homePage.TopBanner, 2000);

     }
}
