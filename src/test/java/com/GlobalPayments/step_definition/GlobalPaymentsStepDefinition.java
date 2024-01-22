package com.GlobalPayments.step_definition;


import com.GlobalPayments.pages.CareersPage;
import com.GlobalPayments.pages.WorkDaysPage;
import com.GlobalPayments.utilities.BrowserUtil;
import com.GlobalPayments.utilities.ConfigurationReader;
import com.GlobalPayments.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;


public class GlobalPaymentsStepDefinition {

    CareersPage careersPage = new CareersPage();

    WorkDaysPage workDaysPage = new WorkDaysPage();


    @Given("the user is on the homepage")
    public void the_user_is_on_the_homepage_and_sees_as_a_title() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @When("the user clicks on the Careers tab on the upper right side of the page")
    public void the_user_clicks_on_the_careers_tab_on_the_upper_right_side_of_the_page() {
        careersPage.cookies1.click();
        BrowserUtil.waitForClickablility(careersPage.careersTab2, 10);
        careersPage.careersTab2.click();
    }

    @And("the user should be able to redirect to the Careers page with title as {string}")
    public void the_user_should_be_able_to_redirect_to_the_careers_page(String title) {
        BrowserUtil.switchWindow(title);
    }

    @And("the user clicks on the search job box at the Careers page")
    public void the_user_clicks_on_the_search_job_box_at_the_careers_page() {
        careersPage.cookies2.click();
        careersPage.searchBox.click();

    }

    @And("the user types {string} and clicks enter")
    public void the_user_types_and_enters(String expectedJobPosition) {
        careersPage.searchBox.sendKeys(expectedJobPosition + Keys.ENTER);
    }

    @And("the user browses through the available positions, and clicks the Lead Software Development Engineer in Test option")
    public void the_user_browses_through_the_available_positions_and_clicks_the_lead_software_development_engineer_in_test_option() {
        BrowserUtil.scrollToElement(careersPage.actualJobTitle);
        careersPage.actualJobTitle.click();
    }


    @And("the user lands on the job description page and clicks on the Apply now tab")
    public void the_user_lands_on_the_job_description_page_and_clicks_on_the_apply_now_tab() {
        careersPage.applyButton.click();
    }


    @And("the user navigates to the connection page where the user enters {string} and {string}")
    public void theUserNavigatesToTheConnectionPageWhereTheUserEntersAnd(String email, String password) {
        BrowserUtil.waitForVisibility(workDaysPage.cookies3, 20);
        workDaysPage.login(email,password);
    }



}
