package com.demo.steps;

import com.demo.pages.BookPage;
import com.demo.pages.DashboardPage;
import com.demo.pages.LoginPage;
import com.demo.utility.ConfigurationReader;
import com.demo.utility.Driver;
import io.cucumber.java.en.*;

public class LoginStepDefinitions {

    LoginPage loginPage = new LoginPage();
    DashboardPage dashboardPage = new DashboardPage();


    @Given("I am on the login page")
    public void i_am_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("library_url"));
    }

    @When("I login as a librarian")
    public void i_login_as_a_librarian() {
        loginPage.emailBox.sendKeys(ConfigurationReader.getProperty("librarian_username"));
        loginPage.passwordBox.sendKeys(ConfigurationReader.getProperty("librarian_password"));
        loginPage.loginButton.click();
    }

    @When("I login as a student")
    public void i_login_as_a_student() {
        loginPage.emailBox.sendKeys(ConfigurationReader.getProperty("student55_user"));
        loginPage.passwordBox.sendKeys(ConfigurationReader.getProperty("student55_pass"));
        loginPage.loginButton.click();
    }

    @Then("books should be displayed")
    public void books_should_be_displayed() {
        dashboardPage.booksLink.isDisplayed();
    }

}
