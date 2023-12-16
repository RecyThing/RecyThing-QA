package starter.webstepdefinitions;

import API_Web.ManageDashboard.GetAllDashboardYears;
import API_Web.ManageDashboard.GetMonthlyDashboard;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class ManageDashboardSteps {

    @Steps
    GetMonthlyDashboard MD1;

    @Steps
    GetAllDashboardYears MD2;

    @Given("I set GET method to view Monthly Dashboard with valid request")
    public void setMonthlyDashboardMD1(){
        MD1.setGetAllMonthlyDashboard1();
    }

    @When("I send GET for Monthly Dashboard endpoint requests to connect to APIs MD1")
    public void sendMonthlyDashboardMD1(){
        MD1.sendGetAllMonthlyDashboard1();
    }

    @Then("I receive HTTP response code 200 for view Monthly Dashboard")
    public void receiveMonthlyDashboardMD1(){
        MD1.receiveAllMonthlyDashboardResp1();
    }

    @Given("I set POST method to view Monthly Dashboard with invalid request method")
    public void setMonthlyDashboardMD2(){
        MD1.setGetAllMonthlyDashboard2();
    }

    @When("I send POST for Monthly Dashboard endpoint requests to connect to APIs MD1")
    public void sendMonthlyDashboardMD2(){
        MD1.sendGetAllMonthlyDashboard2();
    }

    @Then("I receive HTTP response code 404 for view Monthly Dashboard")
    public void receiveMonthlyDashboardMD2(){
        MD1.receiveAllMonthlyDashboardResp2();
    }


    @Given("I set GET method to view All Dashboard Years with valid request")
    public void setDashboardYearsMD1(){
        MD2.setGetDashboardYears1();
    }

    @When("I send GET for All Dashboard Years endpoint requests to connect to APIs MD2")
    public void sendDashboardYearsMD1(){
        MD2.sendGetDashboardYears1();
    }

    @Then("I receive HTTP response code 200 for view All Dashboard Years")
    public void receiveDashboardYearsMD1(){
        MD2.receiveDashboardYearsResp1();
    }

    @Given("I set POST method to view All Dashboard Years with invalid request method")
    public void setDashboardYearsMD2(){
        MD2.setGetDashboardYears2();
    }

    @When("I send POST for All Dashboard Years endpoint requests to connect to APIs MD2")
    public void sendDashboardYearsMD2(){
        MD2.sendGetDashboardYears2();
    }

    @Then("I receive HTTP response code 404 for view All Dashboard Years")
    public void receiveDashboardYearsMD2(){
        MD2.receiveDashboardYearsResp2();
    }
}
