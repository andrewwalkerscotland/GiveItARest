package com.andrewwalkerscotland;

import io.cucumber.java.en.Given;

public class UsersSteps {

    @Given("I hit the get endpoint for users")
    public void i_hit_the_get_endpoint_for_users() {
        System.out.println("Hit the endpoint");
    }
}
