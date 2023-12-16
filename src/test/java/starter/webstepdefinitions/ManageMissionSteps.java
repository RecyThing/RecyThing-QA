package starter.webstepdefinitions;

import API_Web.ManageMission.DeleteMissionByID;
import API_Web.ManageMission.GetAllMission;
import API_Web.ManageMission.GetDetailMission;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class ManageMissionSteps {

    @Steps
    GetAllMission MM1;

    @Steps
    GetDetailMission MM2;

    @Steps
    DeleteMissionByID MM3;

    @Given("I set GET method to view All Mission with valid request")
    public void setAllMissionMM1(){
        MM1.setGetAllMission1();
    }

    @When("I send GET for All Mission endpoint requests to connect to APIs MM1")
    public void sendAllMissionMM1(){
        MM1.sendGetAllMission1();
    }

    @Then("I receive HTTP response code 200 for view All Mission")
    public void receiveAllMissionMM1(){
        MM1.receiveAllMissionResp1();
    }

    @Given("I set POST method to view All Mission with invalid request method")
    public void setAllMissionMM2(){
        MM1.setGetAllMission2();
    }

    @When("I send POST for All Mission endpoint requests to connect to APIs MM1")
    public void sendAllMissionMM2(){
        MM1.sendGetAllMission2();
    }

    @Then("I receive HTTP response code 400 for view All Mission")
    public void receiveAllMissionMM2(){
        MM1.receiveAllMissionResp2();
    }

    @Given("I set GET method to view detail Mission with valid request")
    public void setDetailMissionMM1(){
        MM2.setGetDetailMission1();
    }

    @When("I send GET for detail Mission endpoint requests to connect to APIs MM2")
    public void sendDetailMissionMM1(){
        MM2.sendGetDetailMission1();
    }

    @Then("I receive HTTP response code 200 for view detail Mission")
    public void receiveDetailMissionMM1(){
        MM2.receiveGetDetailMission1();
    }

    @Given("I set POST method to view detail Mission with invalid request method")
    public void setDetailMissionMM2(){
        MM2.setGetDetailMission2();
    }

    @When("I send POST for detail Mission endpoint requests to connect to APIs MM2")
    public void sendDetailMissionMM2(){
        MM2.sendGetDetailMission2();
    }

    @Then("I receive HTTP response code 400 for view detail Mission")
    public void receiveDetailMissionMM2(){
        MM2.receiveGetDetailMissionResp2();
    }

    @Given("I set DEL method to delete Mission with valid request")
    public void setDelMissionMM(){
        MM3.setDelMissionByID();
    }

    @When("I send DEL for detail Mission endpoint requests to connect to APIs MM3")
    public void sendDelMissionMM(){
        MM3.sendDelMissionByID();
    }

    @Then("I receive HTTP response code 200 for delete Mission")
    public void receiveDelMissionMM(){
        MM3.receiveDelMissionByIDResp();
    }
}
