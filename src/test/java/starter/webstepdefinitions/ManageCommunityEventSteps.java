package starter.webstepdefinitions;

import API_Web.ManageCommunityEvent.GetAllCommunityEvent;
import API_Web.ManageCommunityEvent.GetDetailCommunityEvent;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class ManageCommunityEventSteps {

    @Steps
    GetAllCommunityEvent CE1;

    @Steps
    GetDetailCommunityEvent CE2;

    @Given("I set GET method to view All Community Event with valid request")
    public void setAllCommunityEventCE1(){
        CE1.setGetAllCommunityEvent1();
    }

    @When("I send GET for All Community Event endpoint requests to connect to APIs CE1")
    public void sendAllCommunityEventCE1(){
        CE1.sendGetAllCommunityEvent1();
    }

    @Then("I receive HTTP response code 200 for view All Community Event")
    public void receiveAllCommunityEventCE1(){
        CE1.receiveAllCommunityEventResp1();
    }

    @Given("I set POST method to view All Community Event with invalid request method")
    public void setAllCommunityEventCE2(){
        CE1.setGetAllCommunityEvent2();
    }

    @When("I send POST for All Community Event endpoint requests to connect to APIs CE1")
    public void sendAllCommunityEventCE2(){
        CE1.sendGetAllCommunityEvent2();
    }

    @Then("I receive HTTP response code 400 for view All Community Event")
    public void receiveAllCommunityEventCE2(){
        CE1.receiveAllCommunityEventResp2();
    }


    @Given("I set GET method to view detail Community Event with valid request")
    public void setCommunityEventCE1(){
        CE2.setGetDetailCommunityEvent1();
    }

    @When("I send GET for detail Community Event endpoint requests to connect to APIs CE2")
    public void sendCommunityEventCE1(){
        CE2.sendGetDetailCommunityEvent1();
    }

    @Then("I receive HTTP response code 200 for view detail Community Event")
    public void receiveCommunityEventCE1(){
        CE2.receiveGetDetailCommunityEvent1();
    }

    @Given("I set POST method to view detail Community Event with invalid request method")
    public void setCommunityEventCE2(){
        CE2.setGetDetailCommunityEvent2();
    }

    @When("I send POST for detail Community Event endpoint requests to connect to APIs CE2")
    public void sendCommunityEventCE2(){
        CE2.sendGetDetailCommunityEvent2();
    }

    @Then("I receive HTTP response code 400 for view detail Community Event")
    public void receiveCommunityEventCE2(){
        CE2.receiveGetDetailCommunityEventResp2();
    }
}
