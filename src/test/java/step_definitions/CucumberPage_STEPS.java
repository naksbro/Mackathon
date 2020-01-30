package step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import step_definitions.step_impl.CucumberPage_impl;
import util.Driver;

public class CucumberPage_STEPS {

    private static WebDriver driver = Driver.getDriver();
    CucumberPage_impl cuke_impl = new CucumberPage_impl();

    @When("User navigates to {string} page")
    public void user_navigates_to_page(String string) {
       cuke_impl.navigateToPage(string);
    }

    @Then("Verifies {string} page Trending courses")
    public void verifies_page_Trending_courses(String string) {
        cuke_impl.getTrending(string);
    }
}
