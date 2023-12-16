package starter.webstepdefinitions;

import API_Web.ManageDropPoint.DeleteDropPoint;
import API_Web.ManageDropPoint.GetAllDropPoint;
import API_Web.ManageDropPoint.GetDetailDropPoint;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class ManageDropPointSteps {

    @Steps
    GetAllDropPoint MDP1;

    @Steps
    GetDetailDropPoint MDP2;

    @Steps
    DeleteDropPoint MDP3;

    @Given("I set GET method to view All Drop Point with valid request")
    public void setAllDropPointMDP1(){
        MDP1.setGetAllDropPoint1();
    }

    @When("I send GET for All Drop Point endpoint requests to connect to APIs MDP1")
    public void sendAllDropPointMDP1(){
        MDP1.sendGetAllDropPoint1();
    }

    @Then("I receive HTTP response code 200 for view All Drop Point")
    public void receiveAllDropPointMDP1(){
        MDP1.receiveAllDropPointResp1();
    }

    @Given("I set POST method to view All Drop Point with invalid request method")
    public void setAllDropPointMDP2(){
        MDP1.setGetAllDropPoint2();
    }

    @When("I send POST for All Drop Point endpoint requests to connect to APIs MDP1")
    public void sendAllDropPointMDP2(){
        MDP1.sendGetAllDropPoint2();
    }

    @Then("I receive HTTP response code 400 for view All Drop Point")
    public void receiveAllDropPointMDP2(){
        MDP1.receiveAllDropPointResp2();
    }


    @Given("I set GET method to view detail Drop Point with valid request")
    public void setDropPointMDP1(){
        MDP2.setGetDetailDropPoint1();
    }

    @When("I send GET for detail Drop Point endpoint requests to connect to APIs MDP2")
    public void sendDropPointMDP1(){
        MDP2.sendGetDetailDropPoint1();
    }

    @Then("I receive HTTP response code 200 for view detail Drop Point")
    public void receiveDropPointMDP1(){
        MDP2.receiveGetDetailDropPoint1();
    }

    @Given("I set POST method to view detail Drop Point with invalid request method")
    public void setDropPointMDP2(){
        MDP2.setGetDetailDropPoint2();
    }

    @When("I send POST for detail Drop Point endpoint requests to connect to APIs MDP2")
    public void sendDropPointMDP2(){
        MDP2.sendGetDetailDropPoint2();
    }

    @Then("I receive HTTP response code 400 for view detail Drop Point")
    public void receiveDropPointMDP2(){
        MDP2.receiveGetDetailDropPointResp2();
    }


    @Given("I set DEL method to delete Drop Point with valid request")
    public void setDelDropPointMDP1(){
        MDP3.setDelDropPointByID();
    }

    @When("I send DEL for detail Drop Point endpoint requests to connect to APIs MDP3")
    public void sendDelDropPointMDP1(){
        MDP3.sendDelDropPointByID();
    }

    @Then("I receive HTTP response code 200 for delete Drop Point")
    public void receiveDelDropPointMDP1(){
        MDP3.receiveDelDropPointByIDResp();
    }
}
