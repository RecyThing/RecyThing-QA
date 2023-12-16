package starter.webstepdefinitions;

import API_Web.ManageMissionApprovals.GetAllMissionApprovals;
import API_Web.ManageMissionApprovals.GetDetailMissionApproval;
import API_Web.ManageMissionApprovals.UpdateMissionApprovals;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class ManageMissionApprovalsSteps {

    @Steps
    GetAllMissionApprovals MMA1;

    @Steps
    GetDetailMissionApproval MMA2;

    @Steps
    UpdateMissionApprovals MMA3;

    @Given("I set GET method to view All Mission Approvals with valid request")
    public void setAllMissionApprovalsMMA1(){
        MMA1.setGetAllMissionApprovals1();
    }

    @When("I send GET for All Mission Approvals endpoint requests to connect to APIs MMA1")
    public void sendAllMissionApprovalsMMA1(){
        MMA1.sendGetAllMissionApprovals1();
    }

    @Then("I receive HTTP response code 200 for view All Mission Approvals")
    public void receiveAllMissionApprovalsMMA1(){
        MMA1.receiveAllMissionApprovalsResp1();
    }

    @Given("I set POST method to view All Mission Approvals with invalid request method")
    public void setAllMissionApprovalsMMA2(){
        MMA1.setGetAllMissionApprovals2();
    }

    @When("I send POST for All Mission Approvals endpoint requests to connect to APIs MMA1")
    public void sendAllMissionApprovalsMMA2(){
        MMA1.sendGetAllMissionApprovals2();
    }

    @Then("I receive HTTP response code 404 for view All Mission Approvals")
    public void receiveAllMissionApprovalsMMA2(){
        MMA1.receiveAllMissionApprovalsResp2();
    }

    @Given("I set GET method to view Mission Approvals with valid request")
    public void setDetailMissionApprovalsMMA1(){
        MMA2.setGetDetailMissionApproval1();
    }

    @When("I send GET for Mission Approvals endpoint requests to connect to APIs MMA2")
    public void sendDetailMissionApprovalsMMA1(){
        MMA2.sendGetDetailMissionApproval1();
    }

    @Then("I receive HTTP response code 200 for view Mission Approvals")
    public void receiveDetailMissionApprovalsMMA1(){
        MMA2.receiveGetDetailMissionApprovalResp1();
    }

    @Given("I set POST method to view Mission Approvals with invalid request method")
    public void setDetailMissionApprovalsMMA2(){
        MMA2.setGetDetailMissionApproval2();
    }

    @When("I send POST for Mission Approvals endpoint requests to connect to APIs MMA2")
    public void sendDetailMissionApprovalsMMA2(){
        MMA2.sendGetDetailMissionApproval2();
    }

    @Then("I receive HTTP response code 404 for view Mission Approvals")
    public void receiveDetailMissionApprovalsMMA2(){
        MMA2.receiveGetDetailMissionApprovalResp2();
    }

    @Given("I set PUT method to update Mission Approvals with valid request")
    public void setUpdateMissionApprovalsMMA(){
        MMA3.setUpdateMissionApprovals();
    }

    @When("I send PUT for update Mission Approvals endpoint requests to connect to APIs MMA3")
    public void sendUpdateMissionApprovalsMMA(){
        MMA3.sendPutToUpdateMissionApprovals();
    }

    @Then("I receive HTTP response code 200 for update Mission Approvals")
    public void receiveUpdateMissionApprovalsMMA(){
        MMA3.receiveUpdateMissionApprovalsResp();
    }
}
