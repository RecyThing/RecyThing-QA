package starter.webstepdefinitions;

import API_Web.ManageExchangePoint.GetAllExchangePoint;
import API_Web.ManageExchangePoint.GetDetailExchangePoint;
import API_Web.ManageExchangePoint.UpdateExchangePoint;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class ManageExchangePointSteps {

    @Steps
    GetAllExchangePoint MEP1;

    @Steps
    GetDetailExchangePoint MEP2;

    @Steps
    UpdateExchangePoint MEP3;

    @Given("I set GET method to view All Exchange Point with valid request")
    public void setAllExchangePointMEP1(){
        MEP1.setGetAllExchangePoint1();
    }

    @When("I send GET for All Exchange Point endpoint requests to connect to APIs MEP1")
    public void sendAllExchangePointMEP1(){
        MEP1.sendGetAllExchangePoint1();
    }

    @Then("I receive HTTP response code 200 for view All Exchange Point")
    public void receiveAllExchangePointMEP1(){
        MEP1.receiveAllExchangePointResp1();
    }

    @Given("I set POST method to view All Exchange Point with invalid request method")
    public void setAllExchangePointMEP2(){
        MEP1.setGetAllExchangePoint2();
    }

    @When("I send POST for All Exchange Point endpoint requests to connect to APIs MEP1")
    public void sendAllExchangePointMEP2(){
        MEP1.sendGetAllExchangePoint2();
    }

    @Then("I receive HTTP response code 404 for view All Exchange Point")
    public void receiveAllExchangePointMEP2(){
        MEP1.receiveAllExchangePointResp2();
    }

    @Given("I set GET method to view Exchange Point with valid request")
    public void setDetailExchangePointMEP1(){
        MEP2.setGetDetailExchangePoint1();
    }

    @When("I send GET for Exchange Point endpoint requests to connect to APIs MEP2")
    public void sendDetailExchangePointMEP1(){
        MEP2.sendGetDetailExchangePoint1();
    }

    @Then("I receive HTTP response code 200 for view Exchange Point")
    public void receiveDetailExchangePointMEP1(){
        MEP2.receiveGetDetailExchangePointResp1();
    }

    @Given("I set POST method to view Exchange Point with invalid request method")
    public void setDetailExchangePointMEP2(){
        MEP2.setGetDetailExchangePoint2();
    }

    @When("I send POST for Exchange Point endpoint requests to connect to APIs MEP2")
    public void sendDetailExchangePointMEP2(){
        MEP2.sendGetDetailExchangePoint2();
    }

    @Then("I receive HTTP response code 404 for view Exchange Point")
    public void receiveDetailExchangePointMEP2(){
        MEP2.receiveGetDetailExchangePointResp2();
    }

    @Given("I set PATCH method to update Exchange Point with valid request")
    public void setUpdateExchangePointMEP(){
        MEP3.setUpdateExchangePoint();
    }

    @When("I send PATCH for update Exchange Point endpoint requests to connect to APIs MEP3")
    public void sendUpdateExchangePointMEP(){
        MEP3.sendPutToUpdateExchangePoint();
    }

    @Then("I receive HTTP response code 200 for update Exchange Point")
    public void receiveUpdateExchangePointMEP(){
        MEP3.receiveUpdateExchangePointResp();
    }
}
