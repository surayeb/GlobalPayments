package com.GlobalPayments.pages;

import com.GlobalPayments.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CareersPage extends BasePage{

    public CareersPage () {
        PageFactory.initElements(Driver.getDriver(), this);

    }

@FindBy(xpath = "//input[@id='ql-search']")
    public WebElement searchBox;

    @FindBy(xpath = "//button[.='Accept All']")
    public WebElement cookies2;


    @FindBy(xpath = "//a[.='Lead Software Development Engineer in Test']")
    public WebElement actualJobTitle;

    @FindBy(xpath = "//a[@id='js-apply-external']")
    public WebElement applyButton;

    @FindBy(xpath = "//h3[normalize-space()='Lead Software Development Engineer in Test']")
    public WebElement heading;


}
