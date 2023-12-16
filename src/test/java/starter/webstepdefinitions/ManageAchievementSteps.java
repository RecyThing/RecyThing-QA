package starter.webstepdefinitions;

import API_Web.ManageAcheivement.GetAllAchievements;
import API_Web.ManageAcheivement.UpdatePointAchievement;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class ManageAchievementSteps {

    @Steps
    GetAllAchievements MPA1;

    @Steps
    UpdatePointAchievement MPA2;

    @Given("I set GET method to view Achievement with valid request")
    public void setAllAchievementMD1(){
        MPA1.setGetAllAchievement1();
    }

    @When("I send GET for Achievement endpoint requests to connect to APIs MPA1")
    public void sendAllAchievementMD1(){
        MPA1.sendGetAllAchievement1();
    }

    @Then("I receive HTTP response code 200 for view Achievement")
    public void receiveAllAchievementMD1(){
        MPA1.receiveAllAchievementResp1();
    }

    @Given("I set POST method to view Achievement with invalid request method")
    public void setAllAchievementMD2(){
        MPA1.setGetAllAchievement2();
    }

    @When("I send POST for Achievement endpoint requests to connect to APIs MPA1")
    public void sendAllAchievementMD2(){
        MPA1.sendGetAllAchievement2();
    }

    @Then("I receive HTTP response code 404 for view Achievement")
    public void receiveAllAchievementMD2(){
        MPA1.receiveAllAchievementResp2();
    }

    @Given("I set GET method to update Point Achievement with valid request")
    public void setUpdatePointAchievementMD1(){
        MPA2.setUpdatePointAchievement();
    }

    @When("I send GET for update Point Achievement endpoint requests to connect to APIs MPA2")
    public void sendUpdatePointAchievementMD1(){
        MPA2.sendPutToUpdatePointAchievement();
    }

    @Then("I receive HTTP response code 200 for update Point Achievement")
    public void receiveUpdatePointAchievementMD1(){
        MPA2.receiveUpdatePointAchievementResp();
    }
}
