package starter.webstepdefinitions;

import API_Web.ManageTrashCategory.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class ManageTrashCategorySteps {
    @Steps
    CreateTrashCategory MTC1;

//    @Steps
//    UpdateTrashCategoryByID MTC2;

    @Steps
    GetAllTrashCategory MTC3;

    @Steps
    GetDetailTrashCategory MTC4;

    @Steps
    DeleteTrashCategoryByID MTC5;

    @Given("I set POST method to create Trash Category 1")
    public void setCreateMTC1(){
        MTC1.setCreateTC1();
    }

    @When("I send POST for create Trash Category with valid body and endpoint requests to connect to APIs MTC1")
    public void sendCreateMTC1(){
        MTC1.sendPostToCreateTC1();
    }

    @Then("I receive HTTP response code 201 for create a Trash Category")
    public void receiveCreateMTC1(){
        MTC1.receiveCreateTCResp1();
    }

    @Given("I set POST method to create Trash Category 2")
    public void setCreateMTC2(){
        MTC1.setCreateTC2();
    }

    @When("I send POST for create a Trash Category with invalid or blank body to connect to APIs MTC1")
    public void sendCreateMTC2(){
        MTC1.sendPostToCreateTC2();
    }

    @Then("I receive HTTP response code 400 for create a Trash Category 2")
    public void receiveCreateMTC2(){
        MTC1.receiveCreateTCResp2();
    }

    @Given("I set GET method to create Trash Category with invalid request method")
    public void setCreateMTC3(){
        MTC1.setCreateTC3();
    }

    @When("I send GET for create Trash Category with valid body and endpoint requests to connect to APIs MTC1")
    public void sendCreateMTC3(){
        MTC1.sendGetToCreateTC3();
    }

    @Then("I receive HTTP response code 400 for create a Trash Category 3")
    public void receiveCreateMTC3(){
        MTC1.receiveCreateTCResp3();
    }

//    @Given("I set PUT method to update Trash Category")
//    public void setUpdateMTC1(){
//        MTC2.setUpdateTC1();
//    }
//
//    @When("I send PUT for create Trash Category with valid body and endpoint requests to connect to APIs MTC2")
//    public void sendUpdateMTC1(){
//        MTC2.sendPutToUpdateTC1();
//    }
//
//    @Then("I receive HTTP response code 200 for update a Trash Category")
//    public void receiveUpdateMTC1(){
//        MTC2.receiveUpdateTCResp1();
//    }
//
//    @Given("I set GET method to update Trash Category with invalid request method")
//    public void setUpdateMTC2(){
//        MTC2.setUpdateTC2();
//    }
//
//    @When("I send GET for update Trash Category with valid body and endpoint requests to connect to APIs MTC2")
//    public void sendUpdateMTC2(){
//        MTC2.sendPutToUpdateTC2();
//    }
//
//    @Then("I receive HTTP response code 400 for update a Trash Category")
//    public void receiveUpdateMTC2(){
//        MTC2.receiveUpdateTCResp2();
//    }

    @Given("I set GET method to view All Trash Category with valid request")
    public void setGetAllMTC1(){
        MTC3.setGetAllTC1();
    }

    @When("I send GET for Trash Category endpoint requests to connect to APIs MTC3")
    public void sendGetAllMTC1(){
        MTC3.sendGetAllTC1();
    }

    @Then("I receive HTTP response code 200 for view All Trash Category")
    public void receiveGetAllMTC1(){
        MTC3.receiveAllTCResp1();
    }

    @Given("I set POST method to view All Trash Category with invalid request method")
    public void setGetAllMTC2(){
        MTC3.setGetAllTC2();
    }

    @When("I send POST for All Trash Category endpoint requests to connect to APIs MTC3")
    public void sendGetAllMTC2(){
        MTC3.sendGetAllTC2();
    }

    @Then("I receive HTTP response code 404 for view All Trash Category")
    public void receiveGetAllMTC2(){
        MTC3.receiveAllTCResp2();
    }

    @Given("I set GET method to view detail Trash Category with valid request")
    public void setGetMTC1(){
        MTC4.setGetTC1();
    }

    @When("I send GET for detail Trash Category endpoint requests to connect to APIs MTC4")
    public void sendGetMTC1(){
        MTC4.sendGetTC1();
    }

    @Then("I receive HTTP response code 200 for view detail Trash Category")
    public void receiveGetMTC1(){
        MTC4.receiveTCResp1();
    }

    @Given("I set POST method to view detail Trash Category with invalid request method")
    public void setGetMTC2(){
        MTC4.setGetTC2();
    }

    @When("I send POST for detail Trash Category endpoint requests to connect to APIs MTC4")
    public void sendGetMTC2(){
        MTC4.sendGetTC2();
    }

    @Then("I receive HTTP response code 400 for view detail Trash Category")
    public void receiveGetMTC2(){
        MTC4.receiveTCResp2();
    }

    @Given("I set DEL method to delete Trash Category with valid request")
    public void setDelMTC1(){
        MTC5.setDelTC();
    }

    @When("I send DEL for Trash Category endpoint requests to connect to APIs MTC5")
    public void sendDelMTC1(){
        MTC5.sendDelTC();
    }

    @Then("I receive HTTP response code 200 for delete a Trash Category")
    public void receiveDelMTC1(){
        MTC5.receiveTCDelResp();
    }
}
