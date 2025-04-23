package com.example.stepdefinitions;

import org.testng.Assert;

import io.cucumber.java.en.*;

public class LoginSteps {

    private String actualStatus;

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        System.out.println("User is on the login page.");
    }

    @When("the user enters username {string} and password {string}")
    public void the_user_enters_username_and_password(String username, String password) {
        System.out.println("Entered Username: " + username + ", Password: " + password);
        // Simulate login logic
        if (username.equals("admin") && password.equals("admin123")) {
            actualStatus = "success";
        } else {
            actualStatus = "failure";
        }
    }

    @Then("the login should be {string}")
    public void the_login_should_be(String expectedStatus) {
        Assert.assertEquals(actualStatus, expectedStatus, "Login status should match expected result.");
    }
}
