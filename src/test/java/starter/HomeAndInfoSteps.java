package starter;

import HomeandInfo.Achievement;
import HomeandInfo.Faq;
import HomeandInfo.FaqByID;
import HomeandInfo.RecyBot;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class HomeAndInfoSteps {
    @Steps
    Faq faq;
    @Steps
    FaqByID fib;
    @Steps
    RecyBot rb;
    @Steps
    Achievement A;

    @Given("I set Get FAQ Endpoint With Correct Data")
    public void setGetFAQ() {
        faq.setGetFAQ();
    }

    @When("I send Get FAQ request")
    public void sendGetFAQ() {
        faq.sendGetFAQ();
    }

    @Then("I receive Get FAQ valid HTTP response code 200")
    public void receiveWrongGETFAQResponseCode200(){
        faq.receiveWrongGETFAQResponseCode200();
    }

    @Given("I set POST FAQ Endpoint with Wrong HTTP Request")
    public void setFAQEndpoint() {
        faq.setFAQEndpoint();
    }

    @When("I send POST FAQ HTTP request2")
    public void sendPostFAQHttpRequest() {
        faq.sendPostFAQHttpRequest();
    }

    @Then("I receive POST FAQ valid HTTP response code 405")
    public void receivePostFAQHttpResponseCode405(){
        faq.receivePostFAQHttpResponseCode405();
    }

    @Given("I set Get FAQ Endpoint With Wrong URL")
    public void setWrongFAQURL() {
        faq.setWrongFAQURL();
    }

    @When("I send Get FAQ HTTP request3")
    public void sendGetFAQHttpRequest2() {
        faq.sendGetFAQHttpRequest2();
    }

    @Then("I receive Get FAQ valid HTTP response code 404")
    public void receiveWrongPostFAQURLResponseCode404(){
        faq.receiveWrongPostFAQURLResponseCode404();
    }

    @Given("I set Get FAQ with ID Endpoint With Correct Data")
    public void setGetFAQWithID() {
        fib.setGetFAQWithID();
    }

    @When("I send Get FAQ with ID request")
    public void sendGetFAQWithID() {
        fib.sendGetFAQWithID();
    }

    @Then("I receive Get FAQ with ID valid HTTP response code 200")
    public void receiveWrongGETFAQWithIDResponseCode200(){
        fib.receiveWrongGETFAQWithIDResponseCode200();
    }

    @Given("I set POST FAQ with ID Endpoint with Wrong HTTP Request")
    public void setFAQWithIDEndpoint() {
        fib.setFAQWithIDEndpoint();
    }

    @When("I send POST FAQ with ID HTTP request2")
    public void sendPostFAQWithIDHttpRequest() {
        fib.sendPostFAQWithIDHttpRequest();
    }

    @Then("I receive POST FAQ with ID valid HTTP response code 405")
    public void receivePostFAQWithIDHttpResponseCode405(){
        fib.receivePostFAQWithIDHttpResponseCode405();
    }

    @Given("I set Get FAQ with ID Endpoint With Wrong URL")
    public void setWrongFAQWithIDURL() {
        fib.setWrongFAQWithIDURL();
    }

    @When("I send Get FAQ with ID HTTP request3")
    public void sendGetFAQWithIDHttpRequest2() {
        fib.sendGetFAQWithIDHttpRequest2();
    }

    @Then("I receive Get FAQ with ID valid HTTP response code 404")
    public void receiveWrongPostFAQWithIDURLResponseCode404(){
        fib.receiveWrongPostFAQWithIDURLResponseCode404();
    }

    @Given("I set Post RecyBot Endpoint With Correct Data")
    public void setRecyBotEndpoint() {
        rb.setRecyBotEndpoint();
    }

    @When("I send Post RecyBot request")
    public void sendPostRecyBotHttpRequest() {
        rb.sendPostRecyBotHttpRequest();
    }

    @Then("I receive Post RecyBot valid HTTP response code 200")
    public void receivePostRecyBotHttpResponseCode200(){
        rb.receivePostRecyBotHttpResponseCode200();
    }

    @Given("I set Get RecyBot Endpoint with Wrong HTTP Request")
    public void setWrongRecyBotEndpoint() {
        rb.setWrongRecyBotEndpoint();
    }

    @When("I send Get RecyBot HTTP request2")
    public void sendGetLoginHttpRequest2() {
        rb.sendGetLoginHttpRequest2();
    }

    @Then("I receive Get RecyBot valid HTTP response code 405")
    public void receiveWrongPostRecyBotHttpResponseCode405(){
        rb.receiveWrongPostRecyBotHttpResponseCode405();
    }

    @Given("I set Post RecyBot Endpoint With Wrong URL")
    public void setRecyBotApiEndpoint() {
        rb.setRecyBotApiEndpoint();
    }

    @When("I send Post RecyBot HTTP request3")
    public void sendRecyBotHttpRequest3() {
        rb.sendRecyBotHttpRequest3();
    }

    @Then("I receive Post RecyBot valid HTTP response code 400")
    public void validateRecyBotHttpResponseCode400(){
        rb.validateRecyBotHttpResponseCode400();
    }

    @Given("I set Get Achievement Endpoint With Correct Data")
    public void setGetAchievements() {
        A.setGetAchievements();
    }

    @When("I send Get Achievement request")
    public void sendGetAchievements() {
        A.sendGetAchievements();
    }

    @Then("I receive Get Achievement valid HTTP response code 200")
    public void receiveGETAchievementsResponseCode200(){
        A.receiveGETAchievementsResponseCode200();
    }

    @Given("I set POST Achievement Endpoint with Wrong HTTP Request")
    public void setAchievementsEndpoint() {
        A.setGetAchievements();
    }

    @When("I send POST Achievement HTTP request2")
    public void sendPostAchievementsHttpRequest() {
        A.sendPostAchievementsHttpRequest();
    }

    @Then("I receive POST Achievement valid HTTP response code 405")
    public void receivePostAchievementsHttpResponseCode405(){
        A.receivePostAchievementsHttpResponseCode405();
    }


    @Given("I set Get Achievement Endpoint With Wrong URL")
    public void setWrongAchievementsURL() {
        A.setWrongAchievementsURL();
    }

    @When("I send Get Achievement HTTP request3")
    public void sendGetAchievementsHttpRequest2() {
        A.sendGetAchievementsHttpRequest2();
    }

    @Then("I receive Get Achievement valid HTTP response code 404")
    public void receiveWrongGetAchievementsResponseCode404(){
        A.receiveWrongGetAchievementsResponseCode404();
    }



}
