package pages;

import java.time.Duration;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class HomePage extends BasePage{

	  public String HomeUrl = "https://10minuteschool.com/"; 
	  public By imgButton = By.xpath("//body/main[1]/div[1]/div[1]/div[2]/a[1]/div[1]/img[1]");
	  public By SearchButton = By.xpath("//body/main[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/input[1]");
	  public By ClassSixToTwelve = By.xpath("//body/main[1]/div[1]/div[1]/nav[1]/ul[1]/li[1]"); 
	  public By Skills = By.xpath("//body/main[1]/div[1]/div[1]/nav[1]/ul[1]/li[2]/div[1]/div[1]/a[1]");
	  public By Admission = By.xpath("//body/main[1]/div[1]/div[1]/nav[1]/ul[1]/li[3]/a[1]");
	  public By OnlineBatch= By.xpath("//body/main[1]/div[1]/div[1]/nav[1]/ul[1]/li[4]");
	  public By EnglishCenter = By.xpath("//body/main[1]/div[1]/div[1]/nav[1]/ul[1]/li[5]");
	  public By More = By.xpath("//body/main[1]/div[1]/div[1]/nav[1]/ul[1]/li[6]");
	  public By Language = By.xpath("//body/main[1]/div[1]/div[1]/div[4]/div[1]/span[2]");
	  public By HelpCenter = By.xpath("//body/main[1]/div[1]/div[1]/div[4]/div[1]/span[2]");
	  public By Login = By.xpath("//a[@id='login-button']");
      public By HomepageHSC = By.xpath("//body/main[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]");
      public By Homepage10thClass = By.xpath("//body/div[5]/div[1]/div[1]/button[1]/*[1]");
      public By Homepage9thClass = By.xpath("//body/main[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/a[1]/div[1]");
      public By Homepage8thClass = By.xpath("//body/main[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[4]/a[1]/div[1]");
      public By Homepage7thClass = By.xpath("//body/main[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[5]/a[1]/div[1]");
      public By Homepage6thClass = By.xpath("//body/main[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[6]/a[1]/div[1]"); 
      public By HomeCloseDialogueBox = By.xpath("//body/div[5]/div[1]/div[1]/button[1]/*[1]");
      public By HSCBactchDemo = By.xpath("//body/main[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/a[1]");
      public By SixToNineClassDemo = By.xpath("//body/main[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/a[2]");
      public By AllSkillDevelopmentCourses = By.xpath("//body/main[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[3]/div[3]/a[1]");
      public By HomepageClass5To12 = By.xpath("//body/main[1]/div[3]/div[1]/div[2]/div[2]/div[1]/a[1]/div[1]");
      public By HomeSkill = By.xpath("//body/main[1]/div[3]/div[1]/div[2]/div[2]/div[1]/a[2]/div[1]");
      public By HomeAdmissionTest = By.xpath("//body/main[1]/div[3]/div[1]/div[2]/div[2]/div[1]/a[3]/div[1]");
      public By HomeJobPreparation = By.xpath("//body/main[1]/div[3]/div[1]/div[2]/div[2]/div[1]/a[4]/div[1]");
      public By ClickOnVideo = By.xpath("//body/main[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[1]");
      public By SelectYourCourse = By.xpath("//body/main[1]/div[3]/div[2]/div[1]/div[3]/div[1]/a[1]/*[1]");
      public By ForSscHscStudents = By.xpath("//body/main[1]/div[3]/div[3]/div[2]/div[1]");
      public By HomeSkillsAllCourse = By.xpath("//body/main[1]/div[3]/div[4]/div[3]/div[2]/a[1]");
      public By DreamVersityAllCourses = By.xpath("//body/main[1]/div[3]/div[5]/div[1]/div[3]/a[1]");
      public By GovJobAllCourse = By.xpath("//body/main[1]/div[3]/div[5]/div[1]/div[3]/a[1]");
      public By TeacherBanner = By.xpath("//body/main[1]/div[3]/div[8]/div[1]/div[1]");
      public By DownloadAppBanner = By.xpath("//body/main[1]/div[3]/div[10]/div[1]/div[1]");
      public By ContactDirectly = By.xpath("//body/main[1]/div[3]/div[10]/div[1]/div[1]");
      public By CloseContact = By.xpath("//body/div[1]/div[1]/div[3]/button[1]/*[1]");
      public By TopBanner= By.xpath("//body/main[1]/div[2]/div[1]/div[1]/a[1]/img[1]");
     
}
