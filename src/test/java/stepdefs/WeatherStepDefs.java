package stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.HashMap;

public class WeatherStepDefs {
    private double lat;
    private double lon;

    @Given("location coordinates:")
    public void set_coordinates(HashMap<String, Double> params) {
        lat = params.get("latitude"); //-> 52.52
        lon = params.get("longitude"); //-> 13.419998
    }

    @When("we are requesting weather data")
    public void request_weather_data() {

    }

    @Then("main information is:")
    public void check_main_info(HashMap<String, String> params) {

    }

    @Then("current units are:")
    public void check_current_units(HashMap<String, String> params) {

    }

    @Then("current weather is:")
    public void check_current_weather(HashMap<String, String> params) {

    }

    @Then("daily units are:")
    public void check_daily_units(HashMap<String, String> params) {

    }
    //continue with stepDefs
}
