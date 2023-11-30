package starter.webstepdefinitions;

import API_Web.ManageUser.DeleteUser;
import API_Web.ManageUser.GetAllUsers;
import API_Web.ManageUser.GetUserByID;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class ManageUserSteps {
    @Steps
    GetAllUsers MU1;

    @Steps
    GetUserByID MU2;

    @Steps
    DeleteUser MU3;

    @Given("I set GET method to view All Users with valid request")
    public void setAllUsersAPIs1(){
        MU1.setGetAllUsers1();
    }

    @When("I send GET for All User endpoint requests to connect to APIs MU1")
    public void sendAllUsersAPIs1(){
        MU1.sendGetAllUsers1();
    }

    @Then("I receive HTTP response code 200 for view All User")
    public void receiveAllUsersAPIs1(){
        MU1.receiveAllUserResp1();
    }

    @Given("I set POST method to view All Users with invalid request method")
    public void setAllUsersAPIs2(){
        MU1.setGetAllUsers2();
    }

    @When("I send POST for All User endpoint requests to connect to APIs MU1")
    public void sendAllUsersAPIs2(){
        MU1.sendGetAllUsers2();
    }

    @Then("I receive HTTP response code 404 for view All User")
    public void receiveAllUsersAPIs2(){
        MU1.receiveAllUserResp2();
    }

    @Given("I set GET method to view User By ID with valid request")
    public void setUserByIDAPIs1(){
        MU2.setGetUser1();
    }

    @When("I send GET for User By ID endpoint requests to connect to APIs MU2")
    public void sendUserByIDAPIs1(){
        MU2.sendGetUser1();
    }

    @Then("I receive HTTP response code 200 for view User By ID")
    public void receiveUserByIDAPIs1(){
        MU2.receiveUserResp1();
    }

    @Given("I set POST method to view User By ID with invalid request method")
    public void setUserByIDAPIs2(){
        MU2.setGetUser2();
    }

    @When("I send POST for User By ID endpoint requests to connect to APIs MU2")
    public void sendUserByIDAPIs2(){
        MU2.sendGetUser2();
    }

    @Then("I receive HTTP response code 404 for view User By ID")
    public void receiveUserByIDAPIs2(){
        MU2.receiveUserResp2();
    }

    @Given("I set DEL method to delete All Users with valid request")
    public void setDelUserAPIs2(){
        MU3.setDelUser();
    }

    @When("I send DEL for User By ID endpoint requests to connect to APIs MU3")
    public void sendDelUserAPIs2(){
        MU3.sendDelUser();
    }

    @Then("I receive HTTP response code 200 for delete User By ID")
    public void receiveDelUserAPIs2(){
        MU3.receiveUserDelResp();
    }
}
