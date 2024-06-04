package pages;

import org.openqa.selenium.By;


public class CategoryPage extends BasePage{

		  public String CategoryUrl = "https://10minuteschool.com/"; 
		  public By imgButton = By.xpath("//body/main[1]/div[1]/div[1]/div[2]/a[1]/div[1]/img[1]");
		  public By ClassSixToTwelve = By.xpath("//body/main[1]/div[1]/div[1]/nav[1]/ul[1]/li[1]"); 
		  
		  public By ClassHSC = By.xpath("//body/div[5]/div[1]/ul[1]/li[1]");
		  public By ClassFilter = By.xpath("//body/main[1]/div[3]/div[1]/div[1]/div[1]/div[1]/span[1]/div[1]/*[1]");
		  public By ChooseClass= By.xpath("//body/div[5]/div[1]/ul[1]/div[3]/li[1]");  
		  public By CourseFilter = By.xpath("//body/main[1]/div[3]/div[1]/div[1]/div[1]/div[1]/span[2]/div[1]/*[1]");
		  public By ChosseBusinessFilter = By.xpath("//body/div[5]/div[1]/ul[1]/li[2]");
		  public By ScrollToBottomOfThePage = By.xpath("//body/div[1]/div[1]/div[1]");
		  public By ScrollToTheTopOfThePage = By.xpath("//body/main[1]/div[2]/div[1]/div[1]/a[1]/img[1]");
		  public By CouseLocator = By.xpath("//body/main[1]/div[4]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/a[1]/div[1]/div[2]/div[1]");
		  public By SeeCourseDetails = By.xpath("//body/main[1]/div[4]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/a[1]/div[1]/div[2]/div[1]/div[1]/div[2]/button[1]");
		  public By ClassRoutine = By.xpath("//h2[contains(text(),'ক্লাস রুটিন')]");

		
		  public By ClassTenth = By.xpath("//body/div[5]/div[1]/ul[1]/li[2]");
		  public By ClassNineth = By.xpath("//body/div[5]/div[1]/ul[1]/li[3]");
		  public By ClassEighth = By.xpath("//body/div[5]/div[1]/ul[1]/li[4]");
		  public By ClassSeventh = By.xpath("//body/div[5]/div[1]/ul[1]/li[5]");
		  public By ClassSixth = By.xpath("//body/div[5]/div[1]/ul[1]/li[6]");
		  
		  
		  public By Skills = By.xpath("//body/main[1]/div[1]/div[1]/nav[1]/ul[1]/li[2]/div[1]/div[1]/a[1]");
		  public By Admission = By.xpath("//body/main[1]/div[1]/div[1]/nav[1]/ul[1]/li[3]/a[1]");
		  public By OnlineBatch= By.xpath("//body/main[1]/div[1]/div[1]/nav[1]/ul[1]/li[4]");
		  public By EnglishCenter = By.xpath("//body/main[1]/div[1]/div[1]/nav[1]/ul[1]/li[5]");
		  public By More = By.xpath("//body/main[1]/div[1]/div[1]/nav[1]/ul[1]/li[6]");


}
