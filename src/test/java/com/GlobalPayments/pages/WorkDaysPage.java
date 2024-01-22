package com.GlobalPayments.pages;

import com.GlobalPayments.utilities.BrowserUtil;
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

    @FindBy(css = "button[data-automation-id='signInSubmitButton']")
    public WebElement signInButton;

    @FindBy(css = "div[data-automation-id='click_filter']")
    public WebElement signInClickButton;
    @FindBy(xpath = "//button[.='Accept Cookies']")
    public WebElement cookies3;



    public void login(String email, String password) {
        emailAddressBox.click();
        emailAddressBox.sendKeys(email);
        passwordBox.click();
        passwordBox.sendKeys(password);
        BrowserUtil.scrollToElement(signInButton);
        BrowserUtil.hover(signInButton);
        BrowserUtil.sleep(2);
        signInClickButton.click();

    }
}
