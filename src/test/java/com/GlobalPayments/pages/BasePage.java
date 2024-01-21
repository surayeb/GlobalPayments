package com.GlobalPayments.pages;

import com.GlobalPayments.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    public BasePage () {
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "//button[.='Accept All Cookies']")
    public WebElement cookies1;



    @FindBy(xpath = "//div[@class='component link-list utility-nav-list col-12']//a[@title='Careers'][normalize-space()='Careers']")
    public WebElement careersTab2;


}
