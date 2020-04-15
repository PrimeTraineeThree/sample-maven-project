package com.demo.nopcommerce.pages;

import com.demo.nopcommerce.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Reporter;

/**
 * Created by Jay
 */
public class HomePage extends Utility {

    By loginLink = By.linkText("Log in");
    By registerLink = By.xpath("//a[@class='ico-register']");


    public void clickOnLoginLink(){
        Reporter.log("Clicking on login link " +loginLink.toString());
        clickOnElement(loginLink);
    }

    public void clickOnRegisterLink(){
        Reporter.log("Clicking on login link " +registerLink.toString());
        clickOnElement(registerLink);
    }


}
