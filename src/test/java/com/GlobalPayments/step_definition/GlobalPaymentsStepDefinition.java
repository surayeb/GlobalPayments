package com.GlobalPayments.step_definition;

import com.GlobalPayments.pages.BasePage;
import com.GlobalPayments.pages.CareersPage;
import com.GlobalPayments.pages.WorkDaysPage;
import com.GlobalPayments.utilities.BrowserUtil;
import com.GlobalPayments.utilities.ConfigurationReader;
import com.GlobalPayments.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class GlobalPaymentsStepDefinition {

CareersPage careersPage = new CareersPage();

WorkDaysPage workDaysPage = new WorkDaysPage();




    @Given("the user is on the homepage and sees {string} as a title")
    public void the_user_is_on_the_homepage_and_sees_as_a_title(String expectedTitle) {

        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        BrowserUtil.verifyTitle(expectedTitle);


    }
    @And("the user clicks on the Careers tab on the upper right side of the page")
    public void the_user_clicks_on_the_careers_tab_on_the_upper_right_side_of_the_page() {



        careersPage.careersTab2.isDisplayed();



        careersPage.cookies1.click();

        BrowserUtil.waitForClickablility(careersPage.careersTab2, 10);

        careersPage.careersTab2.click();


    }
    @And("the user should be able to redirect to the Careers page and sees the title as {string}")
    public void the_user_should_be_able_to_redirect_to_the_careers_page(String expectedCareerPageTitle) {

        String expectedInUrl= "https://jobs.globalpayments.com/en/?_gl=1*1uzmaw3*_gcl_au*MTgwODgyNTc1OS4xNzA1NjI3MDEz";


        BrowserUtil.switchWindowAndVerify(expectedInUrl, expectedCareerPageTitle);


    }

    @And("the user clicks on the search job box at the Careers page")
    public void the_user_clicks_on_the_search_job_box_at_the_careers_page() {

        careersPage.searchBox.isDisplayed();

        careersPage.cookies2.click();

        careersPage.searchBox.click();

    }

    @And("the user types {string} and clicks enter")
    public void the_user_types_and_enters(String expectedJobPosition) {

        careersPage.searchBox.sendKeys(expectedJobPosition + Keys.ENTER);


    }

    @And("the user browses through the available positions, and clicks the Lead Software Development Engineer in Test option")
    public void the_user_browses_through_the_available_positions_and_clicks_the_lead_software_development_engineer_in_test_option() {

        BrowserUtil.waitForVisibility(careersPage.actualJobTitle, 10);


        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();


        js.executeScript("arguments[0].scrollIntoView(true)", careersPage.actualJobTitle );

        careersPage.actualJobTitle.click();
    }



    @And("the user lands on the job description page and clicks on the Apply now tab")
    public void the_user_lands_on_the_job_description_page_and_clicks_on_the_apply_now_tab() {

    //BrowserUtil.waitForClickablility(careersPage.applyButton, 10);


    careersPage.applyButton.click();

    }


    @And("the user navigates to the connection page where the user enters {string} and {string}")
    public void theUserNavigatesToTheConnectionPageWhereTheUserEntersAnd(String email, String password) {


        Driver.getDriver().get(ConfigurationReader.getProperty("url2"));

        BrowserUtil.waitForVisibility(workDaysPage.heading2, 10);

        workDaysPage.heading2.isDisplayed();
        workDaysPage.cookies3.click();

        //workDaysPage.loginAsUser();

        workDaysPage.emailAddressBox.click();
        workDaysPage.emailAddressBox.sendKeys(email);
        //workDaysPage.emailAddressBox.sendKeys(ConfigurationReader.getProperty("email"));

        workDaysPage.emailAddressBox.click();
        //workDaysPage.passwordBox.sendKeys(ConfigurationReader.getProperty("password"));

        workDaysPage.passwordBox.sendKeys(password);
        workDaysPage.signInButton.click();

    }


/*
    @And("the user navigates to the connection page where the user enters email and password")
    public void theUserNavigatesToTheConnectionPageWhereTheUserEntersEmailAndPassword() {
        BrowserUtil.waitForVisibility(workDaysPage.heading2, 10);

        workDaysPage.heading2.isDisplayed();
        workDaysPage.cookies3.click();

        workDaysPage.loginAsUser();

    }

 */



    @And("the user clicks on the Sign In button")
    public void the_user_clicks_on_the_sign_in_button() {

    }
    @Then("the user is redirected to the candidates page and sees the message {string}")
    public void the_user_is_redirected_to_the_candidates_page_and_sees_the_message(String expectedMessage) {

    }



}
