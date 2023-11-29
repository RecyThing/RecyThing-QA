package starter.stepdefinitions;

import API_Web.ManageAdmin.DeleteAdmin;
import API_Web.ManageAdmin.GetAllAdmin;
import API_Web.ManageAdmin.GetDetailAdmin;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class ManageAdminSteps {
    @Steps
    GetAllAdmin MA1;

    @Steps
    GetDetailAdmin MA2;

    @Steps
    DeleteAdmin MA3;

    @Given("I set GET method to view All Admin with valid request")
    public void setAllAdminAPIs1(){
        MA1.setGetAllAdmin1();
    }

    @When("I send GET for All Admin endpoint requests to connect to APIs MA1")
    public void sendAllAdminAPIs1(){
        MA1.sendGetAllAdmin1();
    }

    @Then("I receive HTTP response code 200 for view All Admin")
    public void receiveAllAdminAPIs1(){
        MA1.receiveAllAdminResp1();
    }

    @Given("I set POST method to view All Admin with invalid request method")
    public void setAllAdminAPIs2(){
        MA1.setGetAllAdmin2();
    }

    @When("I send POST for All Admin endpoint requests to connect to APIs MA1")
    public void sendAllAdminAPIs2(){
        MA1.sendGetAllAdmin2();
    }

    @Then("I receive HTTP response code 404 for view All Admin")
    public void receiveAllAdminAPIs2(){
        MA1.receiveAllAdminResp2();
    }

    @Given("I set GET method to view detail Admin with valid request")
    public void setDetailAdminAPIs1(){
        MA2.setGetAdmin1();
    }

    @When("I send GET for detail Admin endpoint requests to connect to APIs MA2")
    public void sendDetailAdminAPIs1(){
        MA2.sendGetAdmin1();
    }

    @Then("I receive HTTP response code 200 for view detail Admin")
    public void receiveDetailAdminAPIs1(){
        MA2.receiveAdminResp1();
    }

    @Given("I set POST method to view detail Admin with invalid request method")
    public void setDetailAdminAPIs2(){
        MA2.setGetAdmin2();
    }

    @When("I send POST for detail Admin endpoint requests to connect to APIs MA2")
    public void sendDetailAdminAPIs2(){
        MA2.sendGetAdmin2();
    }

    @Then("I receive HTTP response code 404 for view detail Admin")
    public void receiveDetailAdminAPIs2(){
        MA2.receiveAdminResp2();
    }

    @Given("I set DEL method to delete All Admin with valid request")
    public void setDelAdminAPIs1(){
        MA3.setDelAdmin();
    }

    @When("I send DEL for detail Admin endpoint requests to connect to APIs MA3")
    public void sendDelAdminAPIs1(){
        MA3.sendDelAdmin();
    }

    @Then("I receive HTTP response code 200 for delete Admin")
    public void receiveDelAdminAPIs1(){
        MA3.receiveAdminDelResp();
    }
}
