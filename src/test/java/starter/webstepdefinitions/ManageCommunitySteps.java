package starter.webstepdefinitions;

import API_Web.ManageCommunity.DeleteCommunity;
import API_Web.ManageCommunity.GetAllCommunity;
import API_Web.ManageCommunity.GetDetailCommunity;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class ManageCommunitySteps {

    @Steps
    GetAllCommunity C1;

    @Steps
    GetDetailCommunity C2;

    @Steps
    DeleteCommunity C3;

    @Given("I set GET method to view All Community with valid request")
    public void setAllCommunityC1(){
        C1.setGetAllCommunity1();
    }

    @When("I send GET for All Community endpoint requests to connect to APIs C1")
    public void sendAllCommunityC1(){
        C1.sendGetAllCommunity1();
    }

    @Then("I receive HTTP response code 200 for view All Community")
    public void receiveAllCommunityC1(){
        C1.receiveAllCommunityResp1();
    }

    @Given("I set POST method to view All Community with invalid request method")
    public void setAllCommunityC2(){
        C1.setGetAllCommunity2();
    }

    @When("I send POST for All Community endpoint requests to connect to APIs C1")
    public void sendAllCommunityC2(){
        C1.sendGetAllCommunity2();
    }

    @Then("I receive HTTP response code 400 for view All Community")
    public void receiveAllCommunityC2(){
        C1.receiveAllCommunityResp2();
    }


    @Given("I set GET method to view detail Community with valid request")
    public void setCommunityC1(){
        C2.setGetDetailCommunity1();
    }

    @When("I send GET for detail Community endpoint requests to connect to APIs C2")
    public void sendCommunityC1(){
        C2.sendGetDetailCommunity1();
    }

    @Then("I receive HTTP response code 200 for view detail Community")
    public void receiveCommunityC1(){
        C2.receiveGetDetailCommunity1();
    }

    @Given("I set POST method to view detail Community with invalid request method")
    public void setCommunityC2(){
        C2.setGetDetailCommunity2();
    }

    @When("I send POST for detail Community endpoint requests to connect to APIs C2")
    public void sendCommunityC2(){
        C2.sendGetDetailCommunity2();
    }

    @Then("I receive HTTP response code 400 for view detail Community")
    public void receiveCommunityC2(){
        C2.receiveGetDetailCommunityResp2();
    }


    @Given("I set DEL method to delete Community with valid request")
    public void setDelCommunityC1(){
        C3.setDelCommunityByID();
    }

    @When("I send DEL for detail Community endpoint requests to connect to APIs C3")
    public void sendDelCommunityC1(){
        C3.sendDelCommunityByID();
    }

    @Then("I receive HTTP response code 200 for delete Community")
    public void receiveDelCommunityC1(){
        C3.receiveDelCommunityByIDResp();
    }
}
