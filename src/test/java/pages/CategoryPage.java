package pages;

import org.openqa.selenium.By;


public class CategoryPage extends BasePage{

		  public String CategoryUrl = "https://10minuteschool.com/"; 
		  public By imgButton = By.xpath("//body/main[1]/div[1]/div[1]/div[2]/a[1]/div[1]/img[1]");
		  public By ClassSixToTwelve = By.xpath("//body/main[1]/div[1]/div[1]/nav[1]/ul[1]/li[1]/div[1]/div[1]"); 
		  
		  public By Skills = By.xpath("//body/main[1]/div[1]/div[1]/nav[1]/ul[1]/li[2]/div[1]/div[1]/a[1]");
		  public By Admission = By.xpath("//body/main[1]/div[1]/div[1]/nav[1]/ul[1]/li[3]/a[1]");
		  public By OnlineBatch= By.xpath("//body/main[1]/div[1]/div[1]/nav[1]/ul[1]/li[4]");
		  public By EnglishCenter = By.xpath("//body/main[1]/div[1]/div[1]/nav[1]/ul[1]/li[5]");
		  public By More = By.xpath("//body/main[1]/div[1]/div[1]/nav[1]/ul[1]/li[6]");

		  public By ClassHSC = By.xpath("//body/div[5]/div[1]/ul[1]/li[1]");
}
