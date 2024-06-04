package testcases;

import org.testng.annotations.Test;
import pages.CategoryPage;
import utilities.BaseDriver;      

public class CategoryTestCases extends BaseDriver{
		
	        CategoryPage categoryPage = new CategoryPage();
		    
			@Test
			public void TestsearchPage() throws InterruptedException {
				getDriver().get(categoryPage.CategoryUrl);
				try {
					Thread.sleep(10000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				categoryPage.hoverTest(categoryPage.ClassSixToTwelve, 2000);
				categoryPage.clickOnElement(categoryPage.ClassSixToTwelve, 2000);
				categoryPage.clickOnElement(categoryPage.ClassHSC, 2000);
				categoryPage.BackToPreviousPage(null, 2000, 1);
				
				categoryPage.clickOnElement(categoryPage.ClassFilter, 2000);
				categoryPage.clickOnElement(categoryPage.ChooseClass, 3000);
				categoryPage.BackToPreviousPage(null, 2000, 1);
				
				categoryPage.clickOnElement(categoryPage.CourseFilter, 2000);
				categoryPage.clickOnElement(categoryPage.ChosseBusinessFilter, 3000);
				
				categoryPage.clickOnElement(categoryPage.ScrollToBottomOfThePage, 3000);
				categoryPage.clickOnElement(categoryPage.ScrollToTheTopOfThePage, 3000);
				
				categoryPage.clickOnElement(categoryPage.ClassRoutine, 3000);
				
				
				categoryPage.clickOnElement(categoryPage.ClassSixToTwelve, 2000);
				categoryPage.clickOnElement(categoryPage.ClassTenth, 2000);
				categoryPage.BackToPreviousPage(null, 2000, 1);
				
				categoryPage.clickOnElement(categoryPage.ClassSixToTwelve, 2000);
				categoryPage.clickOnElement(categoryPage.ClassNineth, 2000);
				categoryPage.BackToPreviousPage(null, 2000, 1);
				
				categoryPage.clickOnElement(categoryPage.ClassSixToTwelve, 2000);
				categoryPage.clickOnElement(categoryPage.ClassEighth, 2000);
				categoryPage.BackToPreviousPage(null, 2000, 1);
				
				categoryPage.clickOnElement(categoryPage.ClassSixToTwelve, 2000);
				categoryPage.clickOnElement(categoryPage.ClassSeventh, 2000);
				categoryPage.BackToPreviousPage(null, 2000, 1);
				
				categoryPage.clickOnElement(categoryPage.ClassSixToTwelve, 2000);
				categoryPage.clickOnElement(categoryPage.ClassSixth, 2000);
				categoryPage.BackToPreviousPage(null, 2000, 1);
				
				categoryPage.clickOnElement(categoryPage.Skills, 2000);
				
				
				categoryPage.clickOnElement(categoryPage.Admission, 2000);
				categoryPage.BackToPreviousPage(null, 2000, 1);
				
				
				
				categoryPage.clickOnElement(categoryPage.OnlineBatch, 2000);
				categoryPage.BackToPreviousPage(null, 2000, 1);
				
				
				categoryPage.clickOnElement(categoryPage.EnglishCenter, 2000);
				
				
				categoryPage.clickOnElement(categoryPage.More, 2000);

				

	     }
	}

