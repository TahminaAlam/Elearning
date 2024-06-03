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

		}
