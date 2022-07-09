package SeleniumTestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Values implements MainMethods {

    public WebDriver webDriver;


    @Override
    public void InitiatingWebDriver() {

        //set webdriver
        System.setProperty("webdriver.gecko.driver","C:\\geckodriver-v0.31.0-win64\\geckodriver.exe");
        webDriver=new FirefoxDriver();// launching firefox webdriver

        webDriver.manage().window().maximize(); // maximize the webdriver window
        webDriver.get("https://www.google.com/");//launching the webdriver and redirecting to the google.com

        webDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);//Implicit Wait(Waits for 30 seconds before throwing an exception)

    }
}
