package step;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import util.BrowserFactory;
import page.LoginPageClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepdefinition {
WebDriver driver;
@Given("^the user is in page$")
public void the_user_is_in_page() throws Throwable {
	driver=BrowserFactory.startBrowser();
  System.out.println("First");
	
}
@When("^user clicks blue background changes to blue$")
public void user_clicks_blue_background_changes_to_blue() throws Throwable {
   WebElement td_Home = driver.findElement(By.tagName("button"));
   td_Home.click();
   if(td_Home.isDisplayed()){
		System.out.println("Pass");
   }
   else
	{
		System.out.println("fail");
	}
		
  Thread.sleep(3000);
	
}

@Then("^user clicks white background changes to White$")
public void user_clicks_white_background_changes_to_White() throws Throwable {
   System.out.println("White");
   WebElement td2_Home = driver.findElement(By.xpath("//html/body/div[4]/span/button[2]"));
   td2_Home.click();
   if(td2_Home.isDisplayed()){
		System.out.println("Pass");
	}else
	{
		System.out.println("fail");
	}
}


@Then("^program ends$")
public void program_ends() throws Throwable {
    System.out.println("The End");
   	driver.close();
	driver.quit();
	// Write code here that turns the phrase above into concrete actions
}
}
