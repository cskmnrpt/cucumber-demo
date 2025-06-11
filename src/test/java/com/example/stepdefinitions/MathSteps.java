package com.example.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.qase.cucumber7.Qase;

import static org.testng.Assert.*;

public class MathSteps {
    int a, b, result;

    @Given("I have numbers {int} and {int}")
    public void i_have_numbers_and(int num1, int num2) {
        a = num1;
        b = num1;
    }

    @When("I add them")
    public void i_add_them() {
        result = a + b;
    }

    @Then("the result should be {int}")
    public void the_result_should_be(int expected) {
        assertEquals(result, expected, "Result does not match expected value");
        String comment = String.format("Adding %d + %d = %d, Expected: %d", a, b, result, expected);
        Qase.comment(comment);
        //If the comment is added before the assertion, the comment (and error) gets added to "Actual Result" on Qase. 
        //If the comment is added after the assertion, the comment gets ignored and only the error gets published. 
    }
}
