package SeleniumTestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Values implements Methods {

    public WebDriver webDriver;


    @Override
    public void InitiatingWebDriver() {

        //set webdriver
        System.setProperty("webdriver.gecko.driver","C:\\geckodriver-v0.31.0-win64\\geckodriver.exe");
        webDriver=new FirefoxDriver();// launching firefox webdriver

        webDriver.manage().window().maximize(); // maximize the webdriver window



    }
}
