package pages;

import org.openqa.selenium.By;

public class LoginPage extends BasePage{

			  public String LoginUrl = "https://app.10minuteschool.com/auth/login"; 
			  public By InputField = By.xpath("//body/app-root[1]/div[1]/div[1]/app-home[1]/div[1]/main[1]/app-auth[1]/div[1]/app-login[1]/form[1]/section[1]/div[1]/div[1]/div[1]/div[2]/label[1]/input[1]");
			  public By SubmitButton = By.xpath("//body/app-root[1]/div[1]/div[1]/app-home[1]/div[1]/main[1]/app-auth[1]/div[1]/app-login[1]/form[1]/section[1]/div[1]/button[1]");
			  public By Password = By.xpath("//body/app-root[1]/div[1]/div[1]/app-home[1]/div[1]/main[1]/app-auth[1]/div[1]/app-login[1]/form[1]/section[1]/div[1]/div[1]/div[2]/div[2]/label[1]/input[1]");
			  public By RefreshImg = By.xpath("//body/app-root[1]/div[1]/div[1]/app-home[1]/div[1]/app-navbar[1]/div[1]/nav[1]/div[1]/div[2]/a[1]/img[1]");


	}
