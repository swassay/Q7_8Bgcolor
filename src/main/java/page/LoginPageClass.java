package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class LoginPageClass {
	WebDriver driver;

	public LoginPageClass() {

	}
	WebElement td_Home = driver.findElement(By.tagName("button"));	 
	 {
			 
	}
	public void colorchange() throws InterruptedException
	{
		 td_Home.click();
		 Thread.sleep(2000);
		 return;
	}


}