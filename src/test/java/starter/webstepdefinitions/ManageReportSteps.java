package starter.webstepdefinitions;

import API_Web.ManageReport.GetAllReport;
import API_Web.ManageReport.GetDetailReport;
import API_Web.ManageReport.UpdateReport;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class ManageReportSteps {
    @Steps
    GetAllReport MR1;

    @Steps
    GetDetailReport MR2;

    @Steps
    UpdateReport MR3;

    @Given("I set GET method to view All Report with valid request")
    public void setAllReportAPIs1(){
        MR1.setGetAllReport1();
    }

    @When("I send GET for All Report endpoint requests to connect to APIs MR1")
    public void sendAllReportAPIs1(){
        MR1.sendGetAllReport1();
    }

    @Then("I receive HTTP response code 200 for view All Report")
    public void receiveAllReportAPIs1(){
        MR1.receiveAllReportResp1();
    }

    @Given("I set POST method to view All Report with invalid request method")
    public void setAllReportAPIs2(){
        MR1.setGetAllReport2();
    }

    @When("I send POST for All Report endpoint requests to connect to APIs MR1")
    public void sendAllReportAPIs2(){
        MR1.sendGetAllReport2();
    }

    @Then("I receive HTTP response code 404 for view All Report")
    public void receiveAllReportAPIs2(){
        MR1.receiveAllAdminResp2();
    }

    @Given("I set GET method to view detail Report with valid request")
    public void setDetailReportAPIs1(){
        MR2.setDetailReport1();
    }

    @When("I send GET for detail Report endpoint requests to connect to APIs MR2")
    public void sendDetailReportAPIs1(){
        MR2.sendDetailReport1();
    }

    @Then("I receive HTTP response code 200 for view detail Report")
    public void receiveDetailReportAPIs1(){
        MR2.receiveDetailReportResp1();
    }

    @Given("I set PATCH method to view detail Report with invalid request method")
    public void setDetailReportAPIs2(){
        MR2.setDetailReport2();
    }

    @When("I send PATCH for detail Report endpoint requests to connect to APIs MR2")
    public void sendDetailReportAPIs2(){
        MR2.sendDetailReport2();
    }

    @Then("I receive HTTP response code 404 for view detail Report")
    public void receiveDetailReportAPIs2(){
        MR2.receiveDetailReportResp2();
    }

    @Given("I set PATCH method to update Report By ID with valid request")
    public void setUpdateReportAPIs1(){
        MR3.setUpdateReport1();
    }

    @When("I send PATCH for update Report endpoint and body requests to connect to APIs MR3")
    public void sendUpdateReportAPIs1(){
        MR3.sendUpdateReport1();
    }

    @Then("I receive HTTP response code 200 for update Report")
    public void receiveUpdateReportAPIs1(){
        MR3.receiveUpdateReportResp1();
    }

    @Given("I set POST method to update Report By ID with valid request")
    public void setUpdateReportAPIs2(){
        MR3.setUpdateReport2();
    }

    @When("I send POST for update Report endpoint and body requests to connect to APIs MR3")
    public void sendUpdateReportAPIs2(){
        MR3.sendUpdateReport2();
    }

    @Then("I receive HTTP response code 404 for update Report")
    public void receiveUpdateReportAPIs2(){
        MR3.receiveUpdateReportResp2();
    }
}
