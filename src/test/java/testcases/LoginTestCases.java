package testcases;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import pages.LoginPage;
import utilities.BaseDriver;

public class LoginTestCases extends BaseDriver{
					
	                LoginPage loginPage = new LoginPage();
				    
					@Test
					public void TestLoginPage() throws InterruptedException {
						getDriver().get(loginPage.LoginUrl);
						try {
							Thread.sleep(10000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}

						System.out.println("Please Enter Your Phone No: ");
						Scanner sc = new Scanner(System.in);
						String phoneNO = sc.next();
//				        sc.close(); 
				        Thread.sleep(3000);

						loginPage.writeText(loginPage.InputField, 2000,""+ phoneNO);
						loginPage.clickOnElement(loginPage.SubmitButton, 2000);
						
						System.out.println("Please Enter Your Password: ");
						String password = sc.next();
				        
						loginPage.writeText(loginPage.Password, 2000,""+ password);
						loginPage.clickOnElement(loginPage.SubmitButton, 2000);
							
						loginPage.clickOnElement(loginPage.RefreshImg, 2000);
				

					}

				}

