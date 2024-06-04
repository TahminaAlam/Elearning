package pages;

import java.io.ByteArrayInputStream;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import io.qameta.allure.Allure;
import static utilities.BaseDriver.getDriver;
import java.awt.Desktop.Action;

public class BasePage {

	public WebElement getElement(By locator) {
		return getDriver().findElement(locator);
	}
	
	public void writeText(By locator, long mil, String text) {
		getElement(locator).sendKeys(text);
		try {
			Thread.sleep(mil);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void clearText(By locator) {
		getElement(locator).sendKeys(Keys.BACK_SPACE);
	}
	
	public void Enter(By locator, long mil) {
		getElement(locator).sendKeys(Keys.ENTER);
		try {
			Thread.sleep(mil);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void clickOnElement(By locator, long mil) {
		getElement(locator).click();
		
		try {
			Thread.sleep(mil);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void takeScreenShot(String name) {
		Allure.addAttachment(name, new ByteArrayInputStream(((TakesScreenshot)(getDriver())).getScreenshotAs(OutputType.BYTES)));
	}
	
	public void scrollToElement(By locator, long mil) {
		WebElement el = getElement(locator);
		JavascriptExecutor js = (JavascriptExecutor)getDriver();
		js.executeScript("arguments[0].scrollIntoView(true);", el);
		try {
			Thread.sleep(mil);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void scrollToBottom() {
		WebElement el = getElement(null);
		JavascriptExecutor js = (JavascriptExecutor)getDriver();
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)",el);
	}
	
	public void scrollToTop() {
		WebElement el = getElement(null);
		JavascriptExecutor js = (JavascriptExecutor)getDriver();
		js.executeScript("window.scrollTo(0, 0);",el);
	}
	
	public void hoverTest(By locator, long mil)  {
		Actions action = new Actions(getDriver());
		WebElement hoverExample = getDriver().findElement(locator);
		action.moveToElement(hoverExample).perform();
		try {
			Thread.sleep(mil);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
    public void BackToPreviousPage(By locator, long mil , int time) {
		
		for(int i = 0 ; i < time ; i++ ) {
			getDriver().navigate().back();
			try {
				Thread.sleep(mil);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
    
    
}
