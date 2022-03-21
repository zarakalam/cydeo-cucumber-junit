package com.cydeo.step_definitions;

import com.cydeo.pages.WebTableLoginPage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WebTable_StepDefinitions {

    WebTableLoginPage webTableLoginPage = new WebTableLoginPage();

    @Given("User is on the login page of the webtable app")
    public void user_is_on_the_login_page_of_the_web_table_app() {
        String url = ConfigurationReader.getProperty("web.table.url");
        Driver.getDriver().get(url);
    }

    @When("user enters username {string}")
    public void user_Enters_Username(String string) {
        webTableLoginPage.inputUsername.sendKeys(string);

    }

    @And("user enters password {string}")
    public void user_Enters_Password(String string) {
        webTableLoginPage.inputPassword.sendKeys(string);

    }

    @When("user clicks login button")
    public void user_clicks_login_button() {
        webTableLoginPage.loginButton.click();

    }

    @Then("user should see url contains orders")
    public void user_should_see_url_contains_orders() {

    }


}
