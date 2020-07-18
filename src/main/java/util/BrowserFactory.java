package util;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import cn.hutool.core.lang.Assert;

public class BrowserFactory {

	static WebDriver driver;

	public static WebDriver startBrowser() {

		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
//WebDriver
       driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://techfios.com/test/101/index.php");
		return driver;
		
	}
//	//	WebElement checkBox = driver.findElement(By.name("allbox"));
//		Select checkBox = new Select (driver.findElement(By.name("allbox")));			
//				//(By.name("allbox")));
////		Assert.isTrue(checkBox.isSelected());
//		@FindBy(how=How.NAME, using = "categorydata")
//		WebElement CUSTOMERBOX;
//		CUSTOMERBOX
//		System.out.println(checkBox);
//
//	//	return driver;
	
}

