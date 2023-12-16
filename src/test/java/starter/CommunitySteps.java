package starter;

import Community.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class CommunitySteps {
    @Steps
    JoinCommunity jc;
    @Steps
    ViewAllCommunity vac;
    @Steps
    ViewAllEventByIDCommunity vaebic;
    @Steps
    ViewDetailCommunityByID vdcbi;
    @Steps
    ViewDetailEvent vde;

    @Given("I set POST Join Community Endpoint With Correct Data")
    public void setWrongJoinCommunityEndpointEndpoint() {
        jc.setWrongJoinCommunityEndpointEndpoint();
    }

    @When("I send POST Join Community request")
    public void sendPostWrongJoinCommunityEndpointHttpRequest() {
        jc.sendPostWrongJoinCommunityEndpointHttpRequest();
    }

    @Then("I receive POST Join Community valid HTTP response code 200")
    public void receivePostJoinCommunityHttpResponseCode200(){
        jc.receivePostJoinCommunityHttpResponseCode200();
    }

    @Given("I set Put Join Community Endpoint with Wrong HTTP Request")
    public void setWrongJoinCommunityEndpoint() {
        jc.setWrongJoinCommunityEndpoint();
    }

    @When("I send Put Join Community HTTP request2")
    public void sendPutJoinCommunityHttpRequest2() {
        jc.sendPutJoinCommunityHttpRequest2();
    }

    @Then("I receive Put Join Community valid HTTP response code 404")
    public void receiveWrongJoinCommunityPointHttpResponseCode405(){
        jc.receiveWrongJoinCommunityPointHttpResponseCode405();
    }

    @Given("I set POST Join Community Endpoint With Wrong URL")
    public void setJoinCommunityApiEndpoint() {
        jc.setWrongJoinCommunityEndpointEndpoint();
    }

    @When("I send POST Join Community HTTP request3")
    public void sendJoinCommunityHttpRequest3() {
        jc.sendJoinCommunityHttpRequest3();
    }

    @Then("I receive POST Join Community valid HTTP response code 404")
    public void validateJoinCommunityHttpResponseCode400(){
        jc.validateJoinCommunityHttpResponseCode400();
    }

    @Given("I set Get All Community Endpoint With Correct Data")
    public void setGetCommunity() {
        vac.setGetCommunity();
    }

    @When("I send Get All Community request")
    public void sendGetCommunity() {
        vac.sendGetCommunity();
    }

    @Then("I receive Get All Community valid HTTP response code 200")
    public void receiveWrongGETCommunityResponseCode200(){
        vac.receiveWrongGETCommunityResponseCode200();
    }

    @Given("I set POST All Community Endpoint with Wrong HTTP Request")
    public void setCommunityEndpoint() {
        vac.setCommunityEndpoint();
    }

    @When("I send POST All Community HTTP request2")
    public void sendPostCommunityHttpRequest() {
        vac.sendPostCommunityHttpRequest();
    }

    @Then("I receive POST All Community valid HTTP response code 404")
    public void receivePostCommunityHttpResponseCode405(){
        vac.receivePostCommunityHttpResponseCode405();
    }

    @Given("I set Get All Community Endpoint With Wrong URL")
    public void setWrongCommunityCategoryURL() {
        vac.setWrongCommunityCategoryURL();
    }

    @When("I send Get All Community HTTP request3")
    public void sendGetCommunityHttpRequest2() {
        vac.sendGetCommunityHttpRequest2();
    }

    @Then("I receive Get All Community valid HTTP response code 404")
    public void receiveWrongGetAllCommunityURLResponseCode404(){
        vac.receiveWrongGetAllCommunityURLResponseCode404();
    }

    @Given("I set Get See Event Community Endpoint With Correct Data")
    public void setGetCommunityEvent() {
        vaebic.setGetCommunityEvent();
    }

    @When("I send Get See Event Community request")
    public void sendGetCommunityEvent() {
        vaebic.sendGetCommunityEvent();
    }

    @Then("I receive Get See Event Community valid HTTP response code 200")
    public void receiveWrongGETCommunityEventResponseCode200(){
        vaebic.receiveWrongGETCommunityEventResponseCode200();
    }

    @Given("I set POST See Event Community Endpoint with Wrong HTTP Request")
    public void setCommunityEventEndpoint() {
        vaebic.setCommunityEventEndpoint();
    }

    @When("I send POST See Event Community HTTP request2")
    public void sendPostCommunityEventHttpRequest() {
        vaebic.sendPostCommunityEventHttpRequest();
    }

    @Then("I receive POST See Event Community valid HTTP response code 404")
    public void receivePostCommunityEventHttpResponseCode405(){
        vaebic.receivePostCommunityEventHttpResponseCode405();
    }

    @Given("I set Get See Event Community Endpoint With Wrong URL")
    public void setWrongCommunityEventCategoryURL() {
        vaebic.setWrongCommunityEventCategoryURL();
    }

    @When("I send Get See Event Community HTTP request3")
    public void sendGetCommunityEventHttpRequest2() {
        vaebic.sendGetCommunityEventHttpRequest2();
    }

    @Then("I receive Get See Event Community valid HTTP response code 404")
    public void receiveWrongGetAllCommunityEventURLResponseCode404(){
        vaebic.receiveWrongGetAllCommunityEventURLResponseCode404();
    }

    @Given("I set Get Detail Community Endpoint With Correct Data")
    public void setGetDetailCommunityCategory() {
        vdcbi.setGetDetailCommunityCategory();
    }

    @When("I send Get Detail Community request")
    public void sendGetDetailCommunityCategory() {
        vdcbi.sendGetDetailCommunityCategory();
    }

    @Then("I receive Get Detail Community valid HTTP response code 200")
    public void receiveWrongGETDetailCommunityResponseCode200(){
        vdcbi.receiveWrongGETDetailCommunityResponseCode200();
    }

    @Given("I set Put Detail Community Endpoint with Wrong HTTP Request")
    public void setDetailCommunityEndpoint() {
        vdcbi.setDetailCommunityEndpoint();
    }

    @When("I send Put Detail Community HTTP request2")
    public void sendPostDetailCommunityHttpRequest() {
        vdcbi.sendPostDetailCommunityHttpRequest();
    }

    @Then("I receive Put Detail Community valid HTTP response code 404")
    public void receivePostDetailCommunityHttpResponseCode405(){
        vdcbi.receivePostDetailCommunityHttpResponseCode405();
    }

    @Given("I set Get Detail Community Endpoint With Wrong URL")
    public void setWrongDetailCommunityURL() {
        vdcbi.setWrongDetailCommunityURL();
    }

    @When("I send Get Detail Community HTTP request3")
    public void sendGetDetailCommunityHttpRequest2() {
        vdcbi.sendGetDetailCommunityHttpRequest2();
    }

    @Then("I receive Get Detail Community valid HTTP response code 404")
    public void receiveWrongGetDetailCommunityURLResponseCode404(){
        vdcbi.receiveWrongGetDetailCommunityURLResponseCode404();
    }

    @Given("I set Get See Detail Event Community Endpoint With Correct Data")
    public void setGetCommunityDetailEvent() {
        vde.setGetCommunityDetailEvent();
    }

    @When("I send Get See Detail Event Community request")
    public void sendGetCommunityDetailEvent() {
        vde.sendGetCommunityDetailEvent();
    }

    @Then("I receive Get See Detail Event Community valid HTTP response code 200")
    public void receiveWrongGETCommunityEventDetailResponseCode200(){
        vde.receiveWrongGETCommunityEventDetailResponseCode200();
    }

    @Given("I set POST See Detail Event Community Endpoint with Wrong HTTP Request")
    public void setCommunityEventDetailEndpoint() {
        vde.setCommunityEventDetailEndpoint();
    }

    @When("I send POST See Detail Event Community HTTP request2")
    public void sendPostCommunityEventDetailHttpRequest() {
        vde.sendPostCommunityEventDetailHttpRequest();
    }

    @Then("I receive POST See Detail Event Community valid HTTP response code 404")
    public void receivePostCommunityEventDetailHttpResponseCode405(){
        vde.receivePostCommunityEventDetailHttpResponseCode405();
    }

    @Given("I set Get See Detail Event Community Endpoint With Wrong URL")
    public void setWrongCommunityEventDetailCategoryURL() {
        vde.setWrongCommunityEventDetailCategoryURL();
    }

    @When("I send Get See Detail Event Community HTTP request3")
    public void sendGetCommunityEventDetailHttpRequest2() {
        vde.sendGetCommunityEventDetailHttpRequest2();
    }

    @Then("I receive Get See Detail Event Community valid HTTP response code 404")
    public void receiveWrongGetAllCommunityEventDetailURLResponseCode404(){
        vde.receiveWrongGetAllCommunityEventDetailURLResponseCode404();
    }
}
