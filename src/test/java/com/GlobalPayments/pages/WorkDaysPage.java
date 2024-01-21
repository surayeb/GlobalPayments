package com.GlobalPayments.pages;

import com.GlobalPayments.utilities.ConfigurationReader;
import com.GlobalPayments.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WorkDaysPage {


    public WorkDaysPage () {
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "//input[@id='input-4']")
    public WebElement emailAddressBox;

    @FindBy(xpath = "//input[@id='input-5']")
    public WebElement passwordBox;

    @FindBy(xpath = "//div[@aria-label='Sign In']")
    public WebElement signInButton;

    @FindBy(xpath = "//button[normalize-space()='Accept Cookies']")
    public WebElement cookies3;

    @FindBy(xpath = "//h1[@class='css-1imaysj']")
    public WebElement heading2;
/*
    public void loginAsUser(){
        Driver.getDriver().get(ConfigurationReader.getProperty("url2"));
        emailAddressBox.sendKeys(ConfigurationReader.getProperty("email"));
        passwordBox.sendKeys(ConfigurationReader.getProperty("password"));
        signInButton.click();
    }

 */




}
