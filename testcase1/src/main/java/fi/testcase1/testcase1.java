package fi.testcase1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testcase1 
{
	WebDriver driver;
public void launchBrowser() 
{
	System.setProperty("webdriver.chrome.driver", 
	"E:\\selenium\\chromedriver.exe");
	 driver = new ChromeDriver();
  	driver.get("https://www.google.com/");

}
public void navigateToSelinium()
{
	driver.navigate().to("https://en.wikipedia.org/wiki/Selenium_(software)");
	driver.navigate().to("https://en.wikipedia.org/w/index.php?title=Special:CreateAccount&returnto=Selenium+%28software%29");
	System.out.println(driver.getCurrentUrl());
	driver.navigate().back();
	driver.navigate().to("http://www.seleniumhq.org");
	System.out.println(driver.getCurrentUrl());
	driver.close();
}

public static void main(String[] args) throws InterruptedException 
{
	testcase1 ob = new testcase1();
	ob.launchBrowser();
	ob.navigateToSelinium();
}
}
