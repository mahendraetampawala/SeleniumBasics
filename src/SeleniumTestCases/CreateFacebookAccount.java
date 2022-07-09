package SeleniumTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class CreateFacebookAccount extends Values implements Methods{

    public void signupForFacebook() {
        InitiatingWebDriver();


        WebElement googleSearch=webDriver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input"));//assigning css selector for a web element
        System.out.println("Executed");
        googleSearch.sendKeys(searchforfacebook);//sending keys to the google search

        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
        /*
        WebDriverWait wait=new WebDriverWait(webDriver,30);

        WebElement waitforsearch;
        waitforsearch = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[2]/div[5]/center/input[1]")));
        waitforsearch.click();

        */

        webDriver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[2]/div[5]/center/input[1]")).click();//Clicking on the google search button


    }

}
