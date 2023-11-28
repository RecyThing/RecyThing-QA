package starter;

import UserReport.ViewUserHistory;
import UserReport.ViewUserHistoryByID;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class UserReportSteps {
    @Steps
    ViewUserHistory vuh;
    @Steps
    ViewUserHistoryByID vuhbi;
    @Given("I set Get View User History Endpoint With Correct Data")
    public void setGetViewUserHistory() {
        vuh.setGetViewUserHistory();
    }

    @When("I send Get View User History request")
    public void sendGetViewUserProfile() {
        vuh.sendGetViewUserProfile();
    }

    @Then("I receive Get View User History response code 200")
    public void receiveWrongGETtViewUserHistoryResponseCode200() {
        vuh.receiveWrongGETtViewUserHistoryResponseCode200();
    }

    @Given("I set POST View User History Endpoint with Wrong HTTP Request")
    public void setViewUserHistoryEndpoint() {
        vuh.setViewUserHistoryEndpoint();
    }

    @When("I send POST View User History HTTP request2")
    public void sendPostViewUserHistoryHttpRequest() {
        vuh.sendPostViewUserHistoryHttpRequest();
    }

    @Then("I receive POST View User History valid HTTP response code 404")
    public void receivePostViewUserHistoryHttpResponseCode405() {
        vuh.receivePostViewUserHistoryHttpResponseCode405();
    }


    @Given("I set Get View User History Endpoint With Wrong URL")
    public void setWrongViewUserHistoryHTTP() {
        vuh.setWrongViewUserHistoryHTTP();
    }

    @When("I send Get View User History HTTP request3")
    public void sendGetViewUserHistoryHttpRequest2() {
        vuh.sendGetViewUserHistoryHttpRequest2();
    }

    @Then("I receive Get View User History valid HTTP response code 404")
    public void receiveWrongPostViewUserHistoryHttpResponseCode404() {
        vuh.receiveWrongPostViewUserHistoryHttpResponseCode404();
    }

    @Given("I set Get View User History By ID Endpoint With Correct Data")
    public void setGetViewUserHistoryByID() {
        vuhbi.setGetViewUserHistoryByID();
    }

    @When("I send Get View User History By ID request")
    public void sendGetViewUserHistoryByID() {
        vuhbi.sendGetViewUserHistoryByID();
    }

    @Then("I receive Get View User History By ID response code 200")
    public void receiveWrongGETtViewUserHistoryByIDResponseCode200() {
        vuhbi.receiveWrongGETtViewUserHistoryByIDResponseCode200();
    }

    @Given("I set POST View User History Endpoint By ID with Wrong HTTP Request")
    public void setViewUserHistoryByIDEndpoint() {
        vuhbi.setViewUserHistoryByIDEndpoint();
    }

    @When("I send POST View User History By ID HTTP request2")
    public void sendPostViewUserHistoryByIDHttpRequest() {
        vuhbi.sendPostViewUserHistoryByIDHttpRequest();
    }

    @Then("I receive POST View User History By ID valid HTTP response code 404")
    public void receivePostViewUserHistoryByIDHttpResponseCode405() {
        vuhbi.receivePostViewUserHistoryByIDHttpResponseCode405();
    }

    @Given("I set Get View User History By ID Endpoint With Wrong URL")
    public void setWrongViewUserHistoryByIDHTTP() {
        vuhbi.setWrongViewUserHistoryByIDHTTP();
    }

    @When("I send Get View User History By ID HTTP request3")
    public void sendGetViewUserHistoryByIDHttpRequest2() {
        vuhbi.sendGetViewUserHistoryByIDHttpRequest2();
    }

    @Then("I receive Get View User History By ID valid HTTP response code 404")
    public void receiveWrongPostViewUserHistoryByIDHttpResponseCode404() {
        vuhbi.receiveWrongPostViewUserHistoryByIDHttpResponseCode404();
    }


}
