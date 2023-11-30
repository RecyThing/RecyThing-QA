package starter.webstepdefinitions;

import API_Web.LoginAdmin.LoginAdmin;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class LoginAdminSteps {
    @Steps
    LoginAdmin login;

    @Given("I set POST method with valid endpoint and body requests Login Admin")
    public void setLoginAPIs1(){
        login.setValidLoginAdminReq();
    }

    @When("I send Login requests to connect to APIs L1")
    public void sendLoginAPIs1(){
        login.sendLoginAdminReq1();
    }

    @Then("I receive HTTP response code 200 for Valid Login Admin")
    public void receiveLoginAPIs1(){
        login.receiveLoginAdminResp1();
    }

//    @Given("I set POST method with valid endpoint and invalid body requests Login Admin")
//    public void setLoginAPIs2(){
//        login.setInvalidLoginAdminReq1();
//    }
//
//    @When("I send Login requests to connect to APIs L2")
//    public void sendLoginAPIs2(){
//        login.sendLoginAdminReq2();
//    }
//
//    @Then("I receive HTTP response code 400 for Invalid Login Admin")
//    public void receiveLoginAPIs2(){
//        login.receiveLoginAdminResp2();
//    }
//
//    @Given("I set GET method with valid endpoint and body requests Login Admin")
//    public void setLoginAPIs3(){
//        login.setInvalidLoginAdminReq2();
//    }
//
//    @When("I send Login requests to connect to APIs L3")
//    public void sendLoginAPIs3(){
//        login.sendLoginAdminReq3();
//    }
//
//    @Then("I receive HTTP response code 400 for Invalid Request Login Admin")
//    public void receiveLoginAPIs3(){
//        login.receiveLoginAdminResp3();
//    }

    @Given("I set POST method with valid endpoint and body requests Login SuperAdmin")
    public void setLoginAPIs4(){
        login.setValidLoginSuperAdminReq();
    }

    @When("I send Login requests to connect to APIs L4")
    public void sendLoginAPIs4(){
        login.sendLoginSuperAdminReq1();
    }

    @Then("I receive HTTP response code 200 for Valid Login SuperAdmin")
    public void receiveLoginAPIs4(){
        login.receiveLoginSuperAdminResp1();
    }

//    @Given("I set POST method with valid endpoint and invalid body requests Login SuperAdmin")
//    public void setLoginAPIs5(){
//        login.setInvalidLoginSuperAdminReq1();
//    }
//
//    @When("I send Login requests to connect to APIs L5")
//    public void sendLoginAPIs5(){
//        login.sendLoginSuperAdminReq2();
//    }
//
//    @Then("I receive HTTP response code 400 for Invalid Login SuperAdmin")
//    public void receiveLoginAPIs5(){
//        login.receiveLoginSuperAdminResp2();
//    }
//
//    @Given("I set GET method with valid endpoint and body requests Login SuperAdmin")
//    public void setLoginAPIs6(){
//        login.setInvalidLoginSuperAdminReq2();
//    }
//
//    @When("I send Login requests to connect to APIs L6")
//    public void sendLoginAPIs6(){
//        login.sendLoginSuperAdminReq3();
//    }
//
//    @Then("I receive HTTP response code 400 for Invalid Request Login SuperAdmin")
//    public void receiveLoginAPIs6(){
//        login.receiveLoginSuperAdminResp3();
//    }
}
