package wdcmds;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.pageobjects.BasePage;

public class ActionDriver extends BasePage{
	static JavascriptExecutor js ;

	public ActionDriver(WebDriver driver) {
		super(driver);

	}


	
		public static void clickElementByJS(WebElement element, WebDriver driver) {
			js = ((JavascriptExecutor) driver);
			js.executeScript("arguments[0].click();", element);
			



}
}