package starter.webstepdefinitions;

import API_Web.ManageExchangeTrash.DeleteRecyclesByID;
import API_Web.ManageExchangeTrash.GetAllRecycles;
import API_Web.ManageExchangeTrash.GetDetailRecycles;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class ManageTrashExchangeSteps {

    @Steps
    GetAllRecycles MTE1;

    @Steps
    GetDetailRecycles MTE2;

    @Steps
    DeleteRecyclesByID MTE3;

    @Given("I set GET method to view All Trash Exchange with valid request")
    public void setAllTrashExchangeMTE1(){
        MTE1.setGetAllTrashExchange1();
    }

    @When("I send GET for All Trash Exchange endpoint requests to connect to APIs MTE1")
    public void sendAllTrashExchangeMTE1(){
        MTE1.sendGetAllTrashExchange1();
    }

    @Then("I receive HTTP response code 200 for view All Trash Exchange")
    public void receiveAllTrashExchangeMTE1(){
        MTE1.receiveAllTrashExchangeResp1();
    }

    @Given("I set POST method to view All Trash Exchange with invalid request method")
    public void setAllTrashExchangeMTE2(){
        MTE1.setGetAllTrashExchange2();
    }

    @When("I send POST for All Trash Exchange endpoint requests to connect to APIs MTE1")
    public void sendAllTrashExchangeMTE2(){
        MTE1.sendGetAllTrashExchange2();
    }

    @Then("I receive HTTP response code 404 for view All Trash Exchange")
    public void receiveAllTrashExchangeMTE2(){
        MTE1.receiveAllTrashExchangeResp2();
    }


    @Given("I set GET method to view detail Trash Exchange with valid request")
    public void setDetailTrashExchangeMTE1(){
        MTE2.setGetTrashExchange1();
    }

    @When("I send GET for detail Trash Exchange endpoint requests to connect to APIs MTE2")
    public void sendDetailTrashExchangeMTE1(){
        MTE2.sendGetTrashExchange1();
    }

    @Then("I receive HTTP response code 200 for view detail Trash Exchange")
    public void receiveDetailTrashExchangeMTE1(){
        MTE2.receiveGetTrashExchangeResp1();
    }

    @Given("I set POST method to view detail Trash Exchange with invalid request method")
    public void setDetailTrashExchangeMTE2(){
        MTE2.setGetTrashExchange2();
    }

    @When("I send POST for detail Trash Exchange endpoint requests to connect to APIs MTE2")
    public void sendDetailTrashExchangeMTE2(){
        MTE2.sendGetTrashExchange2();
    }

    @Then("I receive HTTP response code 400 for view detail Trash Exchange")
    public void receiveDetailTrashExchangeMTE2(){
        MTE2.receiveGetTrashExchangeResp2();
    }


    @Given("I set DEL method to delete Trash Exchange with valid request")
    public void setDelTrashExchangeMTE(){
        MTE3.setDelTrashExchange();
    }

    @When("I send DEL for detail Trash Exchange endpoint requests to connect to APIs MTE3")
    public void sendDelTrashExchangeMTE(){
        MTE3.sendDelTrashExchange();
    }

    @Then("I receive HTTP response code 200 for delete Trash Exchange")
    public void receiveDelTrashExchangeMTE(){
        MTE3.receiveTrashExchangeDelResp();
    }
}
