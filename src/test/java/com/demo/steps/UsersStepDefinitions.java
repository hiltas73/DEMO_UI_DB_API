package com.demo.steps;

import com.demo.pages.UsersPage;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class UsersStepDefinitions {

    UsersPage usersPage = new UsersPage();


    @Given("I click on Users link")
    public void i_click_on_users_link() {
        usersPage.usersLink.click();

    }

    @Then("table should have following column names")
    public void table_should_have_following_column_names(List<String> expectedColumnNames) {
        List<String> actualColumnNames = new ArrayList<>();
        for (WebElement name : usersPage.columnNames) {
            actualColumnNames.add(name.getText());
        }
        Assert.assertEquals(expectedColumnNames, actualColumnNames);

    }
}
