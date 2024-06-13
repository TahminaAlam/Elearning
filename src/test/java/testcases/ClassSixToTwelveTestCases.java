package testcases;

import java.util.Scanner;

import org.testng.annotations.Test;
import pages.ClassSixToTwelvePage;
import utilities.BaseDriver; 

public class ClassSixToTwelveTestCases extends BaseDriver{
			
	ClassSixToTwelvePage classSixToTwelvePage = new ClassSixToTwelvePage();
			    
				@Test
				public void TestsearchPage() throws InterruptedException {
					getDriver().get(classSixToTwelvePage.ClassSixToTwelvePageUrl);
					try {
						Thread.sleep(10000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
					classSixToTwelvePage.hoverTest(classSixToTwelvePage.ClassSixToTwelve, 2000);
					classSixToTwelvePage.clickOnElement(classSixToTwelvePage.ClassHSC, 2000);
					
					classSixToTwelvePage.clickOnElement(classSixToTwelvePage.ClassFilter, 2000);
					classSixToTwelvePage.clickOnElement(classSixToTwelvePage.ChooseClass, 3000);
					
					classSixToTwelvePage.clickOnElement(classSixToTwelvePage.DemoClass, 3000);
					classSixToTwelvePage.clickOnElement(classSixToTwelvePage.SelectStudentRadioButton, 3000);
					classSixToTwelvePage.clickOnElement(classSixToTwelvePage.YourDistric, 3000);
					classSixToTwelvePage.writeText(classSixToTwelvePage.SearchDistric, 3000, "Dhaka");
					classSixToTwelvePage.clickOnElement(classSixToTwelvePage.SelectDhaka, 3000);
					classSixToTwelvePage.clickOnElement(classSixToTwelvePage.ClassOfStudent, 3000);
					classSixToTwelvePage.clickOnElement(classSixToTwelvePage.GoAhedButton, 3000);
					classSixToTwelvePage.clickOnElement(classSixToTwelvePage.SelectDateAndTime, 3000);
					classSixToTwelvePage.clickOnElement(classSixToTwelvePage.GoAhedButton, 3000);
					classSixToTwelvePage.clickOnElement(classSixToTwelvePage.SelectKnowledgeLevel, 3000);
					classSixToTwelvePage.clickOnElement(classSixToTwelvePage.FeedbackOfNewBook, 3000);
					classSixToTwelvePage.clickOnElement(classSixToTwelvePage.FeedbackOfStudyType, 3000);
					classSixToTwelvePage.clickOnElement(classSixToTwelvePage.JudgeNewCuriculam, 3000);
					classSixToTwelvePage.scrollToElement(classSixToTwelvePage.ConfirmButton, 3000);
					classSixToTwelvePage.clickOnElement(classSixToTwelvePage.ConfirmButton, 3000);
			        classSixToTwelvePage.BackToPreviousPage(null, 2000, 3);
					
					classSixToTwelvePage.hoverTest(classSixToTwelvePage.ClassSixToTwelve, 2000);
					classSixToTwelvePage.clickOnElement(classSixToTwelvePage.ClassTenth, 3000);
					classSixToTwelvePage.BackToPreviousPage(null, 3000, 1);
					
					classSixToTwelvePage.hoverTest(classSixToTwelvePage.ClassSixToTwelve, 2000);
					classSixToTwelvePage.clickOnElement(classSixToTwelvePage.ClassNineth, 3000);
					classSixToTwelvePage.BackToPreviousPage(null, 2000, 1);
					
					classSixToTwelvePage.hoverTest(classSixToTwelvePage.ClassSixToTwelve, 2000);
					classSixToTwelvePage.clickOnElement(classSixToTwelvePage.ClassEighth, 3000);
					classSixToTwelvePage.BackToPreviousPage(null, 2000, 1);
					
					classSixToTwelvePage.hoverTest(classSixToTwelvePage.ClassSixToTwelve, 2000);
					classSixToTwelvePage.clickOnElement(classSixToTwelvePage.ClassSeventh, 3000);
					classSixToTwelvePage.BackToPreviousPage(null, 2000, 1);
					
					classSixToTwelvePage.hoverTest(classSixToTwelvePage.ClassSixToTwelve, 2000);
					classSixToTwelvePage.clickOnElement(classSixToTwelvePage.ClassSixth, 3000);
					classSixToTwelvePage.BackToPreviousPage(null, 2000, 1);
					

		     }
		}


