package starter;

import DropPointFolder.DropPoint;
import DropPointFolder.DropPointByID;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class DropPointSteps {
    @Steps
    DropPoint dp;
    @Steps
    DropPointByID dpbi;

    @Given("I set Get Drop Point Endpoint With Correct Data")
    public void setGetDropPoint() {
        dp.setGetDropPoint();
    }

    @When("I send Get Drop Point request")
    public void sendGetDropPoint() {
        dp.sendGetDropPoint();
    }

    @Then("I receive Get Drop Point valid HTTP response code 200")
    public void receiveWrongGETDropPointResponseCode200(){
        dp.receiveWrongGETDropPointResponseCode200();}

    @Given("I set POST Drop Point Endpoint with Wrong HTTP Request")
    public void setDropPointEndpoint() {
        dp.setDropPointEndpoint();
    }

    @When("I send POST Drop Point HTTP request2")
    public void sendPostDropPointHttpRequest() {
        dp.sendPostDropPointHttpRequest();
    }

    @Then("I receive POST Drop Point valid HTTP response code 405")
    public void receivePostDropPointHttpResponseCode405(){
        dp.receivePostDropPointHttpResponseCode405();}

    @Given("I set Get Drop Point Endpoint With Wrong URL")
    public void setWrongDropPointURL() {
        dp.setWrongDropPointURL();
    }

    @When("I send Get Drop Point HTTP request3")
    public void sendGetDropPointHttpRequest2() {
        dp.sendGetDropPointHttpRequest2();
    }

    @Then("I receive Get Drop Point valid HTTP response code 404")
    public void receiveWrongGetDropPointURLResponseCode404(){
        dp.receiveWrongGetDropPointURLResponseCode404();}

    @Given("I set Get Drop Point By ID Endpoint With Correct Data")
    public void setGetDropPointByID() {
        dpbi.setGetDropPointByID();
    }

    @When("I send Get Drop Point By ID request")
    public void sendGetDropPointByID() {
        dpbi.sendGetDropPointByID();
    }

    @Then("I receive Get Drop Point By ID valid HTTP response code 200")
    public void receiveWrongGETDropPointByIDResponseCode200(){
        dpbi.receiveWrongGETDropPointByIDResponseCode200();}

    @Given("I set POST Drop Point By ID Endpoint with Wrong HTTP Request")
    public void setDropPointByIDEndpoint() {
        dpbi.setDropPointByIDEndpoint();
    }

    @When("I send POST Drop Point By ID HTTP request2")
    public void sendPostDropPointByIDHttpRequest() {
        dpbi.sendPostDropPointByIDHttpRequest();
    }

    @Then("I receive POST Drop Point By ID valid HTTP response code 405")
    public void receivePostDropPointByIDHttpResponseCode405(){
        dpbi.receivePostDropPointByIDHttpResponseCode405();}

    @Given("I set Get Drop Point By ID Endpoint With Wrong URL")
    public void setWrongDropPointByIDURL() {
        dpbi.setWrongDropPointByIDURL();
    }

    @When("I send Get Drop Point By ID HTTP request3")
    public void sendGetArticlesByIDHttpRequest2() {
        dpbi.sendGetArticlesByIDHttpRequest2();
    }

    @Then("I receive Get Drop Point By ID valid HTTP response code 404")
    public void receiveWrongGetDropPointByIDURLResponseCode404(){
        dpbi.receiveWrongGetDropPointByIDURLResponseCode404();}
}
