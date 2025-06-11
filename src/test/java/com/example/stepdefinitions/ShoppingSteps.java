package com.example.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.datatable.DataTable;
import static org.testng.Assert.*;

import java.util.*;

public class ShoppingSteps {

    Map<String, Integer> cart;

    @Given("I have an empty cart")
    public void i_have_an_empty_cart() {
        cart = new HashMap<>();
    }

    @When("I add the following items:")
    public void i_add_the_following_items(DataTable table) {
        List<Map<String, String>> items = table.asMaps(String.class, String.class);
        for (Map<String, String> item : items) {
            String name = item.get("item");
            int quantity = Integer.parseInt(item.get("quantity"));
            cart.put(name, quantity);
        }
    }

    @Then("the cart should contain {int} items")
    public void the_cart_should_contain_items(int expectedItemCount) {
        assertEquals(cart.size(), expectedItemCount, "Cart item count mismatch");
    }
}
