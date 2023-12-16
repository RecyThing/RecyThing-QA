package starter;

import Mission.ClaimMissionUser;
import Mission.GetDetailMissions;
import Mission.ViewAllMissions;
import Mission.ViewDetailHistoryMission;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class MissionSteps {
@Steps
    ClaimMissionUser cmu;
@Steps
    GetDetailMissions gdm;
@Steps
ViewAllMissions vam;
@Steps
    ViewDetailHistoryMission vdhm;
    @Given("I set Post Claim Mission User Endpoint With Correct Data")
    public void setMissionUserValidEndpoint() {
        cmu.setMissionUserValidEndpoint();
    }

    @When("I send Post Claim Mission User request")
    public void sendPostMissionUserValidHttpRequest() {
        cmu.sendPostMissionUserValidHttpRequest();
    }

    @Then("I receive Post Claim Mission User valid HTTP response code 201")
    public void receivePostMissionUserValidHttpResponseCode201(){
        cmu.receivePostMissionUserValidHttpResponseCode201();}

    @Given("I set Get Claim Mission User Endpoint with Wrong HTTP Request")
    public void setWrongMissionUserValidEndpoint() {
        cmu.setWrongMissionUserValidEndpoint();
    }

    @When("I send Get Claim Mission User HTTP request2")
    public void sendGetMissionUserValidHttpRequest2() {
        cmu.sendGetMissionUserValidHttpRequest2();
    }

    @Then("I receive Get Claim Mission User valid HTTP response code 403")
    public void receiveWrongGetMissionUserValidHttpResponseCode403(){
        cmu.receiveWrongGetMissionUserValidHttpResponseCode403();}

    @Given("I set Post Claim Mission User Endpoint With Wrong Body")
    public void setMissionUserValidApiEndpoint() {
        cmu.setMissionUserValidApiEndpoint();
    }

    @When("I send Post Claim Mission User HTTP request3")
    public void sendCMissionUserValidHttpRequest3() {
        cmu.sendCMissionUserValidHttpRequest3();
    }

    @Then("I receive Post Claim Mission User valid HTTP response code 400")
    public void validateMissionUserValidHttpResponseCode400(){
        cmu.validateMissionUserValidHttpResponseCode400();}

    @Given("I set Get See Detail Mission Endpoint With Correct Data")
    public void setGetSeeDetailMisson() {
        gdm.setGetSeeDetailMisson();
    }

    @When("I send Get See Detail Mission request")
    public void sendGetSeeDetailMisson() {
        gdm.sendGetSeeDetailMisson();
    }

    @Then("I receive Get See Detail Mission valid HTTP response code 200")
    public void receiveWrongGETSeeDetailMissonResponseCode200(){
        gdm.receiveWrongGETSeeDetailMissonResponseCode200();}

    @Given("I set Post See Detail Mission Endpoint with Wrong HTTP Request")
    public void setSeeDetailMissonEndpoint() {
        gdm.setSeeDetailMissonEndpoint();
    }

    @When("I send Post See Detail Mission HTTP request2")
    public void sendPostSeeDetailMissonHttpRequest() {
        gdm.sendPostSeeDetailMissonHttpRequest();
    }

    @Then("I receive Post See Detail Mission valid HTTP response code 404")
    public void receivePostSeeDetailMissonHttpResponseCode405(){
        gdm.receivePostSeeDetailMissonHttpResponseCode405();}

    @Given("I set Get See Detail Mission Endpoint With Wrong Body")
    public void setWrongSeeDetailMissonURL() {
        gdm.setWrongSeeDetailMissonURL();
    }

    @When("I send Get See Detail Mission HTTP request3")
    public void sendGetSeeDetailMissonHttpRequest2() {
        gdm.sendGetSeeDetailMissonHttpRequest2();
    }

    @Then("I receive Get See Detail Mission valid HTTP response code 404")
    public void receiveWrongGetSeeDetailMissonResponseCode404(){
        gdm.receiveWrongGetSeeDetailMissonResponseCode404();}

    @Given("I set Get See Mission Endpoint With Correct Data")
    public void setGetSeeMission() {
        vam.setGetSeeMission();
    }

    @When("I send Get See Mission request")
    public void sendGetSeeMission() {
        vam.sendGetSeeMission();
    }

    @Then("I receive Get See Mission valid HTTP response code 200")
    public void receiveWrongGETSeeMissionResponseCode200(){
        vam.receiveWrongGETSeeMissionResponseCode200();}

    @Given("I set Post See Mission Endpoint with Wrong HTTP Request")
    public void setSeeMissionEndpoint() {
        vam.setSeeMissionEndpoint();
    }

    @When("I send Post See Mission HTTP request2")
    public void sendPostSeeMissionHttpRequest() {
        vam.sendPostSeeMissionHttpRequest();
    }

    @Then("I receive Post See Mission valid HTTP response code 400")
    public void receivePostSeeMissionHttpResponseCode405(){
        vam.receivePostSeeMissionHttpResponseCode405();}

    @Given("I set Get See Mission Endpoint With Wrong Body")
    public void setWrongSeeMissionURL() {
        vam.setGetSeeMission();
    }

    @When("I send Get See Mission HTTP request3")
    public void sendGetSeeMissionHttpRequest2() {
        vam.sendGetSeeMissionHttpRequest2();
    }

    @Then("I receive Get See Mission valid HTTP response code 404")
    public void receiveWrongGetSeeMissionResponseCode404(){
        vam.receiveWrongGetSeeMissionResponseCode404();}

    @Given("I set Get See History Mission Endpoint With Correct Data")
    public void setGetSeeHistoryMission() {
        vdhm.setGetSeeHistoryMission();
    }

    @When("I send Get See History Mission request")
    public void sendGetSeeHistoryMission() {
        vdhm.sendGetSeeHistoryMission();
    }

    @Then("I receive Get See History Mission valid HTTP response code 200")
    public void receiveWrongGETSeeHistoryMissionResponseCode200(){
        vdhm.receiveWrongGETSeeHistoryMissionResponseCode200();}

    @Given("I set Post See History Mission Endpoint with Wrong HTTP Request")
    public void setSeeHistoryMissionEndpoint() {
        vdhm.setSeeHistoryMissionEndpoint();
    }

    @When("I send Post See History Mission HTTP request2")
    public void sendPostSeeHistoryMissionHttpRequest() {
        vdhm.sendPostSeeHistoryMissionHttpRequest();
    }

    @Then("I receive Post See History Mission valid HTTP response code 400")
    public void receivePostSeeHistoryMissionHttpResponseCode405(){
        vdhm.receivePostSeeHistoryMissionHttpResponseCode405();}

    @Given("I set Get See History Mission Endpoint With Wrong Body")
    public void setWrongSeeHistoryMissonURL() {
        vdhm.setWrongSeeHistoryMissonURL();
    }

    @When("I send Get See History Mission HTTP request3")
    public void sendGetSeeHistoryMissionHttpRequest2() {
        vdhm.sendGetSeeHistoryMissionHttpRequest2();
    }

    @Then("I receive Get See History Mission valid HTTP response code 404")
    public void receiveWrongGetSeeHistoryMissionResponseCode404(){
        vdhm.receiveWrongGetSeeHistoryMissionResponseCode404();}
}
