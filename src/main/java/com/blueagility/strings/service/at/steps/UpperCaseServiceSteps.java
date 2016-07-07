package com.blueagility.strings.service.at.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static junit.framework.TestCase.assertEquals;

/**
 * Automates the steps in the UpperCase.feature file
 */
public class UpperCaseServiceSteps {

    private UpperCaseServiceClient restClient = new UpperCaseServiceClient();
    private String output = null;

    @Given("^the upper case service is running$")
    public void the_upper_case_service_is_running() {
        restClient.ping();
    }

    @When("^the input string \"([^\"]*)\" is passed into the upper case service$")
    public void the_input_string_is_passed_into_the_uppercase_service(String input) {
        output = restClient.upperCase(input);
    }

    @Then("^the resulting output string is \"([^\"]*)\"$")
    public void the_resulting_output_string_is(String expectedResult) {
        assertEquals(expectedResult, output);
    }

}
