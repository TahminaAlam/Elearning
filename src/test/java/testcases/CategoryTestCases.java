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
				categoryPage.clickOnElement(categoryPage.ClassHSC, 3000);
				categoryPage.BackToPreviousPage(null, 2000, 1);

				categoryPage.clickOnElement(categoryPage.Skills, 3000);
				
				categoryPage.clickOnElement(categoryPage.Admission, 3000);
				categoryPage.BackToPreviousPage(null, 2000, 1);

				categoryPage.clickOnElement(categoryPage.OnlineBatch, 3000);
				categoryPage.BackToPreviousPage(null, 2000, 1);

				categoryPage.clickOnElement(categoryPage.EnglishCenter, 2000);

				categoryPage.clickOnElement(categoryPage.More, 2000);
				categoryPage.BackToPreviousPage(null, 2000, 1);

				

	     }
	}

